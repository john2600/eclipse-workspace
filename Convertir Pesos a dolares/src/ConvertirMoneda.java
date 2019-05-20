import java.util.Scanner;

public class ConvertirMoneda {

	public void convertir() {
		
		System.out.println("Ingrese el valor a cambiar en Euros");
		Scanner valorcambiar = new Scanner(System.in);
		float valorentrada = valorcambiar.nextFloat();
	
		System.out.println("Ingrese la moneda a la cual desea cambiar : 1:Dolar, 2:Peso Colombiano, 3: Zloty, 4: Peso chileno");
	
		Scanner monedafinal = new Scanner(System.in);
		int monedaacambiar = monedafinal.nextInt();
		float valorcambio;
		
		switch (monedaacambiar)
		
		{
		
		case 1: valorcambio= (float) (valorentrada*1.12);
		        
		        System.out.println(valorcambio);
		        
		        break;
		        
		case 2: valorcambio= valorentrada*3600;
        
        System.out.println(valorcambio);
        
        break;
        
      case 3: valorcambio= valorentrada*4;
        
        System.out.println(valorcambio);
        
        break;
        
      case 4: valorcambio= valorentrada*800;
      
      System.out.println(valorcambio);
      
      break;
		        
		default: 
			

		      System.out.println("La moneda ingresada no existe");
		      
			
			break;
		}
		
		}

	
}
