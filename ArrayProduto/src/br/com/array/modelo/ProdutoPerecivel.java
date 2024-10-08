package br.com.array.modelo;

import java.time.LocalDate;

import br.com.array.faces.RepresentaString;

public class ProdutoPerecivel extends Produto implements RepresentaString{
	
	private LocalDate dataValidade;  
	
	//Construtor
	public ProdutoPerecivel(String nome, double preco, int quantidade, LocalDate dataValidade) {
		super(nome, preco,quantidade);
		setDataValidade(dataValidade);
	}
	
	//Getter
	public LocalDate getDataValidade() {
		return dataValidade;
	}
	
	//Setter
	private void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nData de validade: " + dataValidade;
	}
	
}
