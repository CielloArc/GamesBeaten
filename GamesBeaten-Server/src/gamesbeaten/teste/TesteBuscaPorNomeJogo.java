package gamesbeaten.teste;

import java.util.List;

import javax.swing.JOptionPane;

import gamesbeaten.bo.JogoBO;
import gamesbeaten.entity.Jogo;

public class TesteBuscaPorNomeJogo {

	public static void main(String[] args) {
		JogoBO objJogo = new JogoBO();
		List<Jogo> listaJogo = objJogo.listaJogosPesquisa(JOptionPane.showInputDialog("Insira o nome de um jogo"));
		
		String concat = new String();
		
		for (Jogo jogo : listaJogo) {
			concat += jogo.getNome() + "\n";
		}
		
		JOptionPane.showMessageDialog(null, concat);
		
		System.exit(0);
	}

}
