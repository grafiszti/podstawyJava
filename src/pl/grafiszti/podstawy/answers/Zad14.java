package pl.grafiszti.podstawy.answers;

import static java.lang.Math.*;

/*1.4 Napisz prosty kalkulator, w którym zainicjujesz dwie 
 * zmienne int a i b dowolnymi liczbami mieszczącymi się w 
 * zakresie – niech a będzie liczbą ujemną, natomiast b dodatnią… 
 * Następnie wykorzystując import statyczny wyświetl wyniki 
 * następujących działań bez użycia dodatkowych zmiennych:
 -a^b (a do potęgi b)
 -|a| (wartość bezwzględna z liczby a)
 -pierwiastek z liczby a podniesionej do potęgi b.
 Zobacz co się stanie, gdy do a i b przypiszesz dwie 3 cyfrowe liczby, oraz gdy liczba b będzie nieparzysta (wynik a^b będzie ujemny).
 */
public class Zad14 {
	int a, b;

	public Zad14(){
		this.a = -24;
		this.b = 36;
	}
	
	public void run(){
		System.out.println("-a^b (a do potęgi b) " + pow(a,b));
		System.out.println("-|a| (wartość bezwzględna z liczby a) " + abs(a));
		System.out.println("-pierwiastek z liczby a podniesionej do potęgi b. " + sqrt(pow(a,b)));
	}
}
