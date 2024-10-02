package br.com.jpa.estabelecimento.teste;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.jpa.estabelecimento.dao.CategoriaDao;
import br.com.jpa.estabelecimento.dao.ClienteDao;
import br.com.jpa.estabelecimento.dao.PedidoDao;
import br.com.jpa.estabelecimento.dao.ProdutoDao;
import br.com.jpa.estabelecimento.modelo.Categoria;
import br.com.jpa.estabelecimento.modelo.Cliente;
import br.com.jpa.estabelecimento.modelo.ItemPedido;
import br.com.jpa.estabelecimento.modelo.Pedidos;
import br.com.jpa.estabelecimento.modelo.Produto;
import br.com.jpa.estabelecimento.util.JpaUtil;
import br.com.jpa.estabelecimento.vo.RelatorioVendasVo;

public class CadastroPedido {

	public static void main(String[] args) {
		//cadastrarProduto();
		
		EntityManager em = JpaUtil.getEntityManager();
		ProdutoDao daoProduto = new ProdutoDao(em);
		ClienteDao daoCliente = new ClienteDao(em);
		
		Produto produto = daoProduto.buscarId(1l);
		Cliente cliente = daoCliente.buscarId(1l);
		
		em.getTransaction().begin();
		
		Pedidos pedido = new Pedidos(cliente);
		pedido.adicionarItem(new ItemPedido(1, pedido, produto));
		
		PedidoDao daoPedido = new PedidoDao(em);
		//daoPedido.cadastrar(pedido);
		
		em.getTransaction().commit();
		
		BigDecimal totalVendidoBigDecimal = daoPedido.valorTotalVendas();
		System.out.println("Valor total: " + totalVendidoBigDecimal);
		
		
		List<RelatorioVendasVo> relatorioVendas = daoPedido.relatorioVendas();
		
		for (RelatorioVendasVo obj : relatorioVendas) {
			System.out.println(obj);
		}
	}

	private static void cadastrarProduto() {

		Categoria novaCategoria = new Categoria("TV");
		Produto novoProduto = new Produto("PHILCO", "120Hz", new BigDecimal("3480.65"), novaCategoria);
		
		Cliente cliente = new Cliente("Melo", "887766");
		
		EntityManager em = JpaUtil.getEntityManager();

		ProdutoDao daoProduto = new ProdutoDao(em);
		CategoriaDao daoCategoria = new CategoriaDao(em);
		ClienteDao daoCliente = new ClienteDao(em);
		
		em.getTransaction().begin();

		daoCategoria.cadastrar(novaCategoria);
		daoProduto.cadastrar(novoProduto);
		daoCliente.cadastrar(cliente);

		em.getTransaction().commit();
		em.close();
	}

}
