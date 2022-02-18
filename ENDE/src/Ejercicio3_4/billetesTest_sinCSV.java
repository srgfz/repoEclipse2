package Ejercicio3_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

class billetesTest_sinCSV {

	@Test
	@DisplayName("Prueba obtener tarifa")
	void testObtener_tarifa() {
		assertEquals(38.4625, billete.obtener_tarifa(1, 2, 30, 30));
	}

}
