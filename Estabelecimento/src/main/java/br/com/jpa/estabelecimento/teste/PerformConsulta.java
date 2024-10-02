package br.com.jpa.estabelecimento.teste;
import javax.persistence.EntityManager;

import br.com.jpa.estabelecimento.dao.PedidoDao;
import br.com.jpa.estabelecimento.modelo.Pedidos;
import br.com.jpa.estabelecimento.util.JpaUtil;

public class PerformConsulta {
	public static void main(String[] args) {
		EntityManager em = JpaUtil.getEntityManager();
		PedidoDao pedidoDao = new PedidoDao(em);
		Pedidos pedido = pedidoDao.buscarPedidoComCliente(1l);
		em.close();
		System.out.println(pedido.getCliente().getDadosPessoais().getNome());
	}
}
