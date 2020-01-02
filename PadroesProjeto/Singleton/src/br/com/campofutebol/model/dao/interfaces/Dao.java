package br.com.campofutebol.model.dao.interfaces;

import java.util.List;

/**
 * Created by Luiz Fernando on 01/01/2020.
 */
public interface Dao<T> {

	public void inserir(T entidade);

	public void alterar(T entidade);
	
	public void excluir(T entidade);
	
	public List<T> listarTodos();	
}