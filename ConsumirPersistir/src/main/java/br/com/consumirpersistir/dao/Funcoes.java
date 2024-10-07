package br.com.consumirpersistir.dao;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

import com.google.gson.Gson;

import br.com.consumirpersistir.dto.RespostaDto;
import br.com.consumirpersistir.model.Localizacao;
import br.com.consumirpersistir.model.Personagem;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Funcoes {
	
	public EntityManager iniciaEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("consumir_persistir");
		EntityManager em = emf.createEntityManager();
		return em;
	}
	
	public void popularBanco() {
		HttpClient cliente = HttpClient.newHttpClient();
		List<Personagem> listaPersonagem = new ArrayList<>();
		Map<String, Localizacao> localizacoesMap = new HashMap<>();
		Integer pagina = 0;
		Integer codigoStatus = 0;
		EntityManager em = iniciaEntityManager();
		
		while(codigoStatus != 404) {
			
			try {
				em.getTransaction().begin();
				pagina++;
				URI linkUrl = URI.create("https://rickandmortyapi.com/api/character/?page=" + pagina);
				
				HttpRequest request = HttpRequest.newBuilder().uri(linkUrl).GET().build();
				
				HttpResponse<String> resposta = cliente.send(request, HttpResponse.BodyHandlers.ofString());
				
				codigoStatus = resposta.statusCode();
				
				System.out.println(resposta.body());
				
				if (resposta.statusCode() == 404) {
					System.out.println("!!Página não encontrada!!");
				} else {
					Gson gson = new Gson();
					
					RespostaDto respostaDto = gson.fromJson(resposta.body(), RespostaDto.class);
					
//					System.out.println("Personangem to string: " + personagemDto.toString());
//					System.out.println("To string test resultado" + personagemDto.getResult());
					
					for(Personagem character : respostaDto.getResult()) {
						
						if(character.getOrigem() != null) {
							String origemNome = character.getOrigem().getName();
							
							if(!localizacoesMap.containsKey(origemNome)) {							
								 Localizacao localizacao = new Localizacao(null, origemNome, null, null, character.getOrigem().getUrl());
	                             em.persist(localizacao);
	                             localizacoesMap.put(origemNome, localizacao); 
	                             character.setOrigem(localizacao); 
							}else {
                                character.setOrigem(localizacoesMap.get(origemNome));
                            }
							 
						}
												
							listaPersonagem.add(character);
							em.persist(character);
							
							//System.out.println("Personagem: " + character.toString());				
					}
					//System.out.println("Lista: " + listaPersonagem.toString());	
					em.getTransaction().commit();
				}
				
				
			} catch (IllegalArgumentException e) {
                System.out.println("Erro na URI: " + e.getMessage());
            }	catch (Exception e) {
				System.out.println("Erro!!\n" + e + "\n");
			}	
		}
			
	} //popular banco

} //funcoes
