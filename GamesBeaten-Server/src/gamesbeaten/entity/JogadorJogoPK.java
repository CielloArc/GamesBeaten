package gamesbeaten.entity;

import java.io.Serializable;

public class JogadorJogoPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int jogador;
	private int jogo;

	public int getJogador() {
		return jogador;
	}

	public void setJogador(int jogador) {
		this.jogador = jogador;
	}

	public int getJogo() {
		return jogo;
	}

	public void setJogo(int jogo) {
		this.jogo = jogo;
	}
}
