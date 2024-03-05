package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="Commentaire")
public class Commentaire {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long IdCmnt;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="idEtat")
	private Etat_avancement etat;
	
	@Column(nullable=false,columnDefinition="VARCHAR(255) DEFAULT ''")
	private String commentaire;

	public Commentaire() {
		super();
		
	}

	public Long getIdCmnt() {
		return IdCmnt;
	}

	public void setIdCmnt(Long idCmnt) {
		IdCmnt = idCmnt;
	}

	public Etat_avancement getEtat() {
		return etat;
	}

	public void setEtat(Etat_avancement etat) {
		this.etat = etat;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	public Long getIdEtat() {
		  if (etat != null) {
		        return etat.getIdEtat();
		    } else {
		        return  null;  // ou une autre valeur par défaut selon votre logique
		    }
	}
}
