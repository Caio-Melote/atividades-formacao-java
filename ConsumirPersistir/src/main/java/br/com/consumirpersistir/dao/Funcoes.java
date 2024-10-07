package br.com.consumirpersistir.dao;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

import com.google.gson.Gson;

import br.com.consumirpersistir.dto.RespostaDto;
import br.com.consumirpersistir.model.Personagem;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Funcoes {
	
	public void popularBanco() {
		HttpClient cliente = HttpClient.newHttpClient();
		List<Personagem> listaPersonagem = new ArrayList<>();
		Integer pagina = 1;
			
			try {
				
				URI linkUrl = URI.create("https://rickandmortyapi.com/api/character/?page=" + pagina);
				
				HttpRequest request = HttpRequest.newBuilder().uri(linkUrl).GET().build();
				
				HttpResponse<String> resposta = cliente.send(request, HttpResponse.BodyHandlers.ofString());
				
				
				System.out.println(resposta.body());
				
				if (resposta.statusCode() == 404) {
					System.out.println("!!Página não encontrada!!");
				} else {
					Gson gson = new Gson();
					
					RespostaDto respostaDto = gson.fromJson(resposta.body(), RespostaDto.class);
					
//					System.out.println("Personangem to string: " + personagemDto.toString());
//					System.out.println("To string test resultado" + personagemDto.getResult());
					
					for(Personagem character : respostaDto.getResult()) {
						if (character instanceof Personagem) {
							listaPersonagem.add(character);
						}
					}
					
					System.out.println("Lista: " + listaPersonagem.toString());				
				
				}
				
				
			} catch (IllegalArgumentException e) {
                System.out.println("Erro na URI: " + e.getMessage());
            }	catch (Exception e) {
				System.out.println("Erro!!\n" + e + "\n");
			}
	
	}
	

	
	
}
