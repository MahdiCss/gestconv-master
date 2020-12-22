package tn.iit.examjee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import tn.iit.examjee.dao.ConventionRepository;
import tn.iit.examjee.entities.Convention;

import java.util.List;

@Controller
@RequestMapping(value = "Convention")
public class ConventionController {
    @Autowired
    private ConventionRepository conventionRepository;
    @RequestMapping(value="/Index")
    public String Index(Model model, @RequestParam(name = "page",defaultValue = "0")int p,
                        @RequestParam(name = "motCle",defaultValue = "")String mc){
        Page<Convention> cnv=conventionRepository.ChercherConvention("%"+mc+"%",PageRequest.of(p,5));
        int pageCount=cnv.getTotalPages();
        int[] pages=new int[pageCount];
        for(int i=0;i<pageCount;i++){
            pages[i]=i;
        }
        model.addAttribute("pages",pages);
        model.addAttribute("pageCourante",p);
        model.addAttribute("motCle",mc);
        model.addAttribute("convention",cnv);
        return "convention";
    }
    @RequestMapping(value="/form",method = RequestMethod.GET)
    public String formConvention(Model model){
        model.addAttribute("convention",new Convention());
        return "formConvention";
    }
    @RequestMapping(value="/SaveConvention",method = RequestMethod.POST)
    public String save(Convention cnv){
        conventionRepository.save(cnv);
        return "redirect:Index";
    }
    @RequestMapping(value="/supprimer")
    public String supprimer(long id){
        conventionRepository.deleteById(id);
        return "redirect:Index";
    }
    @RequestMapping(value="/edit")
    public String edit(long id,Model model){
        Convention cvn=conventionRepository.getOne(id);
        model.addAttribute("convention",cvn);
        return "EditConv";
    }
    @RequestMapping(value="/UpdateConvention",method = RequestMethod.POST)
    public String Update(Convention cnv){
        conventionRepository.save(cnv);
        return "redirect:Index";
    }

    @RequestMapping(value="/imprimer",method = RequestMethod.POST)
    public String print(long id,Model model){
        Convention cvn=conventionRepository.getOne(id);
        model.addAttribute("convention",cvn);
        return "PrintConv";
    }

}
