package services;

import java.awt.Image;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Sujet;
import repositories.ISujetRepository;

import javax.transaction.Transactional;
@Service
@Transactional
public class SujetService {
	@Autowired
	ISujetRepository repo;
	public Sujet getsujetbyid(Long id) {
		return repo.findsujetbyiddoc(id);
	}
	
	
}
