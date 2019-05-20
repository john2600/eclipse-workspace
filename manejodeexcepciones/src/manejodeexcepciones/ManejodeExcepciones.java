package manejodeexcepciones;

public class ManejodeExcepciones {

	public static void main(String[] args) {
		
		
	try {
		String a[]= {"1987"};
		
		System.out.println(a[1]);
		
	
	} catch (ArrayIndexOutOfBoundsException e) {
		// TODO Auto-generated catch block
		System.out.println("No existe esta opcion");
	e.printStackTrace();
	}
	System.out.println("La aplicación continua");

}
	
}
