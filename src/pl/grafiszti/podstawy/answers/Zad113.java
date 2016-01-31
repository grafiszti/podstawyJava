package pl.grafiszti.podstawy.answers;

import pl.grafiszti.podstawy.main.Main;

/*1.13 Utwórz tablicę typu int przechowującą n 
 * elementów – gdzie n jest parametrem pobieranym
 *  od użytkownika. Następnie wypełnij ją liczbami 
 *  od 1 do n i wyświetl zawartość na ekranie przy 
 *  pomocy pętli while.
 */
public class Zad113 {
	int[] table;
	int n;

	public Zad113() {
		n = 0;
		table = new int[n];
	}

	public void run() {
		System.out.println("Podaj ile liczb chcesz umiescic w tablicy: ");
		n = Main.consoleReader.nextInt();

		table = new int[n];

		fill(n);
		write(n);
	}

	private void fill(int n) {
		while (n > 0) {
			table[n - 1] = n--;
		}
	}

	private void write(int n) {
		while (n > 0) {
			System.out.println(table[table.length - n--]);
		}
	}
}
