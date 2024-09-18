/* Peça ao usuário para inserir dois números inteiros. 
 * Compare os números e imprima uma mensagem indicando se são iguais, 
 * diferentes, o primeiro é maior ou o segundo é maior.
 * 
 */

import java.util.Scanner;

public class Segundo {
	public static void main(String[] args) {
		Scanner escaneador = new Scanner(System.in);
		int primeiroValor = 0;
		int segundoValor = 0;
		
		System.out.println("Digite o primeiro valor inteiro: ");
		primeiroValor = escaneador.nextInt();
		
		System.out.println("Digite o segundo valor inteiro: ");
		segundoValor = escaneador.nextInt();
		
		if (primeiroValor > segundoValor) {
			System.out.println("O primeiro valor " + primeiroValor + " é MAIOR que o segundo valor " + segundoValor);
		} else {
			if (primeiroValor < segundoValor) {
				System.out.println("O primeiro valor " + primeiroValor + " é MENOR que o segundo valor " + segundoValor);
			} else {
				if (primeiroValor == segundoValor) {
					System.out.println("O primeiro valor " + primeiroValor + " é IGUAL que o segundo valor " + segundoValor);
				} else {
					System.out.println("Erro");
				}
			}
		}
		escaneador.close();
	}
}
