package com.ipartek.formacion.service;

import java.util.List;

import com.ipartek.formacion.domain.Estadistica;
import com.ipartek.formacion.domain.Lanzamientos;

public interface ServiceEstadisticas {

	List<Estadistica> getEstadisticas();
	
	List<Estadistica> getEstadisticasTotales();
	
	int total();

	List<Lanzamientos> getUltimos();
	
}
