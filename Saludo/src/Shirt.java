
public class Shirt {
 
  public int id=0;
  public String descripcion="Descripción requerida";
  public char cod_color='R';
  public int cantidad=0;
  public double precio=0;
  final public int referencia=123;
  
  public void displayshirinfo()
  
 
	  {   System.out.println("Imprima el ID" +id+"Camisa");
	  System.out.println("la descripción es  " +
	  "" +   descripcion  +   ""
			  + "   caracteristica de la camisa");
	  System.out.println("el color es " +cod_color+" de la camisa");
	  System.out.println("la cantidad comprada " +cantidad);
	  System.out.println("el total es " +precio+" en pesos colombianos");
	  System.out.println("el código de referencia es " +referencia);  
	  }

}
  
  

