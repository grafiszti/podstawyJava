package pl.grafiszti.podstawy.answers;

import pl.grafiszti.podstawy.main.Main;

/*1.9 Pobierz w konsoli dwie liczby całkowite, 
 * następnie porównaj je i wyświetl stosowny 
 * komunikat z wynikiem.
 */
public class Zad19 {
	int a, b;

	public Zad19() {
		int a = 0;
		int b = 0;
	}

	public void run() {
		System.out.println("Podaj pierwsza liczbe");
		a = Main.consoleReader.nextInt();

		System.out.println("Podaj druga liczbe");
		b = Main.consoleReader.nextInt();

		if (a == b) {
			System.out.println("Liczby są równe");
		} else if (a < b) {
			System.out.println("Liczba pierwsza jest mniejsza od drugiej");
		} else {
			System.out.println("Liczba pierwsza jest większa od drugiej");
		}
	}
}
