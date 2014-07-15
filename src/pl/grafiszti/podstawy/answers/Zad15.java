package pl.grafiszti.podstawy.answers;

import java.math.BigInteger;

/*1.5 Napisz program analogiczny do 1.4 wykorzystując klasę BigInteger. 
 * Utwórz dwie liczby wykraczające poza zakres long, wypróbuj funkcje 
 * dodawania, odejmowania i mnożenia, a także podniesienie do 
 * potęgi(zobacz w API jaki typ parametru przyjmuje ta funkcja) i 
 * wartość bezwzględną. Wszystkie wyniki zaprezentuj w konsoli.
 */
public class Zad15 {
	BigInteger a, b;
	int exp;

	public Zad15() {
		this.a = new BigInteger("-123123123123123123123123123123");
		this.b = new BigInteger("987654321987654321987654321982");
		this.exp = 5; // taka mala wartosc bo inna zabija moj komputer
	}

	public void run() {
		System.out.println("dodawanie " + a.add(b));
		System.out.println("odejmowanie " + a.subtract(b));
		System.out.println("mnożenie " + a.multiply(b));
		System.out.println("dzielenie " + a.divide(b));
		System.out.println("potęga " + a.pow(exp));
		System.out.println("wartosc bezwzgledna " + a.abs());

	}

}
