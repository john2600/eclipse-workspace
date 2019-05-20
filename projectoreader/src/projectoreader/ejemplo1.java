package projectoreader;

import java.io.IOException;

public class ejemplo1 {

	public static void main(String[] args) {
		long n;
		System.out.print("Ingrese el string");
		
		try {
			n= System.in.read();
			System.out.print("El dato ingresado es");
			System.out.print((char)n);
			
		} catch (IOException e) {
			
			System.out.print("El dato no es un caracter");
		}
		
		}

}
