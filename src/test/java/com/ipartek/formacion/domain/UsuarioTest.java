package com.ipartek.formacion.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UsuarioTest {

	Usuario usuario;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		try {
			usuario = new Usuario();
		} catch (Exception e) {
			fail("No deberia haber fallado el SetUp de UsuarioTest");
		}
	}

	@After
	public void tearDown() throws Exception {
		usuario = null;
	}

	@Test
	public void testConstructorVacioUsuario() {
		assertTrue(
				"el nombre de usuario generado por constructor vacío no coincide con el obtenido por Getter, pero deberia",
				"".equals(usuario.getNombre()));
		assertEquals("el id generado por constructor vacío no coincide con el obtenido por Getter, pero deberia", -1,
				usuario.getId());
		assertNull(
				"la fecha de alta generada por constructor vacío (null) no coincide con la obtenida por Getter, pero deberia",
				usuario.getFechaAlta());
		assertNull(
				"la fecha de baja generada por constructor vacío no coincide con la obtenida por Getter, pero deberia",
				usuario.getFechaBaja());
		assertNull(
				"la fecha de modificación generada por constructor vacío no coincide con la obtenida por Getter, pero deberia",
				usuario.getFechaModificacion());
	}

	@Test
	public void testSetNombreUsuario() {
		usuario.setNombre("nombreUsuarioTest");
		assertTrue("el nombre de usuario guardado por Setter no coincide con el obtenido por Getter, pero deberia",
				"nombreUsuarioTest".equals(usuario.getNombre()));
	}

	@Test
	public void testSetIdUsuario() {
		usuario.setId(0);
		assertEquals("el id de usuario guardado por Setter no coincide con el obtenido por Getter, pero deberia", 0,
				((int) usuario.getId()));
	}

}
