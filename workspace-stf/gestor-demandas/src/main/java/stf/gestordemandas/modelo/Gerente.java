package stf.gestordemandas.modelo;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;


/**
 * The persistent class for the gerente database table.
 * 
 */
@XmlRootElement
@Entity
@NamedQuery(name="Gerente.buscarTodos", query="SELECT g FROM Gerente g")
public class Gerente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String email;

	private String nome;

	private String projeto;

	//bi-directional many-to-one association to Demanda
	@OneToMany(mappedBy="gerente")
	private List<Demanda> demandas;

	public Gerente() {
	}
	
	

	public Gerente(Integer id, String email, String nome, String projeto, List<Demanda> demandas) {
		super();
		this.id = id;
		this.email = email;
		this.nome = nome;
		this.projeto = projeto;
		this.demandas = demandas;
	}



	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProjeto() {
		return this.projeto;
	}

	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}

	public List<Demanda> getDemandas() {
		return this.demandas;
	}

	public void setDemandas(List<Demanda> demandas) {
		this.demandas = demandas;
	}

	public Demanda addDemanda(Demanda demanda) {
		getDemandas().add(demanda);
		demanda.setGerente(this);

		return demanda;
	}

	public Demanda removeDemanda(Demanda demanda) {
		getDemandas().remove(demanda);
		demanda.setGerente(null);

		return demanda;
	}

}