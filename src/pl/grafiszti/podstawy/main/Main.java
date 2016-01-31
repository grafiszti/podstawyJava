package pl.grafiszti.podstawy.main;

import java.io.IOException;
import java.util.Scanner;

import pl.grafiszti.podstawy.answers.*;

public class Main {
	public static final Scanner consoleReader = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int id = -1;

		do {
			System.out
					.println("Podaj numer zadania do odpalenia, 0 konczy program: ");
			id = consoleReader.nextInt();

			switch (id) {
			case 11:
				new Zad11().run();
				break;
			case 12:
				new Zad12().run();
				break;
			case 13:
				new Zad13().run();
				new Zad13(23, 43, 34).run();
				break;
			case 14:
				new Zad14().run();
				break;
			case 15:
				new Zad15().run();
				break;
			case 16:
				new Zad16().run();
				break;
			case 17:
				new Zad17().run();
				break;
			case 18:
				new Zad18().run();
				break;
			case 19:
				new Zad19().run();
				break;
			case 110:
				new Zad110().run();
				break;
			case 111:
				new Zad111().run();
				break;
			case 112:
				new Zad112().run();
				break;
			case 113:
				new Zad113().run();
				break;
			case 114:
				new Zad114().run();
				break;
			case 115:
				new Zad115().run();
				break;
			case 116:
				new Zad116().run();
				break;
			case 0:
				System.out.println("Koniec programu");
				break;
			default:
				System.out.println("zly numer zadana");
				break;
			}

			System.out.println();

		} while (id != 0);
	}
}
