package pl.grafiszti.podstawy.answers;

import pl.grafiszti.podstawy.utils.BinaryReaderWriter;

/*
 1.15 Do pliku daneBinarne.txt zapisz swoje imię, 
 aktualny rok i wynik dzielenia 50/4. Następnie z 
 tego samego pliku odczytaj ile znajduje się w nim bajtów.
 */
public class Zad115 {
	public void run() {
		BinaryReaderWriter writer = new BinaryReaderWriter(
				"../podstawyJava/assets/daneBinarne.txt", "rw");

		writer.write("Mateusz");
		writer.write(2014);
		writer.write(50 / 4);

		System.out.println("ilosc bajtow w pliku: "
				+ writer.countBytesFromFile());
		
		writer.close();
	}
}
