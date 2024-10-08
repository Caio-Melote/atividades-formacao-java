/*Crie um programa que simula um jogo de adivinhação, que deve gerar um número 
 * aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, 
 * em até 5 tentativas. A cada tentativa, o programa deve informar se o número 
 * digitado pelo usuário é maior ou menor do que o número gerado.

Dicas:

Para gerar um número aleatório em Java: new Random().nextInt(100);
Utilize o Scanner para obter os dados do usuário;
Utilize uma variável para contar as tentativas;
Utilize um loop para controlar as tentativas;
Utilize a instrução break; para interromper o loop.
*/

import java.util.Random;
import java.util.Scanner;

public class Numeroaleatorio {

	public static void main(String[] args) {
		Scanner escaneador = new Scanner(System.in);
		int numero = new Random().nextInt(100);
		int valor = 0;
		int i = 0;
		
		System.out.println("Você terá 5 tentativas para acertar o número que está entre 0 e 100");
		
		System.out.println("\nO numero é: "+numero);
		
		do {
			System.out.println("\nDigite o valor da sua " + (i+1) + " tentativa = ");
			
			valor = escaneador.nextInt();
			
			if (valor > numero) {
				System.out.println("\nO valor digitado é maior que o número alvo");
			} else {
				if (valor < numero) {
					System.out.println("\nO valor digitado é menor que o número alvo");
				} else {
					System.out.println("\nVocê acertou");
					break;
				}
			}
			
			i++;
			if (i == 5) {
				System.out.println("\nNão foi dessa vez que você acertou.\nO número é: " + numero);
			}
		}while (i < 5);
		//while (i < 5 && valor != numero);
		
		escaneador.close();
	}

}
