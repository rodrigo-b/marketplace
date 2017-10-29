package br.com.marketplace.util;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Service;

import br.com.marketplace.model.DadosRecomendacao;

@Service
public class EscreveArquivo {

	public void escreveArquivoCsv(DadosRecomendacao recomendacao) {
		
		try
	    {
	        FileWriter writer = new FileWriter("src/main/resources/teste.csv", true);

	        String idCliente = String.valueOf(recomendacao.getIdCliente());
	        String idProduto = String.valueOf(recomendacao.getIdProduto());
	        String nota 	 = String.valueOf(recomendacao.getNota());
	        
	        writer.append(idCliente);
	        writer.append(',');
	        writer.append(idProduto);
	        writer.append(',');
	        writer.append(nota);
	        writer.append('\n');

	        writer.flush();
	        writer.close();
	    }
	    catch(IOException e)
	    {
	         e.printStackTrace();
	    } 
		
	}
	
}
