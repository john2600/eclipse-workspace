package ejemplo.demo;

public class Persona {
	public String name;
	public int age;
	public String Profesion;

	
	public Persona(String name, int age, String Profesion) {
		this.name = name;
		this.age = age;
		this.Profesion=Profesion;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getProfesion() {
		return Profesion;
	}
	public void setProfesion(String Profesion) {
		this.Profesion = Profesion;
	}
	

}
