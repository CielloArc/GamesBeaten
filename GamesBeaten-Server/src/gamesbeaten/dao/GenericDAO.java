package gamesbeaten.dao;

import java.util.List;

import gamesbeaten.entity.Jogo;

public interface GenericDAO<T, K> {
	void casdastrar(T entidade);
	T buscar(K codigo);
	void atualizar(T entidade);
	List<T> listar();
	void remover(K codigo);
	void commit() throws Exception;
}
