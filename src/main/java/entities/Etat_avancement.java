package entities;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@javax.persistence.Entity
@Table(name="etat_avancement")
public class Etat_avancement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long IdEtat;
	@Column
	private String titre;
	@Column
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
	@Column
	private String Description;
	/*@Column(nullable=false,columnDefinition="VARCHAR(255) DEFAULT 'En cours'")
	private String status;*/
	@Column(columnDefinition="Integer DEFAULT 0")
	private int note;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="idTh")
	private Sujet sujet;
	public Etat_avancement() {
		
	}
	public Long getIdEtat() {
		return IdEtat;
	}
	public void setIdEtat(Long idEtat) {
		IdEtat = idEtat;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate localDate) {
		this.date = localDate;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	/*public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}*/
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	
	public Sujet getSujet() {
		return sujet;
	}
	public void setSujet(Sujet sujet) {
		this.sujet = sujet;
	}
	
	
	
	
}