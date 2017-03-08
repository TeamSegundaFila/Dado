package com.ipartek.formacion.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EstadisticaTest {

	Estadistica estadistica;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		try {
			estadistica = new Estadistica();
		} catch (Exception e) {
			fail("No deberia haber fallado el SetUp de EstadisticaTest");
		}
	}

	@After
	public void tearDown() throws Exception {
		estadistica = null;
	}

	@Test
	public void testConstructorVacioEstadistica() {
		assertTrue(
				"el nombre de estadistica generado por constructor vac�o no coincide con el obtenido por Getter, pero deberia",
				"".equals(estadistica.getNombre()));
		assertEquals("el id generado por constructor vac�o no coincide con el obtenido por Getter, pero deberia", -1,
				estadistica.getContador());
	}

	@Test
	public void testSettersEstadistica() {
		estadistica.setNombre("nombreEstadisticaTest");
		estadistica.setContador(0);
		assertTrue("el nombre de estadistica generado por setter no coincide con el obtenido por Getter, pero deberia",
				"nombreEstadisticaTest".equals(estadistica.getNombre()));
		assertEquals(
				"el contador de estadisticas guardado por Setter no coincide con el obtenido por Getter, pero deberia",
				0, ((int) estadistica.getContador()));

	}
}