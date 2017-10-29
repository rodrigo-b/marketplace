package br.com.marketplace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marketplace.model.DadosRecomendacao;
import br.com.marketplace.repository.RecomendacaoRepository;
import br.com.marketplace.util.EscreveArquivo;

@Service
public class RecomendacaoService {

	@Autowired
	private RecomendacaoRepository repository;
	
	@Autowired
	private EscreveArquivo escreveArquivo;
	
	public void saveOrUpdate(DadosRecomendacao recomendacao){
		repository.save(recomendacao);
	}
	
	public void populaArquivo(DadosRecomendacao recomendacao){
		escreveArquivo.escreveArquivoCsv(recomendacao);
	}
}
