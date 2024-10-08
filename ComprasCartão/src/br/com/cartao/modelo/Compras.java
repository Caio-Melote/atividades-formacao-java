package br.com.cartao.modelo;

public class Compras {
	
	private String nome;
	private double valor;
	
	
	public Compras(String nome, double valor) {
		setNome(nome);
		setValor(valor);
	}
	
	//getter
	public String getNome() {
		return nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	//setter
	private void setNome(String nome) {
		this.nome = nome;
	}
	
	private void setValor(double valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return "\nProduto: " + this.nome + "\nValor: R$ " + this.valor + "\n";
	}
	
}
