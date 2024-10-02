package br.com.jpa.estabelecimento.dao;

import javax.persistence.EntityManager;

import br.com.jpa.estabelecimento.modelo.Cliente;


public class ClienteDao {
	
	private EntityManager em;
	//private List<?> resultList;

	public ClienteDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Cliente cliente) {
		this.em.persist(cliente);
	}
	
	public Cliente buscarId(Long id) {
	return em.find(Cliente.class, id);
}
	
}
