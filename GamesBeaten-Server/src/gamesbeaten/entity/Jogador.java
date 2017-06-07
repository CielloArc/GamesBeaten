package gamesbeaten.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_GB_JOGADOR")
@SequenceGenerator(name = "seqJogador", sequenceName = "SQ_GB_JOGADOR", allocationSize = 1)
public class Jogador {
	
	@Id	
	@GeneratedValue(generator = "seqJogador", strategy = GenerationType.SEQUENCE)
	@Column(name = "CD_JOGADOR", nullable = false)
	private int codigo = 0;
	
	@Column(name = "NM_NICKNAME", nullable = false)
	private String nickName = new String();
	
	@Column(name = "DS_STEAM", nullable = true)
	private String perfilSteam = new String();	
	
	public Jogador() {
		super();
	}
	public Jogador(int codigo) {
		super();
		this.codigo = codigo;
	}
	
	public Jogador(int codigo, String nickName, String perfilSteam) {
		super();
		this.codigo = codigo;
		this.nickName = nickName;
		this.perfilSteam = perfilSteam;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPerfilSteam() {
		return perfilSteam;
	}

	public void setPerfilSteam(String perfilSteam) {
		this.perfilSteam = perfilSteam;
	}
	
	
}
