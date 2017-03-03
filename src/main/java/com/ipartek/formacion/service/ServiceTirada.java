package com.ipartek.formacion.service;

import java.util.List;

import com.ipartek.formacion.domain.Estadistica;
import com.ipartek.formacion.domain.Tirada;

public interface ServiceTirada {

	List<Tirada> listar();

	List<Tirada> listarPorUsuario(long idUsuario);

	Tirada buscarPorId(long id);

	boolean crear(Tirada t);

	boolean modificar(Tirada t);

	boolean eliminar(long id);
	
	List<Estadistica> getEstadisticas();
	
}
