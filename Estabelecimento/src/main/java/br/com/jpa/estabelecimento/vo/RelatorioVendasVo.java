package br.com.jpa.estabelecimento.vo;

import java.time.LocalDate;

public class RelatorioVendasVo {
	
	private String nomeProduto;
	private Long quantidadeVendida;
	private LocalDate dataUltimaVenda;
	
	public RelatorioVendasVo(String nomeProduto, Long quantidadeVendida, LocalDate dataUltimaVenda) {
		super();
		this.nomeProduto = nomeProduto;
		this.quantidadeVendida = quantidadeVendida;
		this.dataUltimaVenda = dataUltimaVenda;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public Long getQuantidadeVendida() {
		return quantidadeVendida;
	}

	public LocalDate getDataUltimaVenda() {
		return dataUltimaVenda;
	}

	@Override
	public String toString() {
		return "Relatorio de vendas: "
				+ "\nNome do produto = " + nomeProduto 
				+ "\nQuantidade vendida = " + quantidadeVendida
				+ "\nData da ultima venda = " + dataUltimaVenda;
	}
	
	
}
