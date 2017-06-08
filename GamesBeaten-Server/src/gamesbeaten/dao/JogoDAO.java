package gamesbeaten.dao;

import java.util.List;

import gamesbeaten.entity.Jogo;

public interface JogoDAO extends GenericDAO<Jogo, Integer>{
	List<Jogo> listaJogosPesquisa(String nomeJogo);
}
