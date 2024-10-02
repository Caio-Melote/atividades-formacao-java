package br.com.jpa.estabelecimento.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.jpa.estabelecimento.modelo.Pedidos;
import br.com.jpa.estabelecimento.vo.RelatorioVendasVo;


public class PedidoDao {
	
	private EntityManager em;
	//private List<?> resultList;

	public PedidoDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Pedidos pedido) {
		this.em.persist(pedido);
	}
	
	public BigDecimal valorTotalVendas() {
		String jpql = "SELECT SUM(p.valorTotal) FROM Pedidos p ";
		
		return em.createQuery(jpql, BigDecimal.class)
				.getSingleResult();
	}
	
	public List<RelatorioVendasVo> relatorioVendas(){
		String jpql = "SELECT new br.com.jpa.estabelecimento.vo.RelatorioVendasVo(produto.nome, SUM(item.quantidade), MAX(pedido.dataCadastro))"
				+ "FROM Pedidos pedido JOIN pedido.itens item JOIN item.produto produto "
				+ "GROUP BY produto.nome "
				+ "ORDER BY SUM(item.quantidade)";
	
		return em.createQuery(jpql, RelatorioVendasVo.class).getResultList();
	}
	
//	public void atualizarProduto(Pedidos pedido) {
//		this.em.merge(pedido);
//	}
//	
//	public Pedidos buscarId(Long id) {
//		return em.find(Pedidos.class, id);
//	}
//	
//	public List<Pedidos> buscarTodos(){
//		String jpql = "SELECT p FROM Produto p";
//		return em.createQuery(jpql, Pedidos.class).getResultList();
//	}
//	
//	public List<Pedidos> buscarNome(String nome){
//		String jpql = "SELECT p FROM Produto p WHERE p.nome = ?1";
//		return em.createQuery(jpql, Pedidos.class)
//				.setParameter(1, nome)
//				.getResultList();
//	}
//	
//   /*	public List<Produto> buscarNome(String nome){
//		String jpql = "SELECT p FROM Pedidos p WHERE p.nome = :naime";
//		return em.createQuery(jpql, Pedidos.class)
//				.setParameter("naime", nome)
//				.getResultList();
//	}*/
//	
//	
//	public List<Pedidos> buscarCategoria(String nome){
//		String jpql = "SELECT p FROM Produto p WHERE p.categoria.nome = ?1";
//		return em.createQuery(jpql, Pedidos.class)
//				.setParameter(1, nome)
//				.getResultList();
//	}
//	
//	
//	public BigDecimal buscarPrecoComNome(String nome){
//		String jpql = "SELECT p.preco FROM Produto p WHERE p.nome = ?1";
//		return em.createQuery(jpql, BigDecimal.class)
//				.setParameter(1, nome)
//				.getSingleResult(); //Método para carregar um único registro
//	}
//	
//	public List<Pedidos> buscaNativa(String nome) {
//		String sql = "SELECT * FROM produtos WHERE nome = '"+nome+"'" ;				
//		
//		List<?> resultado = em.createNativeQuery(sql, Pedidos.class)
//				.getResultList();
//	
//		return resultado.stream()
//				.filter(Pedidos.class::isInstance)
//	            .map(Pedidos.class::cast)
//	            .collect(Collectors.toList());
//	}
//	
//	public List<String> buscaNativaString(String nome) {
//		String sql = "SELECT nome FROM produtos WHERE nome = '"+nome+"'" ;				
//		
//		List<?> resultado = em.createNativeQuery(sql)
//				.getResultList();
//	
//		return resultado.stream()
//				.filter(String.class::isInstance)
//	            .map(String.class::cast)
//	            .collect(Collectors.toList());
//	}
	
}
