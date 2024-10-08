import java.util.ArrayList;
import java.util.Scanner;

import br.com.pessoa.modelo.Pessoa;

public class Principal {

	public static void main(String[] args) {
		
		String nome = "";
		int idade = 0;
		Scanner escaneador = new Scanner(System.in);
		ArrayList<Pessoa> pessoa = new ArrayList<>();
		//var pessoa = new ArrayList<Pessoa>(); // outra implementação válida
		
		for(int i = 0; i < 3; i++) {
			Pessoa humano = new Pessoa();
			
			System.out.println("\nInforme o nome da pessoa: ");
			nome = escaneador.next();
			
			System.out.println("Informe a idade da pessoa: ");
			idade = escaneador.nextInt();
			
			humano.setNome(nome);
			humano.setIdade(idade);
			
			pessoa.add(humano);
		}
		
		System.out.println("<-- Dados --> \nTamanho da string: "+ pessoa.size() + "\n");
		System.out.println("Primeiro da lista : " + pessoa.get(0).toString());
		System.out.println("-=-=- Lista completa -=-=-\n");
		
		/*
		for(int i = 0; i < 3; i++) {
			System.out.println(pessoa.get(i).toString());
		}*/
		
		for (Pessoa p : pessoa) {
			 System.out.println(p);
		}
		
		escaneador.close();
	}

}
