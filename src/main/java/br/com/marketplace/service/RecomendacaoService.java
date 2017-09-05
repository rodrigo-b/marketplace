package br.com.marketplace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marketplace.model.Recomendacao;

@Service
public class RecomendacaoService {

	@Autowired
	private RecomendacaoService service;
	
	public void save(Recomendacao recomendacao){
		service.save(recomendacao);
	}
}
