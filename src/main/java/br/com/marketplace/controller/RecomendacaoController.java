package br.com.marketplace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.marketplace.model.Recomendacao;
import br.com.marketplace.service.RecomendacaoService;

@RequestMapping("/marketplace")
@RestController
public class RecomendacaoController {

	@Autowired
	RecomendacaoService service;
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public ResponseEntity salvar(@PathVariable Integer idCliente,
								 @PathVariable Integer idProduto,
								 @PathVariable Double  nota){
		
		Recomendacao recomendacao = new Recomendacao(idCliente, idProduto, nota);
		service.save(recomendacao);
		
		return new ResponseEntity<String>("Dados de compra registrados com sucesso!", HttpStatus.CREATED);
	}
	
}
