import java.util.Scanner;

public class Repetir {

    
	public void Repetirelnumero()
	
	{  
		System.out.println("Ingrese el nombre de la persona que está haciendo la prueba");
		
		Scanner nombre = new Scanner(System.in);
		String nombre1 = nombre.next();
	    int i=0;
			
		
			while (i<5)
				
			{   System.out.println(nombre1);
				System.out.println("Es un ejemplo"+i);
				i++;
				
}
			
	}
	
}
