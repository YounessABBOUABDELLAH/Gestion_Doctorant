package entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="professeur")
public class Professeur extends Personne {
	
	@Column
	@Enumerated(EnumType.STRING)
	private Grade grade;
	@Column
	private String etablissement;
	@Column
	private String specialite;
	
	
	
	public Professeur(Long identifiant,String nom, String email, String phone, String cin, byte[] photo, String login,
			String pwd) {
		super(identifiant, nom, email, phone, cin, photo, login, pwd);
		// TODO Auto-generated constructor stub
	}
	


	public Professeur() {
		
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public String getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	

}