package usarexcepciones;

import java.util.Scanner;

public class excepciones {

	public void ejemplo() {
	
	try {
		
		int suma;
		System.out.println("Ingrese el numero 1");
		Scanner a=new Scanner(System.in);
		int ejemplo=a.nextInt();
		System.out.println("EL numero ingresado fue"+ejemplo);
		System.out.println("Ingrese el numero 2");
		Scanner b=new Scanner(System.in);
			int ejemplo1=b.nextInt();
			
			System.out.println("EL numero ingresado fue"+ejemplo);
	
	
	
			suma=ejemplo+ejemplo1;
			
			System.out.println("La operación es igual a: "
					+ suma);
	} catch (Exception e) {
		
		System.out.println("Los numeros tienen que ser enteros");

	}
	}
}
