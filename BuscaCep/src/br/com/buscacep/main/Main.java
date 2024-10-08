package br.com.buscacep.main;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

import br.com.buscacep.modelo.Endereco;
import br.com.buscacep.modelo.ViaCepRecord;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		int cep = 0;
		Scanner escaneador = new Scanner(System.in);
		HttpClient client = HttpClient.newHttpClient();
		List<Endereco> listaEndereco = new ArrayList<Endereco>();
		List<String> listaJson = new ArrayList<String>();
		
		while (cep != -1) {
			System.out.println("\nInsira o cep que deseja buscar (00000000): ");
			cep = escaneador.nextInt();
			
			if (cep == -1) {
				break;
			}
			
			HttpRequest req = HttpRequest.newBuilder()
					 .uri(URI.create("https://viacep.com.br/ws/"+ cep +"/json/"))
					 .build();
			
			HttpResponse<String> res = client.send(req, HttpResponse.BodyHandlers.ofString());
			listaJson.add(res.body());
			//System.out.println("\n Response body: " + res.body());
			//System.out.println("\n Response String: " + res.toString());
			
			
			Gson gson = new Gson();			
			ViaCepRecord enderecoRecord = gson.fromJson(res.body(), ViaCepRecord.class);
			
			Endereco novoEndereco = new Endereco(enderecoRecord);
			listaEndereco.add(novoEndereco);
			
		}
		
		for(Endereco p : listaEndereco) {
			System.out.println(p);
		}
		
		FileWriter escritor = new FileWriter("arquivoCeps.json");
		escritor.write(listaJson.toString());
		escritor.close();

		escaneador.close();
	}

}
