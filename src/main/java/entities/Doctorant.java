package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@javax.persistence.Entity


@Table(name="doctorant")
public class Doctorant extends Personne {
	

	@Column
	private String cne;
	@Column
	private String apoge; 
	

	public Doctorant() {
		super();
	}

	

	public Doctorant(Long identifiant, String nom, String email, String phone, String cin, byte[] photo, String login,
			String pwd) {
		super(identifiant, nom, email, phone, cin, photo, login, pwd);
		// TODO Auto-generated constructor stub
	}



	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public String getApoge() {
		return apoge;
	}

	public void setApoge(String apoge) {
		this.apoge = apoge;
	}

	
	

}