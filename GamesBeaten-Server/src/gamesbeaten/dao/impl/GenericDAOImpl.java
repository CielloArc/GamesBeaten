package gamesbeaten.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;

import gamesbeaten.dao.GenericDAO;

public class GenericDAOImpl<T, K> implements GenericDAO<T, K> {
	
	protected EntityManager em = null;
	private Class<T> classe = null;
	
	public GenericDAOImpl(EntityManager em) {
		super();
		this.em = em;
		classe = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	@Override
	public void casdastrar(T entidade) {
		em.persist(entidade);	
	}

	@Override
	public T buscar(K codigo) {
		return em.find(classe, codigo);
	}

	@Override
	public void atualizar(T entidade) {
		em.merge(entidade);
	}

	@Override
	public List<T> listar() {
		return em.createQuery("FROM Jogo j").setMaxResults(100).getResultList();
	}

	@Override
	public void remover(K codigo) {
		em.remove(codigo);		
	}

	@Override
	public void commit() throws Exception {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new Exception();
		}finally {
			em.close();
		}
	}

}
