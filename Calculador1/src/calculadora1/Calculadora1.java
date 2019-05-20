package calculadora1;

import java.util.Scanner;

public class Calculadora1 {
	
	

	public void operaciones()
	
	{
		
		int i;
	    int suma;
	    int resta;
	    int multiplicacion;
	    int dividir;
	    
		  System.out.println("Ingrese si la operación que desea realizar es 1: Sumar, 2: Restar,3:Multiplicar, 4.Dividir"); 
		  
		  Scanner operacion1= new Scanner(System.in);
			int operacion=operacion1.nextInt();
			
			System.out.println("Ingrese el numero sobre el cual va a realizar la operacion"); 
			  
			Scanner input1= new Scanner(System.in);
			int numero1=input1.nextInt();
			
		switch (operacion)

		{
		case 1: 
	
		  i=1;
		while (i<=5)
		 
		{ 
		 suma=numero1+i;
		 System.out.println("La suma es igual a "+suma+"en la iteracion"+i);
		 i=i+1;
		
}

		 break;
		
		case 2: 
		 i=1;
		while (i<=5)
		 
		{ 
		 resta=numero1-i;
		 System.out.println("La resta es igual a "+resta+"en la iteracion"+i);
		 i=i+1;
		
}

		 break;
		 
		case 3: 	i=1;
		while (i<=5)
		 
		{ 
		multiplicacion=numero1*i;
		 System.out.println("La multiplicacion es igual a "+multiplicacion+"en la iteracion"+i);
		 i=i+1;
		
}

		 break;
		 
		case 4: 
		i=1;
		while (i<=5)
		 
		{ 
		dividir=numero1/i;
		 
		 i=i+2;
		
}

		 break;
		  
		 
		 
		}

	
}
	
}
