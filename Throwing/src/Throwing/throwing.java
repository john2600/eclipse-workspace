package Throwing;

public class throwing {

	public static void main(String[] args) {
		
		try {
			GetExepcion();
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.err.print("Se produjo un error");
		}
		
		System.out.print("La aplicación sigue normalmente");
	}

	private static void GetExepcion() throws ArrayIndexOutOfBoundsException{
		int A[]= {123};
		System.out.println(A[0]);
	}

}
