package pl.grafiszti.obiektowe.answers.zad24;

public class Adder {

	public Adder() {
	}

	public int sum(int a, int b) {
		System.out.println("Wywolana metoda z argumentami : int int");
		return a + b;
	}

	public int sum(int a, int b, int c) {
		System.out.println("Wywolana metoda z argumentami : int int int");
		return a + b + c;
	}

	public float sum(float a, float b) {
		System.out.println("Wywolana metoda z argumentami : float float");
		return a + b;
	}

	public double sum(double a, double b) {
		System.out.println("Wywolana metoda z argumentami : double double");
		return a + b;
	}
}
