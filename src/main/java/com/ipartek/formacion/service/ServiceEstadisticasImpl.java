package com.ipartek.formacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.formacion.domain.Estadistica;
import com.ipartek.formacion.domain.Lanzamientos;
import com.ipartek.formacion.repository.DAOTirada;

@Service(value ="serviceEstadisticas")
public class ServiceEstadisticasImpl implements ServiceEstadisticas {

	@Autowired()
	private DAOTirada daoTirada;

	@Override()
	public List<Estadistica> getEstadisticas() {
		return this.daoTirada.getEstadisticas();
	}

	@Override()
	public List<Estadistica> getEstadisticasTotales() {
		return this.daoTirada.getEstadisticasTotales();
	}

	@Override()
	public int total() {
		return this.daoTirada.total();
	}

	@Override()
	public List<Lanzamientos> getUltimos() {
		return this.daoTirada.getUltimos();
	}

	@Override()
	public List<Lanzamientos> getUltimos(int n) {
		return this.daoTirada.getUltimos(n);
	}

}
