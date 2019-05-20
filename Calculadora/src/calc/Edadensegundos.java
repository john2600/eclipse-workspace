package calc;

public class Edadensegundos {

	long edadaños=20;
	long diasc;
	long segundosc;
	
	
public void calcularedad () {
	
	diasc= edadaños*365;
	segundosc=edadaños*365*24*60*60;
	
	System.out.println("La edad en dias es:"+diasc);
	
	System.out.println("La edad en segundos es:"+segundosc);
}

}