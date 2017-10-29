package br.com.marketplace.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_dados_recomendacao")
public class DadosRecomendacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_TRANSACAO")
	private Integer idTransacao;
	
	@Column(name="ID_CLIENTE")
	private Integer idCliente;
	
	@Column(name="ID_PRODUTO")
	private Integer idProduto;
	
	@Column(name="NOTA")
	private Double  nota;
	
	@Column(name="VEZES_COMPRADO")
	private Long vezesComprado;
	public DadosRecomendacao() {

	}


	public DadosRecomendacao( Integer idCliente, Integer idProduto, Double nota,
			Long vezesComprado) {
		super();
		this.idCliente = idCliente;
		this.idProduto = idProduto;
		this.nota = nota;
		this.vezesComprado = vezesComprado;
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
	
	
	public Integer getIdTransacao() {
		return idTransacao;
	}

	public void setIdTransacao(Integer idTransacao) {
		this.idTransacao = idTransacao;
	}

	public Long getVezesComprado() {
		return vezesComprado;
	}

	public void setVezesComprado(Long vezesComprado) {
		this.vezesComprado = vezesComprado;
	}

	public boolean equals(Object obj) {

		if (obj instanceof DadosRecomendacao) {
			DadosRecomendacao recomendacao = (DadosRecomendacao) obj;
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

	public int compareTo(DadosRecomendacao recomendacao) {
		return idCliente.compareTo(recomendacao.getIdCliente());
	}

	@Override
	public String toString() {
		return "DadosRecomendacao [idCliente=" + idCliente + ", idProduto=" + idProduto + ", nota=" + nota
				+ ", vezesComprado=" + vezesComprado + ", idTransação="+idTransacao + "]";
	}
	
	
}
