package br.com.marketplace.repository;

import org.springframework.stereotype.Repository;

import br.com.marketplace.model.DadosRecomendacao;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface RecomendacaoRepository extends CrudRepository<DadosRecomendacao, Integer>{
	
//	void save(DadosRecomendacao recomendacao);
	
}
