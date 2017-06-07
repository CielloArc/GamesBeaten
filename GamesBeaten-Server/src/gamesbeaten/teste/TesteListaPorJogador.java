package gamesbeaten.teste;

import java.util.List;

import gamesbeaten.bo.JogadorJogoBO;
import gamesbeaten.entity.JogadorJogo;
import gamesbeaten.entity.Jogo;

public class TesteListaPorJogador {
	public static void main(String[] args) {
		JogadorJogoBO bo = new JogadorJogoBO();
		List<JogadorJogo> listaJogosJogador = bo.listar(2);
		
		for (JogadorJogo jogo : listaJogosJogador) {
			System.out.println("Jogador: " + jogo.getJogador().getNickName() + 
								"\nJogo: " + jogo.getJogo().getNome());
		}
		System.exit(0);
	}
}
