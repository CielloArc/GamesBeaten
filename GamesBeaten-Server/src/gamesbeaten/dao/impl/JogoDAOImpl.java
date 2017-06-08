package gamesbeaten.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import gamesbeaten.dao.JogoDAO;
import gamesbeaten.entity.Jogo;

public class JogoDAOImpl extends GenericDAOImpl<Jogo, Integer> implements JogoDAO{

	public JogoDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Jogo> listaJogosPesquisa(String nomeJogo) {		
		return em.createQuery("FROM Jogo j WHERE j.nome LIKE :nomeJogo", Jogo.class).setParameter("nomeJogo", "%" + nomeJogo + "%").setMaxResults(50).getResultList();
	}
	
	
}
