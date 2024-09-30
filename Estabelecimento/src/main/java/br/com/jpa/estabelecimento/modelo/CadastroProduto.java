package br.com.jpa.estabelecimento.modelo;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.jpa.estabelecimento.dao.CategoriaDao;
import br.com.jpa.estabelecimento.dao.ProdutoDao;
import br.com.jpa.estabelecimento.util.JpaUtil;

public class CadastroProduto {
	public static void main(String[] args) {
		
		Categoria novaCategoria = new Categoria("TV");
		
		Produto novoProduto = new Produto("Samsung 60''","120Hz", new BigDecimal("3400.99"), novaCategoria);
		
		EntityManager em = JpaUtil.getEntityManager();
		
		ProdutoDao daoProduto = new ProdutoDao(em);
		CategoriaDao daoCategoria = new CategoriaDao(em);
		
		em.getTransaction().begin();
		
		daoCategoria.cadastrar(novaCategoria);
		daoProduto.cadastrar(novoProduto);
		
		em.getTransaction().commit();
		em.close();
	}
}
