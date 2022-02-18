package Ejercicio3_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class billetesTest{


	
	@ParameterizedTest
	@CsvSource({"1,2,30,30,38.4625","0,2,33,110,43.875","0,1,30,30,13.3875"})
	@DisplayName("Prueba obtener tarifa")
	void testObtenerTarifa (int o, int de, int e, int di, double resul) {
		assertEquals(resul,billete.obtener_tarifa(o, de, e, di));
	}

}
