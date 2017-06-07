package gamesbeaten.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import gamesbeaten.dao.JogadorDAO;
import gamesbeaten.entity.Jogador;
import gamesbeaten.entity.Jogo;

public class JogadorDAOImpl extends GenericDAOImpl<Jogador, Integer> implements JogadorDAO{

	public JogadorDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	

}
