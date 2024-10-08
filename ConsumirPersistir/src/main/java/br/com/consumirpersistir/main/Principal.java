package br.com.consumirpersistir.main;

import java.util.List;
import java.util.Scanner;

import br.com.consumirpersistir.dao.Funcoes;
import br.com.consumirpersistir.model.Localizacao;
import br.com.consumirpersistir.model.Personagem;

public class Principal {

	public static Scanner teclado = new Scanner(System.in);
	public static Scanner novoTeclado = new Scanner(System.in);
	public static void main(String[] args) {
		Integer menu = 0;
		Funcoes funcoes = new Funcoes();
		String nome = null;
		
		menu = menuString();

		while (menu != 5) {
			switch (menu) {
			case 1:
				funcoes.popularBanco();
				break;
			case 2: {
				List<Personagem> listaPersonagem = funcoes.buscarPersonagensBanco();
				System.out.println(listaPersonagem);
				break;
			}
			case 3: {
				List<Localizacao> listaLocalizacao = funcoes.buscarLocalizacoesBanco();
				System.out.println(listaLocalizacao);
				break;
			}
			case 4: {
				System.out.println("Digite o nome que deseja buscar: ");
				nome = novoTeclado.nextLine();
				System.out.println(nome);
				List<Personagem> listaNomePersonagem = funcoes.buscarPersonagemNome(nome);
				System.out.println(listaNomePersonagem);
				break;
			}
			default:
				throw new IllegalArgumentException("valor inesperado: " + menu);
			}
			menu = menuString();
		}
		System.out.println("Encerrou");
	}

	public static int menuString() {
		System.out.println("=---------------------------------------= \nInsira a opção desejada:");
		System.out.println("1 - Extrair e salvar todos os personagens e localizações da API");
		System.out.println("2 - Exibir todos os personagens do banco de dados");
		System.out.println("3 - Exibir todas localizações do banco de dados");
		System.out.println("4 - Buscar personagem pelo nome");
		System.out.println("5 - SAIR");
		return teclado.nextInt();
	}

}
