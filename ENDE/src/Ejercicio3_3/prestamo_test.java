package Ejercicio3_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import Ejercicio3_1.Ejercicio3_1_Salario;

class prestamo_test {


	@Test
	@DisplayName("Prestamo ofertado")
	void testPrestamo (boolean b, double c, int a, double reslut) {
		prestamo presta =new prestamo(null, c, a);
		assertEquals(3000,presta.calcular_cantidad_solicitada(a, reslut));
	}
	
	@ParameterizedTest
	@CsvSource({"2000,1640","1500,1230","1000,840"})
	@DisplayName("Intereses")

	void testIntereses (double result, double cant) {
		prestamo presta =new prestamo(null, 200, 100);
		assertEquals(result, presta.calcular_interes_prestamo(cant));
	
		
	}
	
}
