import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner escaneador = new Scanner(System.in);
		int i = 0;
		int limite = 0;
		
		System.out.println("Insira o valor limite para i: ");
		limite = escaneador.nextInt();
		
		
		while (i != limite) {
			i++;
			System.out.println("O valor de i é = "+ i);			
		}
		
		escaneador.close();
	}

}
