package br.com.marketplace.repository;

import org.springframework.stereotype.Repository;

import br.com.marketplace.model.Recomendacao;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface RecomendacaoRepository extends CrudRepository<Recomendacao, Integer>{
	
	void SaveOrUpdateEvent(Recomendacao recomendacao);
	
}
