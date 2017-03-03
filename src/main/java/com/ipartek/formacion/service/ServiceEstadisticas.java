package com.ipartek.formacion.service;

import java.util.List;

import com.ipartek.formacion.domain.Estadistica;

public interface ServiceEstadisticas {

	List<Estadistica> getEstadisticas();
	
	List<Estadistica> getEstadisticasTotales();
	
}
