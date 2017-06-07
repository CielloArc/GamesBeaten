package gamesbeaten.dao.impl;

import javax.persistence.EntityManager;

import gamesbeaten.dao.JogoDAO;
import gamesbeaten.entity.Jogo;

public class JogoDAOImpl extends GenericDAOImpl<Jogo, Integer> implements JogoDAO{

	public JogoDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	
}
