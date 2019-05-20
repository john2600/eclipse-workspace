package dados;

public class Tirardatos {

	public void tirardados()
	
	{  int dado1;
	
	   int dado2;
	   
	   do {
		
		   dado1=(int) (Math.random()+2);
		   
		   dado2=(int) (Math.random()+2);
		  
		   
		   System.out.println(dado1+dado2);
	   }
	   
	   while (dado1==dado2);
	   
	   }

}

	