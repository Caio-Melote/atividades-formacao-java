package br.com.busca.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.busca.modelo.Titulo;
import br.com.busca.modelo.TituloOmdb;

public class Principal {

	public static void main(String[] args) throws IOException, InterruptedException {

		Scanner escaneador = new Scanner(System.in);

		System.out.println("Insira o nome do filme que deseja buscar:");
		String buscaTitulo = escaneador.nextLine();
		try {
			HttpClient client = HttpClient.newHttpClient();

			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("http://www.omdbapi.com/?apikey=6585022c&t=" + buscaTitulo)).build();

			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

			System.out.println("Resposta: " + response.body());

			// GsonBuilder gsonBuilder = new
			// GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);

			Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

			TituloOmdb tituloOmdb = gson.fromJson(response.body(), TituloOmdb.class);

			System.out.println(tituloOmdb);

			// try {
			Titulo novoTitulo = new Titulo(tituloOmdb);
			System.out.println("\n\n =-=-=-=-=-=-=Classe Titulo=-=-=-=-=-=-=-=");
			System.out.println(novoTitulo.toString());
		} catch (NumberFormatException e) {
			System.out.println("\n\nErro Catch1: ");
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("\n\nErro Catch2: ");
			System.out.println(e.getMessage());
		}

		escaneador.close();

	}

}
