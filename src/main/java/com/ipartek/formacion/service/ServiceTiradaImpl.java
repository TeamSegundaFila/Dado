package com.ipartek.formacion.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.formacion.domain.Tirada;
import com.ipartek.formacion.repository.DAOTirada;

@Service(value ="serviceTirada")
public class ServiceTiradaImpl implements ServiceTirada {

private final Log logger = LogFactory.getLog(getClass());
	
	@Autowired()
	private DAOTirada daoTirada;
	
	@Override()
	public List<Tirada> listar() {
		this.logger.info("listar");
		return this.daoTirada.getAll();
	}

	@Override()
	public List<Tirada> listarPorUsuario(long idUsuario) {
		return this.daoTirada.getAllByUser(idUsuario);
	}

	@Override()
	public Tirada buscarPorId(long id) {
		return this.daoTirada.getById(id);
	}

	@Override()
	public boolean crear(Tirada t) {
		return this.daoTirada.insert(t);
	}

	@Override()
	public boolean modificar(Tirada t) {
		return this.daoTirada.update(t);
	}

	@Override()
	public boolean eliminar(long id) {
		return this.daoTirada.delete(id);
	}

}
