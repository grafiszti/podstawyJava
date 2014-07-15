package pl.grafiszti.podstawy.answers;

/*1.3 Napisz prosty kalkulator, w którym będziesz 
 * przechowywał 3 zmienne typu double o nazwach a,b,c. 
 * Wypróbuj wszystkie operatory matematyczne:
 (a+b)*c
 a-b/c
 użyj operatorów inkrementacji i zwiększ wszystkie zmienne o 1.
 Teraz porównaj ze sobą, czy:
 (a+b)>c
 czy a=b?
 Przedstaw wyniki w konsoli.
 */
public class Zad13 {
	double a, b, c;

	public Zad13() {
		this.a = 2;
		this.b = 2;
		this.c = 2;
	}

	public Zad13(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void run() {
		System.out.println("(a+b)*c = " + ((a+b)*c));
		System.out.println("a-b/c = " + (a-b/c));
		
		a++;
		b++;
		c++;
		
		System.out.println("czy (a+b)>c : " + (((a+b)>c)?"tak":"nie"));
		System.out.println("czy a=b : " + ((a==b)?"tak":"nie"));
	}
}
