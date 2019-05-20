package ejemplo.demo;

public class App {
	public static void main(String[] args) {

		Persona persona = new Persona("John", 90, "ingeniero");
		String name = persona.name;
		int age= persona.age;


		System.out.println(name);
		System.out.println(persona.getName());

		System.out.println(persona.getAge());

		persona.setName("Sebastian");
		persona.setAge(40);

		System.out.println(persona.getName());

		System.out.println(persona.getAge());


	}

}
