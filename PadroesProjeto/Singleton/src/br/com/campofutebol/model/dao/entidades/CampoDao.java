package br.com.campofutebol.model.dao.entidades;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.campofutebol.model.dao.interfaces.Dao;
import br.com.campofutebol.model.entidade.Campo;
import br.com.campofutebol.model.util.JPAUtil;

/**
 * Created by Luiz Fernando on 01/01/2020.
 */
public class CampoDao implements Dao<Campo> {

	private EntityManager manager;
	
	public CampoDao() {
		manager = JPAUtil.createEntityManger();
	}
	
	@Override
	public void inserir(Campo campo) {
		try {
			manager.getTransaction().begin();
			manager.persist(campo);
			manager.getTransaction().commit();
			
		} catch (Exception ex) {
			ex.getMessage();
	
		} finally {
			JPAUtil.closeEntityManager(manager);
		}
	}

	@Override
	public void alterar(Campo campo) {
	}

	@Override
	public void excluir(Campo campo) {
	}

	@Override
	public List<Campo> listarTodos() {
		return null;
	}
}