package ejemplo.otro1;

import ejemplo.demo.MolaMundo;
import ejemplo.demo.Persona;

public class Almundo {

	public static void main(String[] args) {
		MolaMundo hola = new MolaMundo();
		Almundo a = new Almundo();
		Persona hrfe= new Persona ("Stefania", 23, "carpintero");
		Persona PERSONA2 = new Persona("carmenza", 24,"ingeniero");
		Persona PERSONA3 = new Persona("joseluis", 24, "medico");
		System.out.println(hrfe.getName());
		System.out.println(hrfe.getAge());
		System.out.println(hrfe.getProfesion());
	
		System.out.println(PERSONA2.getName());
		System.out.println(PERSONA2.getAge());
		System.out.println(PERSONA2.getProfesion());
		System.out.println(PERSONA3.getName());
		System.out.println(PERSONA3.getAge());
		System.out.println(PERSONA3.getProfesion());
	}
}

