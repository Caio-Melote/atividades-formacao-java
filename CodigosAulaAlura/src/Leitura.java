import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		Scanner leituraScanner = new Scanner(System.in);
		String filme = "";
		int ano = 0;
		double nota = 0;

		System.out.println("Digite um filme: ");
		filme = leituraScanner.nextLine();
		
		System.out.println("\nQual ano este filme foi lançado?");
		ano = leituraScanner.nextInt();
		
		System.out.println("\nQual a sua nota de 0,0 até 10,0 para o filme?");
		nota = leituraScanner.nextDouble();
		
		
		System.out.println("\nO filme inserido foi: " + filme);
		System.out.println("Este filme foi lançado no ano de: " + ano);
		System.out.println("Sua nota para o filme é: " + nota);
		
		leituraScanner.close();
	}

}
