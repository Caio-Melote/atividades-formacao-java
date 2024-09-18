
public class Main {

	public static void main(String[] args) {
		double celsius, fahrenheit = 0;
		
		celsius = 34;
		
		fahrenheit = (celsius * 1.8) + 32;
		
		String mensagem = String.format("A temperatura de %.2f Celsius é equivalente a %.2f Fahrenheit\n\n", celsius, fahrenheit);
		
		System.out.print(mensagem);
		
		System.out.print("A temperatura em Celsius é de "+ celsius +" e convertendo para Fahrenheit é = "+ fahrenheit);
	}

}
