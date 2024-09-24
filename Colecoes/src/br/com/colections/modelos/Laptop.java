package br.com.colections.modelos;

import java.util.Objects;

public class Laptop {
	
	private int id;
	private String nome;
	private double preco;
	
	public Laptop(int id, String nome, double preco) {
		Objects.requireNonNull(id, "O ID não pode ser null");
		Objects.requireNonNull(nome,"O Nome não pode ser null");
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
		
	private int getId() {
		return id;
	}
	private void setId(int id) {
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
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, nome, preco);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return id == other.id && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}
	
	
	
}
