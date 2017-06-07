package gamesbeaten.dao;

import java.util.List;

import gamesbeaten.entity.JogadorJogo;
import gamesbeaten.entity.JogadorJogoPK;
import gamesbeaten.entity.Jogo;

public interface JogadorJogoDAO extends GenericDAO<JogadorJogo, JogadorJogoPK>{
	List<JogadorJogo> listarJogosDoJogador(int codigo);
	Long qtJogosJogador(int codigo);
}
