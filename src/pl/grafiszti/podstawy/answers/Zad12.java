package pl.grafiszti.podstawy.answers;

/*
 * 1.2. Napisz program, w którym zadeklarujesz kilka stałych, 
 * lub zmiennych różnych typów o dowolnych nazwach, a następnie
 *  wyświetlisz je w kolejnych liniach tekstu. Skompiluj, lub 
 *  spróbuj skompilować przykłady podane w tej lekcji i zobacz
 *   co się stanie przy próbie nadania po raz drugi wartości 
 *   jakiejś stałej.

 W tym samym programie zadeklaruj cztery zmienne typu String. 
 Trzy z nich zainicjuj jakimiś wyrazami a czwartemu przypisz ciąg 
 znaków utworzony z trzech wcześniejszych zmiennych. Następnie 
 wyświetl czwartą zmienną na ekranie.
 Przy użyciu metody substring wyświetl na ekranie dwa pierwsze 
 wyrazy wykorzystując wyłącznie czwartą zmienną typu String.
 */
public class Zad12 {
	String stringA = "Ala";
	String stringB = "Ma";
	String stringC = "Kota";
	String stringD = stringA + stringB + stringC;

	public void run() {
		System.out.println(stringD);
		System.out.println(stringD.substring(0,
				stringA.length() + stringB.length()));
	}
}
