/* 1. Crie um programa que realize a média de duas notas decimais 
e exiba o resultado.*/

/* 2. Declare uma variável do tipo double e uma variável do tipo int. 
Faça o casting da variável double para int e imprima o resultado.*/

public class Main {

	public static void main(String[] args) {
		double x, y, media = 0;
		
		x = 10.5;
		y = 7.8;
		
		media = (x + y) / 2;
		
		int mediaInteira = (int) media;
		
		String mensagem = String.format("A média de %.2f e %.2f é igual a = %d", x, y, mediaInteira);	 
		
		System.out.print(mensagem);
	}

}
