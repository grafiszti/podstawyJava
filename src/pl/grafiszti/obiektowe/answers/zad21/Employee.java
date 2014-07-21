package pl.grafiszti.obiektowe.answers.zad21;

public class Employee {
	String name, surname;
	int age;

	public Employee() {
		name = "";
		surname = "";
		age = 0;
	}

	public Employee(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public String toString(){
		return name + " " + surname + " " + age;
	}

}
