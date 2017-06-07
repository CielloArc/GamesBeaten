package gamesbeaten.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_GB_JOGO")
@SequenceGenerator(name = "seqJogo", sequenceName = "SQ_GB_JOGO", allocationSize = 1)
public class Jogo {

	@Id
	@Column(name = "CD_JOGO", nullable = false)
	@GeneratedValue(generator = "seqJogo", strategy = GenerationType.SEQUENCE)
	private int codigo = 0;

	@Column(name = "NM_JOGO", nullable = false)
	private String nome = new String();

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_LANCAMENTO", nullable = false)
	private Calendar dtLancamento = null;
	
	@Lob
	@Column(name = "FL_CAPA", nullable = true)
	private byte[] capa = null;
	
	//Mapeamentos
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "CD_DEVELOPER", nullable = false)
	private List<Developer> developer = null;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "CD_PUBLISHER", nullable = false)
	private Publisher publisher = null;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "CD_PLATAFORMAS", nullable = false)
	private List<Plataforma> plataformas = new ArrayList<Plataforma>();

	public Jogo() {
		super();
	}

	public Jogo(int codigo) {
		super();
		this.codigo = codigo;
	}
	
	public Jogo(String nome, List<Developer> developer, Publisher publisher, Calendar dtLancamento, byte[] capa,
			List<Plataforma> plataformas) {
		super();
		this.nome = nome;
		this.developer = developer;
		this.publisher = publisher;
		this.dtLancamento = dtLancamento;
		this.capa = capa;
		this.plataformas = plataformas;
	}

	public void setDeveloper(List<Developer> developer) {
		this.developer = developer;
	}

	public List<Developer> getDeveloper() {
		return developer;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Calendar getDtLancamento() {
		return dtLancamento;
	}

	public void setDtLancamento(Calendar dtLancamento) {
		this.dtLancamento = dtLancamento;
	}

	public byte[] getCapa() {
		return capa;
	}

	public void setCapa(byte[] capa) {
		this.capa = capa;
	}

	public List<Plataforma> getPlataformas() {
		return plataformas;
	}

	public void setPlataformas(List<Plataforma> plataformas) {
		this.plataformas = plataformas;
	}
}
