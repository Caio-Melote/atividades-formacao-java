package br.com.consultagithub.main;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.google.gson.Gson;
import br.com.consultagithub.modelo.UserModel;
import br.com.consultagithub.record.RecordJson;

public class Main {
	public static void main(String[] args) {
		String nomeUsuario = "";
		Scanner captura = new Scanner(System.in);
		List<UserModel> listaUsuarios = new ArrayList<UserModel>();

		while (!nomeUsuario.equals("sair")) {
			System.out.println("Digite o username do usuário que deseja buscar: ");
			nomeUsuario = captura.nextLine();

			if (nomeUsuario.equals("sair")) {
				break;
			}

			// Cliente (HTTP)
			HttpClient client = HttpClient.newHttpClient();

			try {
				// Request (HTTP)
				HttpRequest request = HttpRequest.newBuilder()
						.uri(URI.create("https://api.github.com/users/" + nomeUsuario)).GET().build();

				HttpResponse<String> resposta = client.send(request, HttpResponse.BodyHandlers.ofString());

				if (resposta.statusCode() == 404) {
					System.out.println("!!Username INVÁLIDO!!");
				} else {
					Gson gson = new Gson();

					RecordJson usuario = gson.fromJson(resposta.body(), RecordJson.class);
					UserModel novoUsuario = new UserModel(usuario);
					listaUsuarios.add(novoUsuario);
				}
			} catch (IllegalArgumentException e) {
                System.out.println("Erro na URI: " + e.getMessage());
            }catch (Exception e) {
				System.out.println("Erro!!\n" + e + "\n");
			}

		}

		for (UserModel user : listaUsuarios) {
			System.out.println(user);
		}

		// System.out.println("Usuário println: " + listaUsuarios.toString());
		captura.close();
	}
}
