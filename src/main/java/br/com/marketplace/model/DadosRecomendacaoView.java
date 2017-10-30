package br.com.marketplace.model;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DadosRecomendacaoView {

	
	private Integer idCliente;
	
	private List<Integer> idProdutoList;
	
	private Double  nota;
	
	private Long vezesComprado;
	
	
	public DadosRecomendacaoView() {

	}


	public DadosRecomendacaoView( Integer idCliente, List<Integer> idProduto, Double nota,
			Long vezesComprado) {
		super();
		this.idCliente = idCliente;
		this.idProdutoList = idProduto;
		this.nota = nota;
		this.vezesComprado = vezesComprado;
	}


	public Integer getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}


	public List<Integer> getIdProdutoList() {
		return idProdutoList;
	}


	public void setIdProdutoList(List<Integer> idProdutoList) {
		this.idProdutoList = idProdutoList;
	}


	public Double getNota() {
		return nota;
	}


	public void setNota(Double nota) {
		this.nota = nota;
	}


	public Long getVezesComprado() {
		return vezesComprado;
	}


	public void setVezesComprado(Long vezesComprado) {
		this.vezesComprado = vezesComprado;
	}
	
	
	
}
