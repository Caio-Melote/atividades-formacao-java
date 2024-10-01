package br.com.colections.metodos;

import br.com.colections.modelos.Smartphone;

public class EqualsTest {
	public static void main(String[] args) {
		String nome = "Teste";
		String nome2 = "Teste";
		System.out.println("Usando == 2 instâncias diretas");
		System.out.println("Resultado deve ser: true");
		System.out.println("Resultado (true or false):" + (nome == nome2));
		// '==' em Java compara as referências, desta maneira que a String foi criada ele verifica no String pool e as duas variáveis tem a mesma referência
		
		String frase = "Java";
		String frase2 = new String("Java");
		System.out.println("Usando '==' com 1 instancia direta e outra usando 'new String()' ");
		System.out.println("\nResultado deve ser: falso");
		System.out.println("Resultado (true or false):" + (frase == frase2));
		//Neste caso ao instanciar usando 'new String()' ele não verifica a String pool e instancia uma nova variável 
		
		String texto = "Skate";
		String texto2 = new String("Skate");
		System.out.println("Usando 'equals()' com 1 instancia direta e outra usando 'new String()' ");
		System.out.println("\nResultado deve ser: true");
		System.out.println("Resultado (true or false): " + texto.equals(texto2));
		//Usando 'equals()' na classe String, ele vai comparar o valor da String
		
		//------------------------------------------------------------------------------------------------------------------
		
		Smartphone s1 = new Smartphone(1,"1a2b3c","Maça",9899);
		Smartphone s2 = new Smartphone(2,"z1x2y3","Sumsang",7600);
		//Smartphone s3 = new Smartphone(3,"a9b8c7","Konia",5400);
		System.out.println("\nComparação de um objeto de outra classe modelo");
		System.out.println("Comparação com sebrescrita do equals na classe: " + s1.equals(s2));
		
	}
}
