package ascensor;

public class Ascensor {

	public boolean puertaabierta=false;
	public int plantaactual=1;
	final int  plantmax=10;
	final int  plantmin=1;
	
	public void abrirpuerta()
	
	{ 
		System.out.println("AbrirPuerta");
		puertaabierta=true;
		System.out.println("La puerta esta abierta");
}
	
	public void cerrarpuerta()
	
	{ 
		System.out.println("CerrarPuerta");
		puertaabierta=false;
		System.out.println("La puerta esta cerrada");
}
	
	public void subiendopisos()
	
	{  if (plantaactual<=9)
		
	{ 
		System.out.println("Subirpisos");
		plantaactual++;
		System.out.println(plantaactual);
}
	else
	{  System.out.println("Se encuentra en el ultimo piso");
	}
	}
	
	public void bajarpisos()
	
	{   if (plantaactual>=2)
		
	
	{
			
		System.out.println("Bajarpisos");
		plantaactual--;
		System.out.println(plantaactual);
}
	
	else 
		
{   System.out.println("Se encuentra en el primer piso");
	
}
	

	}
	

	
}
	

