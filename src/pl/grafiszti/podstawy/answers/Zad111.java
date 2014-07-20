package pl.grafiszti.podstawy.answers;

import pl.grafiszti.podstawy.main.Main;

/*1.11 Napisz program, który pobierze od użytkownika całkowitą 
 * liczbę dodatnią. Następnie przy użyciu wyświetl na 
 * ekranie Odliczanie z tekstem „Bomba wybuchnie za … ” 
 * gdzie w miejsce dwukropka mają się pojawić liczby 
 * od podanej przez użytkownika do 0. Napisz program w 3 
 * wersjach przy użyciu różnych pętli.
 */
public class Zad111 {

	public void run() {
		System.out.println("Podaj ile sekund do wybuchu bomby :");
		int time = Main.consoleReader.nextInt();

		loopFor(time);
		loopWhile(time);
		loopDoWhile(time);
	}

	public void loopFor(int time) {
		System.out.println("Pętla for");
		for (int i = 0; i < 4; i++) {
			System.out.println("Bomba wybuchnie za :" + (time - i));
		}
		System.out.println("bumm!!!");
	}

	public void loopWhile(int time) {
		System.out.println("Pętla while");
		while (time > 0) {
			System.out.println("Bomba wybuchjjnie za :" + time--);
		}
		System.out.println("bumm!!!");
	}

	public void loopDoWhile(int time) {
		System.out.println("Pętla do while");
		do {
			System.out.println("Bomba wybuchnie za :" + time--);
		} while (time > 0);
		System.out.println("bumm!!!");
	}
}
