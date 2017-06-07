package gamesbeaten.teste;

import gamesbeaten.bo.JogadorBO;
import gamesbeaten.entity.Jogo;
import gamesbeaten.entity.Jogador;

public class TesteCadastroJogador {
	public static void main(String[] args) {
		JogadorBO bo = new JogadorBO();
		
		Jogador objUser = new Jogador();
		objUser.setNickName("Lemos");
		objUser.setPerfilSteam(null);
		
		bo.cadastrar(objUser);		
	}
}
