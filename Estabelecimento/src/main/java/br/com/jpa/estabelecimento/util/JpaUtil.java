package br.com.jpa.estabelecimento.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
	private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("estabelecimento_banco_config");
	
	public static EntityManager getEntityManager() {
		return FACTORY.createEntityManager();
	}
	
	
}
