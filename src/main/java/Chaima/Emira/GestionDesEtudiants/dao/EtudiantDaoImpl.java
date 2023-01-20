package Chaima.Emira.GestionDesEtudiants.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Chaima.Emira.GestionDesEtudiants.entities.Etudiant;




public class EtudiantDaoImpl implements IEtudiantDAO {
	
	
	
	
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addEtudiant(Etudiant e) {
		entityManager.persist(e);
	}

	@Override
	public List<Etudiant> listEtudiants() {
		// TODO Auto-generated method stub
		Query req=entityManager.createQuery("select e from Etudiant e");
		return req.getResultList();
	}

	@Override
	public void deleteEtudiant(Long idE) {
		// TODO Auto-generated method stub
		Etudiant e = entityManager.find(Etudiant.class, idE);
		entityManager.remove(e);
	}

	@Override
	public Etudiant editEtudiant(Long idE) {
		// TODO Auto-generated method stub
		Etudiant e =entityManager.find(Etudiant.class, idE);
		return e;
	}

	@Override
	public void updateEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		entityManager.merge(e);
	}

	@Override
	public List<Etudiant> chercherEtudiants(String motCle) {
		// TODO Auto-generated method stub
		Query req=entityManager.createQuery("select e from Etudiant e where e.nomPrenomEtudiant like :x");
		req.setParameter("x", "%"+motCle+"%");
		return req.getResultList();
	}
	
	
	

}
