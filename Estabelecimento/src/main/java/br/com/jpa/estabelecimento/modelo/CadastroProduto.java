package br.com.jpa.estabelecimento.modelo;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List;
import br.com.jpa.estabelecimento.dao.CategoriaDao;
import br.com.jpa.estabelecimento.dao.ProdutoDao;
import br.com.jpa.estabelecimento.util.JpaUtil;

public class CadastroProduto {
	public static void main(String[] args) {
		
		//cadastrarProduto();
		
		//Busca por ID
		EntityManager em = JpaUtil.getEntityManager();
		ProdutoDao daoProduto = new ProdutoDao(em);
		Produto p = daoProduto.buscarId(2l);
		System.out.println("Imprimindo preço do produto buscado por ID: ");
		System.out.println(p.getPreco());
		System.out.println("=-------------------------------------= ");
		
		//Busca todos e coloca em uma lista
		List<Produto> listaProdutos = daoProduto.buscarTodos();
		
		//Busca filtrando e coloca em uma lista
		List<Produto> listaFiltrados = daoProduto.buscarNome("BRASTEMP");
		
		//Busca filtrando categoria e coloca em uma lista
		List<Produto> listaCategoriaList = daoProduto.buscarCategoria("GELADEIRA");
		
		//Busca apenas 1 registro
		BigDecimal precoProduto = daoProduto.buscarPrecoComNome("BRASTEMP");
		System.out.println("=------------------------=");
		System.out.println("O preco do produto 'BRASTEMP' é: "+ precoProduto);
		
		//Primeira maneira de imprimir toda a lista
		//listaProdutos.forEach(p2 -> System.out.println(p.getDescricao())); 
		
		//Segunda maneira de imprimir toda a lista
			//Lista de todos
		System.out.println("=-------------------------------------= ");
		System.out.println("Imprimindo lista de nomes de todos os produtos: ");
		for(Produto prod : listaProdutos) {
			System.out.println(prod.getNome());
		}
		
			//Lista de produtos filtrados
		System.out.println("=-------------------------------------= ");
		System.out.println("Imprimindo lista de nomes dos produtos filtrados: ");		
		for(Produto prd : listaFiltrados) {
			System.out.println(prd.getNome());
		}
		
			//Lista filtrada por categoria
		System.out.println("=-------------------------------------= ");
		System.out.println("Imprimindo lista nomes filtrados por categoria: ");		
		for(Produto cat : listaCategoriaList) {
			System.out.println(cat.getNome());
		}
	}

	private static void cadastrarProduto() {
		
		Categoria novaCategoria = new Categoria("GELADEIRA");		
		Produto novoProduto = new Produto("BRASTEMP","487L Frost Free", new BigDecimal("5690.50"), novaCategoria);
		
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
