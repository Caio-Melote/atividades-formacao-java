/* Crie um programa que solicite ao usuário digitar um número. 
 * Se o número for positivo, exiba "Número positivo", caso contrário, exiba 
 * "Número negativo".
 */

import java.util.Scanner;

public class Primeiro {

	public static void main(String[] args) {
		Scanner escaneador = new Scanner(System.in);
		double valor = 0;
		
		System.out.println("Digite o valor deseja verificar se é positivo ou negativo: ");
		valor = escaneador.nextDouble();
		
		if (valor >= 0) {
			System.out.println("O valor " + valor + " é positivo + !!");
		} else {
			System.out.println("O valor " + valor + " é negativo - !!");
		}
		
		escaneador.close();
	}

}
