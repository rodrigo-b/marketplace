package br.com.marketplace.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.marketplace.model.DadosRecomendacao;
import br.com.marketplace.model.DadosRecomendacaoView;
import br.com.marketplace.recomendation.RecomendaProdutos;
import br.com.marketplace.service.RecomendacaoService;
import br.com.marketplace.util.EscreveArquivo;

@RequestMapping("/marketplace")
@RestController
public class RecomendacaoController {

	@Autowired
	RecomendacaoService service;
	
	@Autowired
	RecomendaProdutos recomenda;
	
	@Autowired
	EscreveArquivo escreveArquivo;	
	
	@RequestMapping(value="/save", method = RequestMethod.GET)
	public ResponseEntity salvar(){
		
//		DadosRecomendacao recomendacao = new DadosRecomendacao(idCliente, idProduto, nota);
//		service.save(recomendacao);
		
		return new ResponseEntity<String>("Dados de compra registrados com sucesso!", HttpStatus.CREATED);
	}
	
	@RequestMapping(value ="/saveDadosRecomendacao", method = RequestMethod.POST)
	public ResponseEntity saveDadosRecomendacao(@RequestBody DadosRecomendacaoView dados)
	{
		try{
			
			
			
		DadosRecomendacao dadosRecomendacao = new DadosRecomendacao();	
		dadosRecomendacao.setIdCliente(dados.getIdCliente());
		List<Integer> list = dados.getIdProdutoList();
		dadosRecomendacao.setIdProduto(dados.getIdProdutoList().get(0));
		dadosRecomendacao.setNota(dados.getNota());
		
		escreveArquivo.escreveArquivoCsv(dadosRecomendacao);
		
		service.saveOrUpdate(dadosRecomendacao);
		return  new ResponseEntity<String>("Dados foram cadastrados com sucesso", HttpStatus.CREATED);
		}
		catch(Exception erro){
			erro.printStackTrace();
			return  new ResponseEntity<String>("ERRO", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@RequestMapping(value="/listaRecomendada/{idUser}", method = RequestMethod.GET)
	public List<Long> retornaListaRecomendacao(@PathVariable("idUser") int id){
		
		List<Long>listaDeProdutos = new ArrayList<Long>();
		
		try {
			listaDeProdutos = recomenda.listaRecomendacao(id);
		} catch (IOException | TasteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaDeProdutos;
	}
	
	
	
}
