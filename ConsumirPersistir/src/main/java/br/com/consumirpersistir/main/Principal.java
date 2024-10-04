package br.com.consumirpersistir.main;

import java.util.Scanner;

import br.com.consumirpersistir.dao.Funcoes;

public class Principal {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Integer menu = 0;
		Funcoes funcoes = new Funcoes();
		menu = menuString();

		while (menu != 5) {
			switch (menu) {
			case 1:
				funcoes.popularBanco();
				break;
			case 2: {

			}
			case 3: {

			}
			case 4: {

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
		System.out.println("1 - Buscar todos os personagens e localizações");
		System.out.println("2 - Exibir data do banco de dados");
		System.out.println("3 - Buscar personagem");
		System.out.println("4 - Buscar localização");
		System.out.println("5 - SAIR");
		return teclado.nextInt();
	}

}
