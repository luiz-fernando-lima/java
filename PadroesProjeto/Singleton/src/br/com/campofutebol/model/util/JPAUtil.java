package br.com.campofutebol.model.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Luiz Fernando on 01/01/2020.
 */
public class JPAUtil {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");

	public static EntityManager createEntityManger() {
		return factory.createEntityManager();
	}

	public static void closeEntityManager(EntityManager manager) {
		if(manager != null && manager.isOpen())
			manager.clear();
	}
}