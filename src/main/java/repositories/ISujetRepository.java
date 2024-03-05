package repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import entities.Sujet;

@Repository
public interface ISujetRepository extends JpaRepository<Sujet,Long>{

	@Query(nativeQuery=true,value="select * from sujet s join doctorant d on d.identifiant=s.id_doc where d.identifiant=?1")
    Sujet findsujetbyiddoc(Long id);
   
}
