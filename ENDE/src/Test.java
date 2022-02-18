//Las cosas a importar:
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName; //Importamos para el @DisplayName
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
//Esto no se importa:
import Ejercicio3_1.Ejercicio3_1_Salario;
import Ejercicio3_4.billete;

class Test {
	
//1: Salario Neto
	//Con CSV
			//También podemos pasar los datos de entrada y de salida esperada por un CSV para pasar varias pruebas a la vez:
			@ParameterizedTest
			@CsvSource({"2000,1640","1500,1260","1000,840"})
			@DisplayName("Prueba del Salario Neto")	//El DisplayName es opcional
			//Caso de prueba del Salario Neto
			void testSalarioNeto_CSV(double brut, double resul) {
				//Sin el csv:
				assertEquals(1640, Ejercicio3_1_Salario.calculaSalarioNeto(2000));
				//**Si no fuera static la clase de Salario habría que crear un objeto aquí y llamarlo aquí:
					//Ejercicio3_1_Salario salario_01=new Ejercicio3_1_Salario();
					//assertEquals(1640, salario_01.calculaSalarioNeto(2000));
				assertEquals(resul, Ejercicio3_1_Salario.calculaSalarioNeto(brut));			
				
			}//Los resultados aparecen a la izq si están bien o no y a eso es a lo que se le hace pantallazo
//Billetes Test:
			@ParameterizedTest
			@CsvSource({"1,2,30,30,38.4625","0,2,33,110,43.875","0,1,30,30,13.3875"})
			@DisplayName("Prueba obtener tarifa")
			void testObtenerTarifa (int o, int de, int e, int di, double resul) {
				assertEquals(resul,billete.obtener_tarifa(o, de, e, di));
			}
}
