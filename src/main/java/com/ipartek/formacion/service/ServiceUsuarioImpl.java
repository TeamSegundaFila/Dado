package com.ipartek.formacion.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ipartek.formacion.domain.Usuario;
import com.ipartek.formacion.repository.DAOUsuario;

public class ServiceUsuarioImpl implements ServiceUsuario {

	private final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private DAOUsuario daoUsuario;
	
	@Override
	public List<Usuario> listar() {
		return daoUsuario.getAll();
	}

	@Override
	public Usuario buscarPorId(long id) {
		return daoUsuario.getById(id);
	}

	@Override
	public boolean crear(Usuario u) {
		return daoUsuario.insert(u);
	}

	@Override
	public boolean modificar(Usuario u) {
		return daoUsuario.update(u);
	}

	@Override
	public boolean eliminar(long id) {
		return daoUsuario.delete(id);
	}

	@Override
	public boolean darBaja(long id) {
		return daoUsuario.darBaja(id);
	}

	@Override
	public boolean darAlta(long id) {
		return daoUsuario.darAlta(id);
	}

}
