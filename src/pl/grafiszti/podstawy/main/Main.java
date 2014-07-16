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
			Scanner reader = new Scanner(System.in);
			if (reader.hasNext()) {
				id = reader.nextInt();
			}
			switch (id) {
			case 11:
				new Zad11().run();
				System.out.println();
				break;
			case 12:
				new Zad12().run();
				System.out.println();
				break;
			case 13:
				new Zad13().run();
				System.out.println();
				new Zad13(23, 43, 34).run();
				System.out.println();
				break;
			case 14:
				new Zad14().run();
				System.out.println();
				break;
			case 15:
				new Zad15().run();
				System.out.println();
				break;
			case 16:
				new Zad16().run();
				System.out.println();
				break;
			case 17:
				new Zad17().run();
				System.out.println();
				break;
			case 18:
				new Zad18().run();
				System.out.println();
			default:
				System.out.println("zly numer zadana");
				break;
			}
			id = -1;
		} while (id != 0);
	}
}
