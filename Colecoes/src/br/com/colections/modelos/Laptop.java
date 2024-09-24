package br.com.colections.modelos;

import java.util.Objects;

public class Laptop implements Comparable<Laptop> {
	
	private Integer id;
	private String nome;
	private double preco;
	
	public Laptop(Integer id, String nome, double preco) {
		Objects.requireNonNull(id, "O ID não pode ser null");
		Objects.requireNonNull(nome,"O Nome não pode ser null");
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
		
	public Integer getId() {
		return id;
	}
	private void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
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

	@Override
	public String toString() {
		return "Laptop: "
				+ "\nId = " + id 
				+ "\nNome = " + nome 
				+ "\nPreco = " + preco;
	}

	@Override
	public int compareTo(Laptop l) {
//		if(this.id < l.getId()) {
//			return -1;
//		} else if(this.id.equals(l.getId())) {
//			return 0;
//		} else {
//			return 1;
//		}
		
		//Ordenado pelo ID:
		//return this.id.compareTo(l.getId());
		
		//Ordenado pelo nome:
		return this.nome.compareTo(l.getNome());
	}
	
	
	
	
}
