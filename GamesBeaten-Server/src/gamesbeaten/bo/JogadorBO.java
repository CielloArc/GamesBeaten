package gamesbeaten.bo;

import javax.persistence.EntityManager;

import gamesbeaten.dao.JogadorDAO;
import gamesbeaten.dao.impl.JogadorDAOImpl;
import gamesbeaten.entity.Jogador;
import gamesbeaten.factory.EntityManagerFactorySingleton;

public class JogadorBO {
	public void cadastrar(Jogador entity){
		EntityManager em = EntityManagerFactorySingleton.pegarInstancia().createEntityManager();
		JogadorDAO dao = new JogadorDAOImpl(em);
		dao.casdastrar(entity);
		try {
			dao.commit();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public Jogador buscar(int codigo){
		EntityManager em = EntityManagerFactorySingleton.pegarInstancia().createEntityManager();
		JogadorDAO dao = new JogadorDAOImpl(em);
		return dao.buscar(codigo);
	}
}
