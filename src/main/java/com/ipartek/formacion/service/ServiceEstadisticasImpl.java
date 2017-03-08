package com.ipartek.formacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.formacion.domain.Estadistica;
import com.ipartek.formacion.domain.Lanzamientos;
import com.ipartek.formacion.repository.DAOTirada;

/**
 * Implementacion de la interfaz del servicio de Estadásticas
 * 
 * @author Curso
 *
 */
@Service(value = "serviceEstadisticas")
public class ServiceEstadisticasImpl implements ServiceEstadisticas {

	private final int PORCENTAJE = 100;
	
	@Autowired()
	private DAOTirada daoTirada;

	@Override()
	public List<Estadistica> getEstadisticas() {
		int total = this.daoTirada.total();
		List<Estadistica> estadisticas = this.daoTirada.getEstadisticas();
		float calculo;
		if(total > 0) {
			for(Estadistica e:estadisticas){
				calculo = e.getContador()*this.PORCENTAJE/total;
				e.setProbabilidad(Math.round(calculo));
			}
		}
		return estadisticas;
	}

	@Override()
	public List<Estadistica> getEstadisticasTotales() {
		int total = this.daoTirada.total();
		List<Estadistica> estadisticas = this.daoTirada.getEstadisticasTotales();
		float calculo;
		if(total > 0) {
			for(Estadistica e:estadisticas){
				calculo = e.getContador()*this.PORCENTAJE/total;
				e.setProbabilidad(Math.round(calculo));
			}
		}
		return estadisticas;
	}

	@Override()
	public int total() {
		return this.daoTirada.total();
	}

	@Override()
	public List<Lanzamientos> getUltimos(int n) {
		return this.daoTirada.getUltimos(n);
	}

	@Override()
	public List<Lanzamientos> getAllLanzamientos() {
		return this.daoTirada.getAllLanzamientos();
	}

}
