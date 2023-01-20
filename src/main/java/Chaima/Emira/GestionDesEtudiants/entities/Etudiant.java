package Chaima.Emira.GestionDesEtudiants.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Etudiant implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEtudiant;
	@NotEmpty
	@Size(max=60,min=3) 
	private String nomPrenomEtudiant;

	private String classe;
	
	
	public Etudiant(Long idEtudiant, String nomPrenomEtudiant, String classe) {
		super();
		this.idEtudiant = idEtudiant;
		this.nomPrenomEtudiant = nomPrenomEtudiant;
		this.classe = classe;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(Long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public String getNomPrenomEtudiant() {
		return nomPrenomEtudiant;
	}

	public void setNomPrenomEtudiant(String nomPrenomEtudiant) {
		this.nomPrenomEtudiant = nomPrenomEtudiant;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	
	
	
	

}
