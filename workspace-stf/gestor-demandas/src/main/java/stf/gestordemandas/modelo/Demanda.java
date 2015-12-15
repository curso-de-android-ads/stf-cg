package stf.gestordemandas.modelo;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The persistent class for the demanda database table.
 * 
 */
@XmlRootElement
@Entity
@NamedQuery(name="Demanda.buscarTodos", query="SELECT d FROM Demanda d")
public class Demanda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer numero;

	private String observacoes;

	private String prazo;

	private String responsavel;

	private String status;

	private String titulo;

	//bi-directional many-to-one association to Gerente
	@ManyToOne
	@JoinColumn(name="id_gerente")
	private Gerente gerente;

	public Demanda() {
	}
	
	

	public Demanda(Integer id, Integer numero, String observacoes, String prazo, String responsavel, String status,
			String titulo, Gerente gerente) {
		super();
		this.id = id;
		this.numero = numero;
		this.observacoes = observacoes;
		this.prazo = prazo;
		this.responsavel = responsavel;
		this.status = status;
		this.titulo = titulo;
		this.gerente = gerente;
	}



	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getObservacoes() {
		return this.observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getPrazo() {
		return this.prazo;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}

	public String getResponsavel() {
		return this.responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Gerente getGerente() {
		return this.gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

}