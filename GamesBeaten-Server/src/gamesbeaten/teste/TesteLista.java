package gamesbeaten.teste;

import java.text.SimpleDateFormat;

import gamesbeaten.bo.JogoBO;
import gamesbeaten.entity.Developer;
import gamesbeaten.entity.Jogo;
import gamesbeaten.entity.Plataforma;

public class TesteLista {
	public static void main(String[] args) {
		JogoBO bo = new JogoBO();

		for (Jogo jogo : bo.listar()) {
			System.out.println(jogo.getCodigo() + "\n" + jogo.getNome());

			for (Developer developer : jogo.getDeveloper()) {
				System.out.println(developer.getNomeDeveloper());
			}

			SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println(jogo.getPublisher().getNomePublisher() + "\n"
					+ fmt.format(jogo.getDtLancamento().getTime()) + "\n" + jogo.getCapa());

			for (Plataforma plataforma : jogo.getPlataformas()) {
				System.out.println(plataforma.getNomePlataforma());
			}
		}
		System.exit(0);
	}
}
