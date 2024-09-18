import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

import br.com.array.modelo.Produto;
import br.com.array.modelo.ProdutoPerecivel;

public class Principal {

	public static void main(String[] args) {
		
		//ArrayList<Produto> produto = new ArrayList<>();
		var listaProduto = new ArrayList<Produto>();
		var listaProdutoPerecivel = new ArrayList<ProdutoPerecivel>();
		Scanner escaneador = new Scanner(System.in);
		
		String nome = "";
		double preco = 0;
		int quantidade = 0;
		int ano = 0;
		int mes = 0;
		int dia = 0;
		
		System.out.println("=-=-=-=-=-=-=-=-=- Produto -=-=-=-=-=-=-=-=-= ");
		for(int i = 0; i < 2; i++) {
			
			System.out.println("Insira o nome do produto: ");
			nome = escaneador.next();
			
			System.out.println("Insira o preço do produto: ");
			preco = escaneador.nextDouble();
			
			System.out.println("Insira a quantidade do produto: ");
			quantidade = escaneador.nextInt();
						
			System.out.println("\n\n");
			
			Produto produto = new Produto(nome,preco,quantidade);
			
			listaProduto.add(produto);
		}
		
		System.out.println("=-=-=-=-=-=-=-=-=- Produto Perecível -=-=-=-=-=-=-=-=-= ");
		for(int i = 0; i < 2; i++) {
			
			System.out.println("Insira o nome do produto: ");
			nome = escaneador.next();
			
			System.out.println("Insira o preço do produto: ");
			preco = escaneador.nextDouble();
			
			System.out.println("Insira a quantidade do produto: ");
			quantidade = escaneador.nextInt();
			
			System.out.println("Insira o ano de vencimento (ano = aaaa): ");
            ano = escaneador.nextInt();
            
            System.out.println("Insira a mês de vencimento (mês = mm): ");
            mes = escaneador.nextInt();
			
            System.out.println("Insira a dia de vencimento (dia = dd): ");
            dia = escaneador.nextInt();
            
            LocalDate dataValidade = LocalDate.of(ano, mes, dia);
            ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel(nome,preco,quantidade,dataValidade);
            
            listaProdutoPerecivel.add(produtoPerecivel);
		}
		
		for(ProdutoPerecivel pp :listaProdutoPerecivel) {
			System.out.println("\n"+pp);
		}
			
		
		for (Produto p : listaProduto) {
			System.out.println("\n"+p);
		}
			
	}
}
