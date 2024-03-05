package entities;

import javax.persistence.Table;



import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import lombok.Data;

@javax.persistence.Entity
@Table(name="Fichier")
@Data
public class Fichier  {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long id;

	  private String name;

	  private String type;

	  @Lob // Cette annotation est utilisée pour déclarer une colonne de type BLOB ou CLOB.
	  @Column(name = "data", columnDefinition = "LONGBLOB")
	  private byte[] data;
	  
	  @ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name="idEtat")
		private Etat_avancement etat;
	

	public Etat_avancement getEtat() {
		return etat;
	}

	public void setEtat(Etat_avancement etat) {
		this.etat = etat;
	}

	public Fichier() {
		    // Constructeur par défaut sans arguments
		}

	public Fichier(long id, String name, byte[] data,Etat_avancement etat) {
		super();
		this.id = id;
		this.name = name;
		this.type = "";
		this.data = data;
		this.etat = etat;
	}

	public long getId() {
		return id;
	}

	public void setId(long l) {
		this.id = l;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	
	
}
