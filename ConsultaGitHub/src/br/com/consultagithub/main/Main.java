package br.com.consultagithub.main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import javax.print.attribute.SetOfIntegerSyntax;

import com.google.gson.Gson;

import br.com.consultagithub.modelo.UserModel;
import br.com.consultagithub.record.RecordJson;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		String nomeUsuario = "";
		Scanner captura = new Scanner(System.in); 
		List<UserModel> listaUsuarios = new ArrayList<UserModel>();
		
		while(!nomeUsuario.equals("sair")) {
			System.out.println("Digite o username do usuário que deseja buscar: ");
			nomeUsuario = captura.next();
			
			if (nomeUsuario.equals("sair")) {
				break;
			}
			
			//Cliente (HTTP)
			HttpClient client = HttpClient.newHttpClient();
			
			//Request (HTTP)
			HttpRequest request = HttpRequest.newBuilder()
				      .uri(URI.create("https://api.github.com/users/" + nomeUsuario))
				      .GET()
				      .build();
			try {
				HttpResponse <String> resposta = client.send(request, HttpResponse.BodyHandlers.ofString());	
				
				if(resposta.statusCode() == 404) {
					throw new Exception("Usuário não encontrado: " + nomeUsuario);
				}else {
				Gson gson = new Gson();
				
				RecordJson usuario = gson.fromJson(resposta.body(),RecordJson.class);
				UserModel novoUsuario = new UserModel(usuario);
				listaUsuarios.add(novoUsuario);	
				}
			} catch (Exception e) {
				System.out.println("Erro!!\n" + e + "\n");
			}
	
		}
		
		for(UserModel user : listaUsuarios) {
			System.out.println(user);
		}
		
		//System.out.println("Usuário println: " + listaUsuarios.toString());
		captura.close();
	}
}
