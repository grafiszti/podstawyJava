package pl.grafiszti.obiektowe.main;

import java.io.IOException;
import java.util.Scanner;

import pl.grafiszti.obiektowe.answers.zad21.Company;
import pl.grafiszti.obiektowe.answers.zad21.Employee;
import pl.grafiszti.obiektowe.answers.zad22.CompanyExtended;
import pl.grafiszti.obiektowe.answers.zad23.Point;
import pl.grafiszti.obiektowe.answers.zad24.Adder;
import pl.grafiszti.obiektowe.answers.zad26.Point2D;
import pl.grafiszti.obiektowe.answers.zad26.Point3D;

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
			case 24:
				zad24();
				break;
			case 25:
				zad25();
				break;
			case 26:
				zad26();
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

	/*
	 * 2.3 Utwórz klasę Punkt, która przechowuje dwie wartości typu int –
	 * współrzędne punktu na powierzchni. Napisz w niej także metody które:
	 * 
	 * zwiększają wybraną współrzędną o 1 zmieniają wybraną zmienną o dowolną
	 * wartość zwracają wartość współrzędnych (oddzielne metody) wyświetla
	 * wartość współrzędnych Napisz także klasę, w której przetestujesz
	 * działanie metod wyświetlając działanie metod na ekranie,
	 * 
	 * Klasa testowa dodana w package pl.grafiszti.obiektowe.test - napisane
	 * testy jednostkowe
	 */
	private static void zad23() {
	};

	/*
	 * 2.4 Napisz program składający się z dwóch klas. Pierwsza niech zawiera
	 * kilka metod o nazwie dodaj(), ale zwracających różne typy wyników i
	 * przyjmujących po minimum dwa argumenty typów liczbowych wybranych przez
	 * Ciebie. Ich zadaniem jest zwrócenie, lub wyświetlanie sumy podanych
	 * argumentów. W drugiej klasie Testowej utwórz obiekt tej klasy i sprawdź
	 * działanie swoich metod, wyświetlając wyniki działań na ekranie. Dodatkowo
	 * każda z metod niech wyświetla swój typ zwracany i rodzaj argumentów, abyś
	 * wiedział, która z nich zadziałała.
	 */
	private static void zad24() {
		Adder adder = new Adder();
		System.out.println(adder.sum(32.4d, 423.5d));
		System.out.println(adder.sum(234, 65));
		System.out.println(adder.sum(3453, 5345, 6456));
		System.out.println(adder.sum(3245.34f, 3453.435f));
	}

	/*
	 * 2.5 Napisz program, który będzie się składał z dwóch klas: -Pracownik –
	 * przechowująca takie dane jak imię, nazwisko i wiek pracownika, oraz co
	 * najmniej trzy konstruktory, które posłużą do inicjowania obiektów z
	 * różnymi parametrami – w przypadku gdy przykładowo konstruktor przyjmuje
	 * tylko 1 parametr, zainicjuj pozostałe pola jakimiś domyślnymi
	 * wartościami. -Firma – klasa testowa, w której utworzysz kilka obiektów
	 * klasy Pracownik i wyświetlisz dane na ekran.
	 * 
	 * Mile widziane wykorzystanie tablic oraz pętli.
	 */
	private static void zad25() {
		CompanyExtended company = new CompanyExtended();
		company.addEmployee(new Employee());
		company.addEmployee(new Employee("Andrzej"));
		company.addEmployee(new Employee("Kowalski", 45));
		company.addEmployee(new Employee("Rafau", "Kalinowski", 11));

		for (Employee employee : company.getAllEmployees()) {
			System.out.println(employee.toString());
		}
	}

	/*
	 * 2.6 Stwórz klasę Punkt2D, która przechowuje informacje na temat punktu na
	 * przestrzeni dwuwymiarowej (współrzędne x oraz y). Zawierająca dwa
	 * konstruktory: bezparametrowy ustawiający pola na wartość 0, oraz
	 * przyjmujący dwa argumenty i ustawiający pola obiektu zgodnie z podanymi
	 * parametrami.
	 * 
	 * Napisz klasę Punkt3D dziedziczącą po Punkt2D, reprezentującą punkt w
	 * trójwymiarze (dodatkowe pole z).
	 * 
	 * W klasie testowej utwórz obiekty obu klas i przetestuj działanie.
	 */
	private static void zad26() {
		Point2D point2d1 = new Point2D();
		Point2D point2d2 = new Point2D(5, 6);

		Point3D point3d1 = new Point3D();
		Point3D point3d2 = new Point3D(5, 6, 7);

		System.out.println(point2d1.toString());
		System.out.println(point2d2.toString());
		System.out.println(point3d1.toString());
		System.out.println(point3d2.toString());
	}
	
	
}
