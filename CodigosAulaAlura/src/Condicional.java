
public class Condicional {

	public static void main(String[] args) {
		int ano = 2006;
		boolean incluido = false;
		double notaFilme = 9.9;
		String tipoPlano = "VIP";
		
		if (ano >= 2000) {
			System.out.println("Filme dos anos 2000!!");
		} else {
			System.out.println("Filme antigo em!! Antes dos anos 2000.");
		}
		
		System.out.println("\nCondicional E ( && )\n");
		if (incluido == true && tipoPlano.equals("VIP")) {
			System.out.println("Filme disponível!");
		} else {
			System.out.println("Filme bloqueado!");
		}
		
		System.out.println("\nCondicional OU ( || )\n");
		if (incluido == true || tipoPlano.equals("VIP")) {
			System.out.println("Filme disponível!");
		} else {
			System.out.println("Filme bloqueado!");
		}
	}

}
