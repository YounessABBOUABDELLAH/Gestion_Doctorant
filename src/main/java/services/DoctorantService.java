package services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import entities.Doctorant;
import entities.Sujet;
import repositories.IDocRepository;
import repositories.IEtatRepository;

import javax.transaction.Transactional;
@Service
@Transactional
public class DoctorantService {
	@Autowired
	IDocRepository repo;
	public Doctorant viewById(long id) {
        return repo.findById(id).get();
    }
}
