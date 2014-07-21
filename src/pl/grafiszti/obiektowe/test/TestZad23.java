package pl.grafiszti.obiektowe.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import pl.grafiszti.obiektowe.answers.zad23.Point;

/*2.3 Utwórz klasę Punkt, która przechowuje dwie wartości typu int – współrzędne 
 * punktu na powierzchni. Napisz w niej także metody które:

 zwiększają wybraną współrzędną o 1
 zmieniają wybraną zmienną o dowolną wartość
 zwracają wartość współrzędnych (oddzielne metody)
 wyświetla wartość współrzędnych
 Napisz także klasę, w której przetestujesz działanie metod wyświetlając 
 działanie metod na ekranie,
 */
public class TestZad23 {

	@org.junit.Test
	public void testCreate() {
		Point point = new Point();
		assertEquals(0, point.getX());
		assertEquals(0, point.getY());

		Point point2 = new Point(4, 5);
		assertEquals(4, point2.getX());
		assertEquals(5, point2.getY());
	}

	@org.junit.Test
	public void testIncrease() {
		Point point = new Point(3, 6);
		point.incX();
		point.incY();
		assertEquals(4, point.getX());
		assertEquals(7, point.getY());
	}

	@org.junit.Test
	public void testSet() {
		Point point = new Point(3, 6);
		assertEquals(3, point.getX());
		assertEquals(6, point.getY());

		point.setX(5);
		point.setY(12);
		assertEquals(5, point.getX());
		assertEquals(12, point.getY());
	}
}
