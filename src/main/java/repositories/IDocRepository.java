package repositories;

import org.springframework.data.repository.CrudRepository;


import entities.Doctorant;

public interface IDocRepository extends CrudRepository<Doctorant, Long> {

}
