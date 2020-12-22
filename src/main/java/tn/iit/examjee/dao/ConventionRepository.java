package tn.iit.examjee.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.iit.examjee.entities.Convention;


import java.util.List;

public interface ConventionRepository extends JpaRepository<Convention, Long> {
    public List<Convention> findByType(String type);
    public Page<Convention> findByType(String type, Pageable pageable);
    @Query("select c from Convention  c where c.type like :x or c.objet like :x")
    public Page<Convention> ChercherConvention(@Param("x") String mc, Pageable pageable);





}
