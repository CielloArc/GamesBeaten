package gamesbeaten.bo;

import java.util.List;

import javax.persistence.EntityManager;

import gamesbeaten.dao.JogadorJogoDAO;
import gamesbeaten.dao.impl.JogadorJogoDAOImpl;
import gamesbeaten.entity.JogadorJogo;
import gamesbeaten.entity.Jogo;
import gamesbeaten.factory.EntityManagerFactorySingleton;

public class JogadorJogoBO {
	public void cadastrar(JogadorJogo entidade){
		EntityManager em = EntityManagerFactorySingleton.pegarInstancia().createEntityManager();
		JogadorJogoDAO dao = new JogadorJogoDAOImpl(em);
		
		dao.casdastrar(entidade);
		try {
			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<JogadorJogo> listar(int codigo){
		EntityManager em = EntityManagerFactorySingleton.pegarInstancia().createEntityManager();
		JogadorJogoDAO dao = new JogadorJogoDAOImpl(em);
		return dao.listarJogosDoJogador(codigo);
	}
}
