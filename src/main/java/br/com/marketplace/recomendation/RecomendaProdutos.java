package br.com.marketplace.recomendation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.springframework.stereotype.Service;

@Service
public class RecomendaProdutos 
{
	
	public  List<Long> listaRecomendacao(Integer id) throws IOException, TasteException {
		
		List<Long> listaIdDosProdutos = new ArrayList<Long>();
		
		DataModel produtos = new Recomendador().getModeloDeProdutos();
		Recommender recommender = new RecomendadorBuilder().buildRecommender(produtos);
		List<RecommendedItem> recommendations = recommender.recommend(id, 1);
		
		for(RecommendedItem recommendation : recommendations){
			listaIdDosProdutos.add(recommendation.getItemID());
			System.out.println(recommendation);
		}
		
		return listaIdDosProdutos;
	}
}
