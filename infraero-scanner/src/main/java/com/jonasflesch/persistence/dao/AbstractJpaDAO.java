package com.jonasflesch.persistence.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;

import org.springframework.beans.factory.annotation.Qualifier;

public abstract class AbstractJpaDAO<T extends Serializable> {

	private Class<T> clazz;

	@PersistenceContext(unitName = "appPU")
	@Qualifier(value = "entityManagerFactoryBean")
	protected EntityManager entityManager;

	public final void setClazz(final Class<T> clazzToSet) {
		this.clazz = clazzToSet;
	}

	public T findOne(final long id) {
		return entityManager.find(clazz, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return entityManager.createQuery("from " + clazz.getName()).getResultList();
	}

	public void create(final T entity) {
		entityManager.persist(entity);
	}

	public T update(final T entity) {
		return entityManager.merge(entity);
	}

	public void delete(final T entity) {
		entityManager.remove(entity);
	}

	public void deleteById(final long entityId) {
		final T entity = findOne(entityId);
		delete(entity);
	}

	public CriteriaBuilder criteriaBuilder() {
		return entityManager.getCriteriaBuilder();
	}

}