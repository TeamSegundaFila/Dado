package com.ipartek.formacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ipartek.formacion.domain.Estadistica;
import com.ipartek.formacion.repository.DAOTirada;

public class ServiceEstadisticasImpl implements ServiceEstadisticas {

	@Autowired
	private DAOTirada daoTirada;
	
	@Override
	public List<Estadistica> getEstadisticas() {
		return daoTirada.getEstadisticas();
	}

	@Override
	public List<Estadistica> getEstadisticasTotales() {
		return daoTirada.getEstadisticasTotales();
	}

}
