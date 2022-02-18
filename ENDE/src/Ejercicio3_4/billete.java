package Ejercicio3_4;

import java.util.Date; 
import java.time.Month;
import java.time.LocalDate;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ChronoUnit;


public class billete {
	static String ciudades[] = {"TAL","MAD","BCN"};
	static int origen;
	static int destino;
	static double precios[][] = { {0,15.75,58.5}, {15.75,0,45.25}, {58.50,45.25,0}};
	
	public static void main(String[] args) {
		LocalDate fech = LocalDate.of(2022, Month.MAY, 23);
		int dias = (int)ChronoUnit.DAYS.between(LocalDate.now(), fech);
		double tarifa = obtener_tarifa (0, 2, 33, dias);
		
		System.out.println(dias);
		System.out.println("Te toca pagar: " + tarifa);
	}
	
	public static double obtener_tarifa (int orig, int dest, int edad, int d) {
		double descuento = 1;//1
		double tarifa = 0;//1
		double p = precios[orig][dest];//1
		if (edad < 25) //2
			descuento -= 0.3;//3
		else 
			if (edad > 65) //4
				descuento -= 0.4;//5
		
		
		if (d > 30) //6
			descuento -= 0.25;//7
		else 
			if (d > 7) //8
				descuento -= 0.15;//9
		
		tarifa = precios[orig][dest]*descuento; //10
		
		return tarifa; //11
			
	}

}
