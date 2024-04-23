package testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import service.CuentasService;

class TestCuentasService {
	static CuentasService service;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		service=new CuentasService();
		
	}

	@Test
	void testExisteCuenta() {
		assertTrue(service.existeCuenta("ES4720800136253000145866"));
		assertFalse(service.existeCuenta("ES111111111"));
	}

	@Test
	void testCuentasPorDivisa() {
		assertEquals(2, service.cuentasPorDivisa("EUR"));
	}
	@Test
	void testCuentasTitular() {
		assertTrue(service.buscarCuentaPorTitular("Fernando López Gómez").isPresent());
		assertTrue(service.buscarCuentaPorTitular("Paquito").isEmpty());
	}
	@Test
	void testCuentasAgrupadasPorDivisa() {
		assertEquals(2, service.cuentasPorDivisa().get("JPY").size());
	}

}
