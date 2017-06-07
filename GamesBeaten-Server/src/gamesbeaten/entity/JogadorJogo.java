package gamesbeaten.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_GB_JOGADOR_JOGO")
@IdClass(JogadorJogoPK.class)
public class JogadorJogo {

	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CD_JOGADOR")
	private Jogador jogador;

	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CD_JOGO")
	private Jogo jogo;

	public JogadorJogo() {
		super();
	}

	public JogadorJogo(Jogador jogador, Jogo jogo) {
		super();
		this.jogador = jogador;
		this.jogo = jogo;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

}
