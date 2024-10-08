package br.com.cartao.principal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import br.com.cartao.modelo.Cartao;
import br.com.cartao.modelo.Compras;

public class Principio {

	public static void main(String[] args) {
		int menu = 1;
		String nome = "";
		double valor = 0;
		double limiteCartao = 0;
		boolean compraAutorizada = false;
		Scanner escaneador = new Scanner(System.in);	
		List<Compras> listagemCompras = new ArrayList<Compras>();
		
		
		System.out.println("Insira o valor do limite do cartão: ");
		limiteCartao = escaneador.nextDouble();
		Cartao card = new Cartao(limiteCartao);
		
		while (menu != 0){	
			
			System.out.println("Insira o nome do produto que você irá comprar:");
			nome = escaneador.next();
			
			System.out.println("Insira o valor da compra:");
			valor = escaneador.nextDouble();
			
			Compras produto = new Compras(nome,valor);
			
			compraAutorizada = card.registraCompra(produto);
			
			if (compraAutorizada == true) {
				listagemCompras.add(produto);	
				System.out.println("\nCompra registrada com sucesso");				
			} else {
				System.out.println("\n!! Seu saldo é insuficiente !!");
			}
			
			System.out.println("\nDigite 1 para continuar e 0 para encerrar\n");
			menu = escaneador.nextInt();
			}
		
//		for(Compras p :listagemCompras) {
//		System.out.println("+_+_ LISTA +_+_" + listagemCompras.toString());	
//		System.out.println("Você ainda tem: R$ " + card.getLimite() + " de limite");
//	}
	listagemCompras.sort(Comparator.comparingDouble(Compras :: getValor));
	for (int i = 0; i < listagemCompras.size(); i++) {
		System.out.println(listagemCompras.get(i));			
		}
	System.out.println("Seu limite atual é de: R$ " + card.getLimite());
	
	escaneador.close();

	}

}
