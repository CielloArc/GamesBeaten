package gamesbeaten.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import gamesbeaten.dao.JogadorJogoDAO;
import gamesbeaten.entity.JogadorJogo;
import gamesbeaten.entity.JogadorJogoPK;
import gamesbeaten.entity.Jogo;

public class JogadorJogoDAOImpl extends GenericDAOImpl<JogadorJogo, JogadorJogoPK> implements JogadorJogoDAO{

	public JogadorJogoDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<JogadorJogo> listarJogosDoJogador(int codigo) {
		return em.createQuery("FROM JogadorJogo jj WHERE jj.jogador.codigo = :codJogador", JogadorJogo.class).setParameter("codJogador", codigo).getResultList();
	}
	
	public Long qtJogosJogador(int codigo){
		return em.createQuery("SELECT COUNT(*) FROM JogadorJogo jj WHERE jj.jogador.codigo = :codJogador", Long.class).setParameter("codJogador", codigo).getSingleResult();
	}

}
