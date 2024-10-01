
public class Main {

	public static void main(String[] args) {
		System.out.println("------ INICIANDO ------");
		System.out.println("\nFilme = Velozes e furiosos: Desafio em Tokyo\n");
		
		int ano = 2006;
		System.out.println("Lançamento = Ano de " + ano + "\n");
		
		//boolean incluido = true;
		double notaFilme = 8;
		double media = (notaFilme + 9) / 2;
		System.out.println("Media da nota = " + media + "\n"); 
		
		String resumo;
		resumo = "Resumo = Carros, drift e muita cultura japonesa";
		System.out.println(resumo + "\n");
		
		String sinopse;
		sinopse = """
				Teste = Testando formatação nova
				Um modelo diferente que veio com Java 15 
				""";
		System.out.println(sinopse);
		
		int novo;
		novo = (int) (media / 2);
		System.out.println("Conversão para int = " + novo);
	
	}

}
