package pl.grafiszti.podstawy.answers;

import pl.grafiszti.podstawy.utils.BufferedBinaryReaderWriter;

/*1.16 Korzystając z własnego buforowania przekopiuj
 *  dane znajdujące się w pliku binarnie.txt do 
 *  przekopiowane.txt. Dodatkowo zlicz ilość skopiowanych bajtów.

 (Podpowiedź: użyj metody write(byte[] b, int off, int len), 
 dostępnej w każdej z dzisiaj omówionych klas).
 */

public class Zad116 {
	public void run() {
		BufferedBinaryReaderWriter copier = new BufferedBinaryReaderWriter(
				"../podstawyJava/assets/binarnie.txt",
				"../podstawyJava/assets/przekopiowane.txt");

		System.out.println("Przekopiowano : " + copier.copyInputToOutput()
				+ " bajtow");

		copier.close();
	}
}
