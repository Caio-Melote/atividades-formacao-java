/* 4. Declare uma variável do tipo double precoProduto e uma variável do tipo int 
 * (quantidade). Calcule o valor total multiplicando o preço do produto pela 
 * quantidade e apresente o resultado em uma mensagem.*/

public class Main {

	public static void main(String[] args) {
		double precoProduto, resultado = 0;
		int quantidade = 0;
		String mensagem = "";
		
		precoProduto = 7.75;
		quantidade = 4;
		
		resultado = precoProduto * quantidade;
		
		mensagem = String.format("O resultado final é = R$ %.2f", resultado);
		
		System.out.println(mensagem);
		System.out.println("O resultado final é = R$ " + resultado);
	}

}
