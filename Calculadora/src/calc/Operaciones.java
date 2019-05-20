package calc;

public class Operaciones {

	
 public double a=1.1;
 public	int b=2;
 public int suma;
 public int resta;
 public int multiplicacion;
 public int division;
	
	
	public void operar() {
		
		suma= (int) (a+b);
		resta= (int) (b-a);
		multiplicacion= (int) (a*b);
		division=(int) (b/a);
		
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(multiplicacion);
		System.out.println(division);
}
	}
