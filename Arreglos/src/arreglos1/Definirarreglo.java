package arreglos1;

import java.util.Scanner;

public class Definirarreglo {

public void arreglo() {
	
	
   int i;
   int a[]=new int [2];
	
	Scanner ingreso= new Scanner(System.in);
	
	
	for (i=0; i<a.length;i++)
	{
		System.out.println("Ingrese numero");
		int b= ingreso.nextInt();
		a[i]=b;
		
	}
	
	for (i=0; i<a.length;i++)
	{
		System.out.println(a[i]);
		
	}
	
}
}
