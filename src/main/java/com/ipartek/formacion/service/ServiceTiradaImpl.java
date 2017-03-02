package com.ipartek.formacion.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ipartek.formacion.domain.Tirada;
import com.ipartek.formacion.repository.DAOTirada;

public class ServiceTiradaImpl implements ServiceTirada {

private final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private DAOTirada daoTirada;
	
	@Override
	public List<Tirada> listar() {
		return daoTirada.getAll();
	}

	@Override
	public List<Tirada> listarPorUsuario(long idUsuario) {
		return daoTirada.getAllByUser(idUsuario);
	}

	@Override
	public Tirada buscarPorId(long id) {
		return daoTirada.getById(id);
	}

	@Override
	public boolean crear(Tirada t) {
		return daoTirada.insert(t);
	}

	@Override
	public boolean modificar(Tirada t) {
		return daoTirada.update(t);
	}

	@Override
	public boolean eliminar(long id) {
		return daoTirada.delete(id);
	}

}
