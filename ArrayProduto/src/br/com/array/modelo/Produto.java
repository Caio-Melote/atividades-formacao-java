package br.com.array.modelo;

import br.com.array.faces.RepresentaString;

public class Produto implements RepresentaString {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	//Construtor
	public Produto(String nome, double preco, int quantidade) {
		setNome(nome);
		setPreco(preco);
		setQuantidade(quantidade);
	}
	
	//Getter
	public String getNome () {
		return this.nome;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	//Setter
	private void setNome (String nome) {
		this.nome = nome;
	}
	
	private void setPreco (double preco) {
		this.preco = preco;
	}
	
	private void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "Produto: " + nome + "\nQuantidade: " + quantidade + "\nPreço unitário: R$ " + preco;
	}
}
