package pl.grafiszti.podstawy.answers;

import pl.grafiszti.podstawy.main.Main;

/*1.10 Napisz program, który pobierze od użytkownika imię 
 * i przechowa je w zmiennej. Następnie stwórz kilka warunków 
 * z różnymi imionami. Jeśli któreś z imion będzie pasowało 
 * wyświetl „Cześć jakieś_imię”, gdy program nie znajdzie 
 * imienia wyświetl „Przykro mi, ale Cię nie znam”.
 */
public class Zad110 {

	public void run() {
		System.out.println("Podaj imie: ");

		String name = "";

		name = Main.consoleReader.next();
		switch (name) {
		case "Mateusz":
		case "Kasia":
		case "Basia":
		case "Krysia":
		case "Paweł":
		case "Gaweł":
			System.out.println("Cześć " + name + "!");
			break;
		default:
			System.out.println("Przykro mi, nie znam Cie");
		}
	}
}
