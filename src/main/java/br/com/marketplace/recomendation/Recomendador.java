package br.com.marketplace.recomendation;

import java.io.File;
import java.io.IOException;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;
import org.springframework.stereotype.Service;

@Service
public class Recomendador {

	public DataModel getModeloDeProdutos() throws IOException {
		return getModelo("src/main/resources/teste.csv");
				
	}

	private DataModel getModelo(String path) throws IOException {
		File file = new File(path);
		return new FileDataModel(file);
	}
}
