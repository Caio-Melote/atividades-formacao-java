import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner escaneador = new Scanner(System.in);
		int i;
		double media = 0;
		double nota = 0;
		
		for (i = 0; i < 3; i++) {
			System.out.println("Digite a nota " + (i+1) + "º para o filme:");
			nota = escaneador.nextDouble();
			media += nota;
		}
		
		System.out.println("A nota final é de: " + media/3);
		
		escaneador.close();
	}

}
