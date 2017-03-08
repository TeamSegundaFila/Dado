package com.ipartek.formacion.domain;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ipartek.formacion.repository.DAOUsuario;


public class DAOUsuarioTest {

	@Autowired()
    private DAOUsuario dao;

	static int contador = -1;
	static int contatorInicial = -1;
	static Usuario u = null;

	static final int LIMITE_SELECT = 500;

	static final String FECHA_ALTA = "";
	static final String FECHA_MODIFICACION = "";
	static final String FECHA_BAJA = "";
	static final long ID_NO_EXISTE = -1;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		u = new Usuario();
		u.setNombre("dummy");
		u.setFechaAlta(FECHA_ALTA);
		u.setFechaBaja(FECHA_BAJA);
		u.setFechaModificacion(FECHA_MODIFICACION);

	}
	
	@Test
	@Transactional
	public void test() {
		// crear usuario
		assertTrue("No inserta usuario", dao.insert(u));
	}

}
