/* 6. Declare uma variável do tipo double precoOriginal. Atribua um valor em reais 
 * a essa variável, representando o preço original de um produto. Em seguida, 
 * declare uma variável do tipo double percentualDesconto e atribua um valor 
 * percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor 
 * do desconto em reais, aplique ao preço original e imprima o novo preço com desconto.*/
public class Main {

	public static void main(String[] args) {
		double precoOriginal, percentualDesconto, descontoReais, resultado = 0;
		
		precoOriginal = 200.0;
		percentualDesconto = 10;
		
		descontoReais = (precoOriginal / 100) * percentualDesconto;
		resultado = precoOriginal - descontoReais;
		
		System.out.println("O valor original é de R$ " + precoOriginal + "\nO percentual de desconto é de " + percentualDesconto + "% que resulta em um valor de R$ " + descontoReais + "\nAssim o preço final é de R$ " + resultado );

	}

}
