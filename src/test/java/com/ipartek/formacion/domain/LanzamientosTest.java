package com.ipartek.formacion.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LanzamientosTest {

	Lanzamientos lanzamientos;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		try {
			lanzamientos = new Lanzamientos();
		} catch (Exception e) {
			fail("No deberia haber fallado el SetUp de LanzamientosTest");
		}
	}

	@After
	public void tearDown() throws Exception {
		lanzamientos = null;
	}

	@Test
	public void testConstructorVacioLanzamientos() {

		assertEquals("el id generado por constructor vac�o no coincide con el obtenido por Getter, pero deberia", -1,
				lanzamientos.getId());
		assertTrue(
				"el nombre de lanzamientos generado por constructor vac�o no coincide con el obtenido por Getter, pero deberia",
				"".equals(lanzamientos.getNombre()));
		assertTrue(
				"la fecha de lanzamientos generada por constructor vac�o no coincide con el obtenido por Getter, pero deberia",
				"".equals(lanzamientos.getFecha()));

	}

	@Test
	public void testSettersEstadistica() {
		lanzamientos.setId(0);
		lanzamientos.setNombre("nombreLanzamientosTest");
		lanzamientos.setFecha("fechaLanzamientosTest");

		assertEquals("el id de Lanzamientos guardado por Setter no coincide con el obtenido por Getter, pero deberia",
				0, ((int) lanzamientos.getId()));
		assertTrue("el nombre de Lanzamientos generado por setter no coincide con el obtenido por Getter, pero deberia",
				"nombreLanzamientosTest".equals(lanzamientos.getNombre()));
		assertTrue("la fecha de Lanzamientos generada por setter no coincide con la obtenida por Getter, pero deberia",
				"fechaLanzamientosTest".equals(lanzamientos.getFecha()));

	}

}