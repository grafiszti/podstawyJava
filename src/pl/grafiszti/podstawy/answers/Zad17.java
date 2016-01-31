package pl.grafiszti.podstawy.answers;

import pl.grafiszti.podstawy.main.Main;

/*1.7 Utwórz dwie zmienne typu double. Następnie przy 
 * użyciu klasy Scanner pobierz od użytkownika dwie liczby 
 * i wykonaj na nich dodawanie, odejmowanie, mnożenie i dzielenie,
 *  wyświetlając wyniki w kolejnych liniach na konsoli.
 */
public class Zad17 {
	double a, b;

	private void inputData() {

		System.out.println("Podaj a: ");
		a = Main.consoleReader.nextDouble();
		do {
			System.out.println("Podaj b rozne od 0: ");
			b = Main.consoleReader.nextDouble();
		} while (b == 0);
	}

	public void run() {
		inputData();

		System.out.println("dodawanie " + (a + b));
		System.out.println("odejmowanie " + (a - b));
		System.out.println("mnożenie " + (a * b));
		System.out.println("dzielenie " + (a / b));
	}
}
