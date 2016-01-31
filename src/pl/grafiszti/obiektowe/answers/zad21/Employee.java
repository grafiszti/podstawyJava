package pl.grafiszti.obiektowe.answers.zad21;

public class Employee {
	String name, surname;
	int age;

	public Employee() {
		name = "---";
		surname = "---";
		age = 0;
	}
	
	public Employee(String name){
		this.name = name;
		this.surname = "tajne";
		this.age = 99;
	}
	
	public Employee (String surname, int age){
		this.name = "---";
		this.surname = surname;
		this.age = age;
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
