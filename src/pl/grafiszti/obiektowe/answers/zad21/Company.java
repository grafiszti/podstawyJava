package pl.grafiszti.obiektowe.answers.zad21;

public class Company {
	Employee person1, person2;

	public Company() {
		person1 = new Employee("Myszka", "Miki", 100);
		person2 = new Employee("Kaczor", "Donald", 54);
	}

	public Employee getPerson1() {
		return person1;
	}

	public void setPerson1(Employee person1) {
		this.person1 = person1;
	}

	public Employee getPerson2() {
		return person2;
	}

	public void setPerson2(Employee person2) {
		this.person2 = person2;
	}
}
