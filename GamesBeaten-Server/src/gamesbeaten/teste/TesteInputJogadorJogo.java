package gamesbeaten.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.swing.JOptionPane;

import gamesbeaten.bo.JogadorJogoBO;
import gamesbeaten.entity.Developer;
import gamesbeaten.entity.Jogador;
import gamesbeaten.entity.JogadorJogo;
import gamesbeaten.entity.Jogo;
import gamesbeaten.entity.Plataforma;
import gamesbeaten.entity.Publisher;

public class TesteInputJogadorJogo {
	public static void main(String[] args) {
		//Jogador objJogador = new JogadorBO().buscar(1);
		//Jogo objJogo = new JogoBO().buscar(1);
		
		Jogador objJogador = new Jogador(0, "Marcelo", null);
		
		List<Developer> listaDeveloper = new ArrayList<Developer>();
		listaDeveloper.add(new Developer("Firaxis Games"));
		
		List<Plataforma> listaPlataforma = new ArrayList<Plataforma>();
		listaPlataforma.add(new Plataforma("PC"));
		
		Publisher pub = new Publisher("2K Games");
		
		Jogo objJogo = new Jogo("XCOM: Enemy Unknown", listaDeveloper, pub, new GregorianCalendar(11, Calendar.OCTOBER, 2012), null, listaPlataforma);
		
		JogadorJogo obj = new JogadorJogo();
		obj.setJogador(objJogador);
		obj.setJogo(objJogo);
		
		JOptionPane.showMessageDialog(null, "Jogador: \n" + objJogador.getCodigo() + "\t" + objJogador.getNickName() + 
											"\nNome Jogo: \n" + objJogo.getCodigo() + "\t" + objJogo.getNome());
		
		JogadorJogoBO bo = new JogadorJogoBO();
		bo.cadastrar(obj);
	}
}
