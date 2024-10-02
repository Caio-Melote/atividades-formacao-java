package br.com.jpa.estabelecimento.dao;

import javax.persistence.EntityManager;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import br.com.jpa.estabelecimento.modelo.Produto;

public class ProdutoDao {
	
	private EntityManager em;
	//private List<?> resultList;

	public ProdutoDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Produto produto) {
		this.em.persist(produto);
	}
	
	public void atualizarProduto(Produto produto) {
		this.em.merge(produto);
	}
	
	public Produto buscarId(Long id) {
		return em.find(Produto.class, id);
	}
	
	public List<Produto> buscarTodos(){
		String jpql = "SELECT p FROM Produto p";
		return em.createQuery(jpql, Produto.class).getResultList();
	}
	
	public List<Produto> buscarNome(String nome){
		String jpql = "SELECT p FROM Produto p WHERE p.nome = ?1";
		return em.createQuery(jpql, Produto.class)
				.setParameter(1, nome)
				.getResultList();
	}
	
/*	public List<Produto> buscarNome(String nome){
		String jpql = "SELECT p FROM Produto p WHERE p.nome = :naime";
		return em.createQuery(jpql, Produto.class)
				.setParameter("naime", nome)
				.getResultList();
	}*/
	
	
	public List<Produto> buscarCategoria(String nome){
		//String jpql = "SELECT p FROM Produto p WHERE p.categoria.nome = ?1";
		return em.createNamedQuery("produtoPorCategoria", Produto.class)
				.setParameter(1, nome)
				.getResultList();
	}
	
	
	public BigDecimal buscarPrecoComNome(String nome){
		String jpql = "SELECT p.preco FROM Produto p WHERE p.nome = ?1";
		return em.createQuery(jpql, BigDecimal.class)
				.setParameter(1, nome)
				.getSingleResult(); //Método para carregar um único registro
	}
	
	public List<Produto> buscaNativa(String nome) {
		String sql = "SELECT * FROM produtos WHERE nome = '"+nome+"'" ;				
		
		List<?> resultado = em.createNativeQuery(sql, Produto.class)
				.getResultList();
	
		return resultado.stream()
				.filter(Produto.class::isInstance)
	            .map(Produto.class::cast)
	            .collect(Collectors.toList());
	}
	
	public List<String> buscaNativaString(String nome) {
		String sql = "SELECT nome FROM produtos WHERE nome = '"+nome+"'" ;				
		
		List<?> resultado = em.createNativeQuery(sql)
				.getResultList();
	
		return resultado.stream()
				.filter(String.class::isInstance)
	            .map(String.class::cast)
	            .collect(Collectors.toList());
	}
	
}
