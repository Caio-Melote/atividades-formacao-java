/* Crie uma classe Calculadora com um método que recebe um número 
 * como parâmetro e retorna o dobro desse número.*/

public class Principal {

	public static void main(String[] args) {
		double valor = 0;
		
		valor = 25;
		
		Calculadora x = new Calculadora();
		
		x.numero = x.dobrarNumero(valor);
		
		System.out.println("O valor é: " + valor + "\nO dobro deste valor é: " + x.numero);

	}

}
