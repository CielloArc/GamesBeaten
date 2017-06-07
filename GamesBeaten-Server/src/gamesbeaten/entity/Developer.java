package gamesbeaten.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_GB_DEVELOPER")
@SequenceGenerator(name = "seqDeveloper", sequenceName = "SQ_GB_DEVELOPER", allocationSize = 1)
public class Developer {

	@Id
	@Column(name = "CD_DEVELOPER", nullable = false)
	@GeneratedValue(generator = "seqDeveloper", strategy = GenerationType.SEQUENCE)
	private int codigo = 0;

	@Column(name = "NM_DEVELOPER", nullable = false)
	private String nomeDeveloper = new String();

	public Developer() {
		super();
	}

	public Developer(String pNomeDeveloper) {
		super();
		nomeDeveloper = pNomeDeveloper;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeDeveloper() {
		return nomeDeveloper;
	}

	public void setNomeDeveloper(String nomeDeveloper) {
		this.nomeDeveloper = nomeDeveloper;
	}

}
