package tn.iit.examjee;

import com.sun.glass.ui.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import tn.iit.examjee.dao.ConventionRepository;
import tn.iit.examjee.entities.Convention;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class GestConvApplication {

    public static void main(String[] args) throws ParseException {
        ApplicationContext ctx = SpringApplication.run(GestConvApplication.class, args);
        ConventionRepository conventionRepository = ctx.getBean(ConventionRepository.class);
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        /*
        conventionRepository.save(new Convention(18, "universitaire", "IIT", "ISIMS","","", df.parse("2020-01-01"), df.parse("2020-01-01"), df.parse("2020-01-01"), null, null, "Equivalence", df.parse("2020-01-01"), df.parse("2025-01-01")));
        */
    }

}
