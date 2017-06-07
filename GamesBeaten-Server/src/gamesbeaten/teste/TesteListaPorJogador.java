package gamesbeaten.teste;

import java.util.List;

import gamesbeaten.bo.JogadorJogoBO;
import gamesbeaten.entity.JogadorJogo;
import gamesbeaten.entity.Jogo;

public class TesteListaPorJogador {
	public static void main(String[] args) {
		int codigoJogador = 2;
		
		JogadorJogoBO bo = new JogadorJogoBO();
		List<JogadorJogo> listaJogosJogador = bo.listarJogosJogador(codigoJogador);
		Long qtJogos = bo.qtJogosJogador(codigoJogador);

		System.out.println("\nJogador: " + listaJogosJogador.get(0).getJogador().getNickName());
		System.out.println("Perfil Steam: " + listaJogosJogador.get(0).getJogador().getPerfilSteam());
		
		System.out.println("\nQuantidade de Jogos: " + qtJogos);
		
		System.out.println("\nJogos: ");
		for (JogadorJogo jogo : listaJogosJogador) {
			System.out.println(jogo.getJogo().getNome());
		}
		System.exit(0);
	}
}
