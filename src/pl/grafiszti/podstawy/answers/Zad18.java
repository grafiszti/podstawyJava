package pl.grafiszti.podstawy.answers;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zad18 {
	File file;

	public Zad18() {
		file = new File("../podstawyJava/assets/Zad18.txt");
	}

	public Zad18(String path) {
		file = new File(path);
	}

	public void run() throws IOException {		
		Scanner consoleReader = new Scanner(System.in);
		System.out.println("Podaj imie do zapisania: ");
		String name = consoleReader.nextLine();
		consoleReader.close();
		
		PrintWriter writer = new PrintWriter(file);
		writer.println(name);
	    writer.close();

	    Scanner reader = new Scanner(file);
	    System.out.println(reader.nextLine());
	    reader.close();
	}
}
