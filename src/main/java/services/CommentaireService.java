package services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import repositories.IEtatRepository;
import repositories.ICommentaireRepository;
import entities.Commentaire;
import entities.Etat_avancement;
@Service
@Transactional
public class CommentaireService {

	@Autowired
	ICommentaireRepository crepo;
	@Autowired
	IEtatRepository erepo;
	
	public void ajoutCommentaire(String commentaire, Long id) {
		Etat_avancement et = erepo.findEtatById(id);
		Commentaire com = new Commentaire();
		com.setEtat(et);
		com.setCommentaire(commentaire);
		this.crepo.save(com);
	}
	public Commentaire addComment(Commentaire com) {
		return crepo.save(com);
	}
}
