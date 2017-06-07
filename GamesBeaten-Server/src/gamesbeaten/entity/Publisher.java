package gamesbeaten.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_GB_PUBLISHER")
@SequenceGenerator(name = "seqPublisher", sequenceName = "SQ_GB_PUBLISHER", allocationSize = 1)
public class Publisher {

	@Id
	@Column(name = "CD_PUBLISHER", nullable = false)
	@GeneratedValue(generator = "seqPublisher", strategy = GenerationType.SEQUENCE)
	private int codigo = 0;

	@Column(name = "NM_PUBLISHER", nullable = false)
	private String nomePublisher = new String();
	
	@OneToMany(mappedBy = "publisher")
	private List<Jogo> jogo = null;
	
	public Publisher() {
		super();
	}

	public Publisher(String pNomePublisher) {
		super();
		nomePublisher = pNomePublisher;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomePublisher() {
		return nomePublisher;
	}

	public void setNomePublisher(String nomePublisher) {
		this.nomePublisher = nomePublisher;
	}

}
