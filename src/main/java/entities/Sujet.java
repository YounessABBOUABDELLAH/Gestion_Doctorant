package entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="sujet")
public class Sujet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idTh;
	@Column
	private String titre;
	@Column
	private String description;
	@Column
	private String motsCles;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMotsCles() {
		return motsCles;
	}
	public void setMotsCles(String motsCles) {
		this.motsCles = motsCles;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="idDoc")
	private Doctorant doctorant;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="idProf")
	private Professeur professeur;
	public Sujet() {
		
	}
	public Long getIdTh() {
		return idTh;
	}
	public void setIdTh(Long idTh) {
		this.idTh = idTh;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public Doctorant getDoctorant() {
		return doctorant;
	}
	public void setDoctorant(Doctorant doctorant) {
		this.doctorant = doctorant;
	}
	public Professeur getProfesseur() {
		return professeur;
	}
	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}
	
	
	
	
	
}