package pl.grafiszti.podstawy.answers;

import pl.grafiszti.podstawy.main.Main;

/*1.12 Napisz program, w którym zadeklarujesz i utworzysz 
 * pięcioelementową tablicę odpowiedniego typu. W pętli 
 * pobierzesz od użytkownika 5 imion i je w niej zapiszesz. 
 * Następnie wyświetl na ekranie powiadomienia „Witaj imie_z_tablicy” 
 * dla każdego z podanych parametrów.
 */
public class Zad112 {
	String[] names;

	public Zad112() {
		names = new String[5];
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Podaj " + (i + 1) + " imię: ");
			names[i] = Main.consoleReader.next();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Witaj " + names[i] + " !");
		}
	}
}
