package br.com.jpa.estabelecimento.dao;

import javax.persistence.EntityManager;

import br.com.jpa.estabelecimento.modelo.Categoria;
import br.com.jpa.estabelecimento.modelo.Produto;

public class CategoriaDao {
	
	private EntityManager em;

	public CategoriaDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Categoria categoria) {
		this.em.persist(categoria);
	}
	
	public void atualizarCategoria(Categoria categoria) {
		this.em.merge(categoria);
	}
	
	
}
