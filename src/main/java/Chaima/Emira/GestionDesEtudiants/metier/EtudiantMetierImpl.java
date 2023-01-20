package Chaima.Emira.GestionDesEtudiants.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import Chaima.Emira.GestionDesEtudiants.dao.IEtudiantDAO;
import Chaima.Emira.GestionDesEtudiants.entities.Etudiant;




public class EtudiantMetierImpl implements IEtudiantMetier {
	
	
	private IEtudiantDAO dao;


	
	public void setDao(IEtudiantDAO dao) {
		this.dao = dao;
	}
	
	@Override
	@Transactional
	public void addEtudiant(Etudiant e) {
		dao.addEtudiant(e);
	}

	@Override
	public List<Etudiant> listEtudiants() {
		// TODO Auto-generated method stub
		return dao.listEtudiants();
	}

	@Override
	@Transactional
	public void deleteEtudiant(Long idE) {
		// TODO Auto-generated method stub
		dao.deleteEtudiant(idE);
	}

	@Override
	public Etudiant editEtudiant(Long idE) {
		// TODO Auto-generated method stub
		return dao.editEtudiant(idE);
	}

	@Override
	@Transactional
	public void updateEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		dao.updateEtudiant(e);
	}

	@Override
	@Transactional
	public List<Etudiant> chercherEtudiants(String motCle) {
		// TODO Auto-generated method stub
		return dao.chercherEtudiants(motCle);
	}
	
	
	

}
