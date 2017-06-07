package gamesbeaten.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_GB_PLATAFORMA")
@SequenceGenerator(name = "seqPlataforma", sequenceName = "SQ_GB_PLATAFORMA", allocationSize = 1)
public class Plataforma {
	
	@Id
	@Column(name = "CD_PLATAFORMA", nullable = false)
	@GeneratedValue(generator = "seqPlataforma", strategy = GenerationType.SEQUENCE)
	private int codigo = 0;
	
	@Column(name = "NM_PLATAFORMA", nullable = false)
	private String nomePlataforma = new String();
	
	@ManyToMany(mappedBy = "plataformas")
	private List<Jogo> jogo = null;

	public Plataforma(){
		super();
	}
	public Plataforma(String pNomePlataforma, List<Jogo> pJogo){
		super();
		nomePlataforma = pNomePlataforma;
		jogo = pJogo;
	}
	public Plataforma(String pNomePlataforma){
		super();
		nomePlataforma = pNomePlataforma;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomePlataforma() {
		return nomePlataforma;
	}

	public void setNomePlataforma(String nomePlataforma) {
		this.nomePlataforma = nomePlataforma;
	}
	public List<Jogo> getJogo() {
		return jogo;
	}
	public void setJogo(List<Jogo> jogo) {
		this.jogo = jogo;
	}

	
}
