package br.com.colections.modelos;

import java.util.Objects;

public class Perfumes {
	
	private Integer id;
	private String nome;
	private double preco;
	private int quantidade;
	
	
	
	public Perfumes(Integer id, String nome, double preco, int quantidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	private Integer getId() {
		return id;
	}
	private void setId(Integer id) {
		this.id = id;
	}
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private double getPreco() {
		return preco;
	}
	private void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	private void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "\nPerfumes: \nId = " + id 
				+ "\nNome = " + nome 
				+ "\nPreco = " + preco 
				+ "\nQuantidade = " + quantidade + "\n--------------------------------";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfumes other = (Perfumes) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

	
	
	
	
	
}
