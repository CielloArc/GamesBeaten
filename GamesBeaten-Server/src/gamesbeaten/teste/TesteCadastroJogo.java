package gamesbeaten.teste;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import gamesbeaten.bo.JogoBO;
import gamesbeaten.entity.Developer;
import gamesbeaten.entity.Jogo;
import gamesbeaten.entity.Plataforma;
import gamesbeaten.entity.Publisher;

public class TesteCadastroJogo {

	public static void main(String[] args) {
		
		List<Plataforma> listaPlataforma = new ArrayList<Plataforma>();
		listaPlataforma.add(new Plataforma("PlayStation 3"));
		
		List<Developer> listaDev = new ArrayList<Developer>();
		listaDev.add(new Developer("Crypton Future Media"));
		listaDev.add(new Developer("SEGA"));
		
		Jogo jogo = new Jogo("Hatsune Miku: Project DIVA F", 
					listaDev, 
					new Publisher("SEGA"),
					new GregorianCalendar(2012, Calendar.AUGUST, 30),
					null,
					listaPlataforma);
		
		JogoBO bo = new JogoBO();
		bo.cadastrar(jogo);
		
		System.exit(0);
		
		/*List<Plataforma> listaPlataforma = new ArrayList<Plataforma>();
		listaPlataforma.add(new Plataforma("PlayStation 3"));
		listaPlataforma.add(new Plataforma("PC"));
		
		List<Developer> listaDev = new ArrayList<Developer>();
		listaDev.add(new Developer("Crypton Future Media"));
		listaDev.add(new Developer("SEGA"));
		
		Jogo jogo = new Jogo("Hatsune Miku: Project DIVA F 2nd", 
					listaDev, 
					new Publisher("SEGA"),
					new GregorianCalendar(2014, 2, 27),
					null,
					listaPlataforma);
		
		JogoBO bo = new JogoBO();
		bo.cadastrar(jogo);
		
		System.exit(0);*/
	}

}
