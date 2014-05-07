package com.jonasflesch.persistence.dao;

import java.util.List;

import com.jonasflesch.persistence.model.Voo;

public interface IVooDao {

	void saveVoos(List<Voo> voos);

	Voo findByDataENumero(String dataVoo, Integer numeroVoo);

	void saveVoo(Voo voo);

}
