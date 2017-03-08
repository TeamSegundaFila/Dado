package com.ipartek.formacion.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TiradaTest {

	Tirada tirada;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		try {
			tirada = new Tirada();
		} catch (Exception e) {
			fail("No deberia haber fallado el SetUp de TiradaTest");
		}
	}

	@After
	public void tearDown() throws Exception {
		tirada = null;
	}

	@Test
	public void testConstructorVacioTirada() {
		assertEquals("el id generado por constructor vacío no coincide con el obtenido por Getter, pero deberia", -1,
				tirada.getId());
		assertNull(
				"la fecha de lanzamiento generada por constructor vacío (null) no coincide con la obtenida por Getter, pero deberia",
				tirada.getFechaLanzamiento());
		assertEquals(
				"el id_usuario generado por constructor vacío no coincide con el obtenido por Getter, pero deberia", -1,
				tirada.getUsuarioId());
	}

	@Test
	public void testSettersTirada() {
		tirada.setId(0);
		tirada.setUsuarioId(0);

		assertEquals("el id de Tirada guardado por Setter no coincide con el obtenido por Getter, pero deberia", 0,
				((int) tirada.getId()));

		assertEquals("el id_usuario de Tirada guardado por Setter no coincide con el obtenido por Getter, pero deberia",
				0, ((int) tirada.getUsuarioId()));

	}

}