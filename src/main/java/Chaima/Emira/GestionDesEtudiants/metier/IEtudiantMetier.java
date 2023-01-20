package Chaima.Emira.GestionDesEtudiants.metier;

import java.util.List;

import Chaima.Emira.GestionDesEtudiants.entities.Etudiant;
public interface IEtudiantMetier {
	public void addEtudiant(Etudiant e);
	public List<Etudiant> listEtudiants();
	public void deleteEtudiant(Long idE);
	public Etudiant editEtudiant(Long idE);
	public void updateEtudiant(Etudiant e);
	public List<Etudiant> chercherEtudiants(String motCle);
}
