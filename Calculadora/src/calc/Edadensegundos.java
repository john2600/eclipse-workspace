package calc;

public class Edadensegundos {

	long edada�os=20;
	long diasc;
	long segundosc;
	
	
public void calcularedad () {
	
	diasc= edada�os*365;
	segundosc=edada�os*365*24*60*60;
	
	System.out.println("La edad en dias es:"+diasc);
	
	System.out.println("La edad en segundos es:"+segundosc);
}

}