package br.com.lgr.oficina.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.exception.SQLGrammarException;

public class BaseDao<T> {

	@PersistenceContext(unitName="oficina-unit")
	private EntityManager em;
	
	public void inserir(T t) throws SQLGrammarException, javax.persistence.PersistenceException {
		em.persist(t);
	}

	public EntityManager getEm() {
		return em;
	}
	public void setEm(EntityManager em) {
		this.em = em;
	}
}
