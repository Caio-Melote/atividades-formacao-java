package br.com.jpa.estabelecimento.dao;

import javax.persistence.EntityManager;

import br.com.jpa.estabelecimento.modelo.Produto;

public class ProdutoDao {
	
	private EntityManager em;

	public ProdutoDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Produto produto) {
		this.em.persist(produto);
	}
	
	public void atualizarProduto(Produto produto) {
		this.em.merge(produto);
	}
	
	
}
