package gamesbeaten.bo;

import java.util.List;

import javax.persistence.EntityManager;

import gamesbeaten.dao.JogadorDAO;
import gamesbeaten.dao.JogoDAO;
import gamesbeaten.dao.impl.JogadorDAOImpl;
import gamesbeaten.dao.impl.JogoDAOImpl;
import gamesbeaten.entity.Jogador;
import gamesbeaten.entity.Jogo;
import gamesbeaten.factory.EntityManagerFactorySingleton;

public class JogoBO {
	public void cadastrar(Jogo pJogo){
		EntityManager em = EntityManagerFactorySingleton.pegarInstancia().createEntityManager();
		JogoDAO dao = new JogoDAOImpl(em);
		dao.casdastrar(pJogo);
		try {
			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Jogo buscar(int codigo){
		EntityManager em = EntityManagerFactorySingleton.pegarInstancia().createEntityManager();
		JogoDAO dao = new JogoDAOImpl(em);
		return dao.buscar(codigo);
	}
	
	public void atualizar(Jogo pJogo){
		EntityManager em = EntityManagerFactorySingleton.pegarInstancia().createEntityManager();
		JogoDAO dao = new JogoDAOImpl(em);
		dao.atualizar(pJogo);
		try {
			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Jogo> listar(){
		EntityManager em = EntityManagerFactorySingleton.pegarInstancia().createEntityManager();
		JogoDAO dao = new JogoDAOImpl(em);
		return dao.listar();
	}
	
	public void remover(int pCodigo){
		EntityManager em = EntityManagerFactorySingleton.pegarInstancia().createEntityManager();
		JogoDAO dao = new JogoDAOImpl(em);
		dao.remover(pCodigo);
		try {
			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Jogo> listaJogosPesquisa(String nomeJogo){
		EntityManager em = EntityManagerFactorySingleton.pegarInstancia().createEntityManager();
		JogoDAO dao = new JogoDAOImpl(em);
		return dao.listaJogosPesquisa(nomeJogo);
	}
}
