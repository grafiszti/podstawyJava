package pl.grafiszti.obiektowe.main;

import java.io.IOException;
import java.util.Scanner;

import pl.grafiszti.obiektowe.answers.zad21.Company;
import pl.grafiszti.obiektowe.answers.zad21.Employee;
import pl.grafiszti.obiektowe.answers.zad22.CompanyExtended;

public class Main {

	public static final Scanner consoleReader = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int id = -1;

		do {
			System.out
					.println("Podaj numer zadania do odpalenia, 0 konczy program: ");
			id = consoleReader.nextInt();

			switch (id) {
			case 21:
				zad21();
				break;
			case 22:
				zad22();
				break;
			case 23:
				zad23();
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

	/*
	 * 2.1 Napisz klasę Pracownik, która przechowuje trzy pola: -Imię -Nazwisko
	 * -Wiek
	 * 
	 * Następnie utwórz klasę Firma, w której wykorzystasz klasę pracownik do
	 * utworzenia dwóch obiektów przechowujących dane pracowników (wymyśl sobie
	 * jakieś) i później wyświetlasz je na ekran.
	 */
	private static void zad21() {
		Company companyExample = new Company();
		System.out.println(companyExample.getPerson1().toString());
		System.out.println(companyExample.getPerson2().toString());
	}

	/*
	 * 2.2 Zmodyfikuj powyższy program tak, aby utworzyć trzech pracowników, a
	 * odpowiednie pola zainicjuj wartościami z wcześniej utworzonych tablic
	 * (dowolne dane) przy użyciu pętli.
	 */
	private static void zad22() {
		CompanyExtended companyExampleExtended = new CompanyExtended();

		String[] names = { "Radoslaw", "Mieczyslaw", "Zbigniew" };
		String[] surnames = { "Nowak", "Sienkiewicz", "Brzeczyszczykiewcz" };
		int[] ages = { 34, 45, 65 };

		for (int i = 0; i < names.length; i++) {
			companyExampleExtended.addEmployee(new Employee(names[i],
					surnames[i], ages[i]));
		}

		for (Employee emp : companyExampleExtended.getAllEmployees()) {
			System.out.println(emp.toString());
		}
	}

	private static void zad23() {

	}
}
