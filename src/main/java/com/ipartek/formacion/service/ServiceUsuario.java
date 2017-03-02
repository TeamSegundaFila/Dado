package com.ipartek.formacion.service;

import java.util.List;

import com.ipartek.formacion.domain.Usuario;

public interface ServiceUsuario {

	List<Usuario> listar();

	Usuario buscarPorId(long id);

	boolean crear(Usuario u);

	boolean modificar(Usuario u);

	boolean eliminar(long id);
	
	boolean darBaja(long id);
	
	boolean darAlta(long id);
}
