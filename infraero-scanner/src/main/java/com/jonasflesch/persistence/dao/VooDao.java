package com.jonasflesch.persistence.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.jonasflesch.persistence.model.Voo;

@Repository
public class VooDao extends AbstractJpaDAO<Voo> implements IVooDao {

	public VooDao() {
		super();

		setClazz(Voo.class);
	}

	@Override
	public void saveVoos(List<Voo> voos) {
		for (Voo voo : voos) {
			create(voo);
		}
	}

	@Override
	public void saveVoo(Voo voo) {
		create(voo);
	}

	@Override
	public Voo findByDataENumero(String dataVoo, Integer numeroVoo) {
		CriteriaBuilder cb = criteriaBuilder();
		CriteriaQuery<Voo> criteria = cb.createQuery(Voo.class);
		Root<Voo> c = criteria.from(Voo.class);
		CriteriaQuery<Voo> query = criteria.select(c).where(cb.and(cb.equal(c.get("dataVoo"), dataVoo)), cb.equal(c.get("numeroVoo"), numeroVoo));
		List<Voo> voosResult = entityManager.createQuery(query).getResultList();
		if (voosResult == null || voosResult.isEmpty()) {
			return null;
		}
		return voosResult.get(0);
	}

}
