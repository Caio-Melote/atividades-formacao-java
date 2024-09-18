package br.com.pessoa.modelo;

public class Pessoa {
	
	//Atributos
	private String nome;
	private int idade;
	
	//Getter
	public String getNome () {
		return this.nome;
	}
	
	public int getIdade () {
		return this.idade;
	}
	
	//Setter
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setIdade (int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Nome pessoa: " + this.nome + " // Idade pessoa: " + this.idade + "\n";
	}
}
