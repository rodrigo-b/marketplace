package br.com.marketplace.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recomendacao {

	@Id
	@Column(name="idCliente")
	private Integer idCliente;
	
	@Column(name="idProduto")
	private Integer idProduto;
	
	@Column(name="nota")
	private Double  nota;
	
	public Recomendacao() {

	}

	public Recomendacao(Integer idCliente, Integer idProduto, Double nota) {
		this.idCliente = idCliente;
		this.idProduto = idProduto;
		this.nota = nota;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Recomendacao) {
			Recomendacao recomendacao = (Recomendacao) obj;
			if (recomendacao.getIdCliente() != 0) {
				return recomendacao.getIdCliente().equals(idCliente);
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return idCliente.hashCode();
	}

	public int compareTo(Recomendacao recomendacao) {
		return idCliente.compareTo(recomendacao.getIdCliente());
	}
}
