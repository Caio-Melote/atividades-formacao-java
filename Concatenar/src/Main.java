/* 3. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). 
 * Atribua valores a essas variáveis e concatene-as em uma mensagem. */

public class Main {

	public static void main(String[] args) {
		char letra = 'c';
		String frase = "A letra inicial do nome Caio é = ";
		String mensagemStringFormat = String.format("%s%c", frase, letra); //Primeira forma
		String mensagemConcat = frase + letra; //Segunda forma
		
		System.out.println("Concatenando:\n" + frase + "" + letra); // Terceira forma
		
		System.out.println(mensagemStringFormat);
		System.out.println(mensagemConcat);

	}

}
