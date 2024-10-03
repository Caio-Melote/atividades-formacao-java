package br.com.jpa.estabelecimento.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

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
		
		List<?> listaResultado = em.createNativeQuery(sql, Produto.class)
				.getResultList();
	
		List<Produto> produtos = new ArrayList<>(); 

	    for (Object obj : listaResultado) { 
	        if (obj instanceof Produto) { 
	        	Produto produto = new Produto();
	        	produto = (Produto) obj;
	            produtos.add(produto); 
	        }
	    }
	    
	    return produtos; 
	    
//		return resultado.stream()
//				.filter(Produto.class::isInstance)
//	            .map(Produto.class::cast)
//	            .collect(Collectors.toList());
	}
	
	public List<String> buscaNativaString(String nome) {
		String sql = "SELECT nome FROM produtos WHERE nome = '"+nome+"'" ;				
		
		List<?> resultado = em.createNativeQuery(sql)
				.getResultList();
		
		List<String> stringList = new ArrayList<>();
		
		for(Object object : resultado) {
			if (object instanceof String) {
				String novaString = new String();
				novaString = (String)object;
				stringList.add(novaString);
			}
		}
		return stringList;
		
//		return resultado.stream()
//				.filter(String.class::isInstance)
//	            .map(String.class::cast)
//	            .collect(Collectors.toList());
	}
	
	public List<Produto> buscarPorParametros(String nome, 
			BigDecimal preco, LocalDate dataCadastro) {
		String jpql = "SELECT p FROM Produto p WHERE 1=1 ";
		if (nome != null && !nome.trim().isEmpty()) {
			jpql = " AND p.nome = :nome ";
		}
		if (preco != null) {
			jpql = " AND p.preco = :preco ";
		}
		if (dataCadastro != null) {
			jpql = " AND p.dataCadastro = :dataCadastro ";
		}
		TypedQuery<Produto> query = em.createQuery(jpql, Produto.class);
		if (nome != null && !nome.trim().isEmpty()) {
			query.setParameter("nome", nome);
		}
		if (preco != null) {
			query.setParameter("preco", preco);
		}
		if (dataCadastro != null) {
			query.setParameter("dataCadastro", dataCadastro);
		}
		
		return query.getResultList();
	}
	
	public List<Produto> buscarPorParametrosComCriteria(String nome, 
			BigDecimal preco, LocalDate dataCadastro) {
	
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Produto> query = builder.createQuery(Produto.class);
		Root<Produto> from = query.from(Produto.class);
		
		Predicate novoAND = builder.and();
		if (nome != null && !nome.trim().isEmpty()) {
			novoAND = builder.and(novoAND, builder.equal(from.get("nome"), nome));
		}
		if (preco != null) {
			novoAND = builder.and(novoAND, builder.equal(from.get("preco"), preco));
		}
		if (dataCadastro != null) {
			novoAND = builder.and(novoAND, builder.equal(from.get("dataCadastro"), dataCadastro));
		}
		query.where(novoAND);
		
		List<Produto> listaResultado = em.createQuery(query).getResultList();
		
		return listaResultado;
	}
	
	public void fechar() {
		em.close();
	}
}
