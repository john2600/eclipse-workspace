import java.util.Scanner;

public class Party {
	
	
	public void ingresarFiesta(){
		System.out.println("Ingresar a la fiesta");
		
		System.out.println("Ingrese su edad");
		
		Scanner input= new Scanner(System.in);
		
		int edadIngresada = input.nextInt();
	
		
		if (edadIngresada>=18)
			
		{
			System.out.println("Viene con acompa�ante?: S/N");
			
	
			Scanner acompanante= new Scanner(System.in);
			
			String acompanante1 = acompanante.nextLine();
		
		
			if (acompanante1.contentEquals("S"))
				
			{
				System.out.println("Para ingresar debe pagar por la boleta del acompa�ante");
		    }
			
			else {
				 
				if (acompanante1.contentEquals("N"))
					
				{
				
				System.out.println("Bienvenido a la fiesta");
				}
				
				else {
				
					System.out.println("Recuerde que los �nicos valores v�lidos son S o N");
				}
				
				}
			
			
		}
			
			else {
				
				System.out.println("No puede ingresar a la fiesta es menor de edad");
				
	
			}
			
	}
}
		
	
		

		
	
	
	
	
