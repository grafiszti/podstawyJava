package pl.grafiszti.podstawy.answers;

import pl.grafiszti.podstawy.utils.BufferedBinaryReaderWriter;

public class Zad116 {
	public void run() {
		BufferedBinaryReaderWriter copier = new BufferedBinaryReaderWriter(
				"../podstawyJava/assets/binarne.txt",
				"../podstawyJava/assets/przekopiowane.txt");

		System.out.println("Przekopiowano : " + copier.copyInputToOutput()
				+ " bajtow");
		
		copier.close();
	}
}
