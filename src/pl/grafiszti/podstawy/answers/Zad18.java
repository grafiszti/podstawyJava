package pl.grafiszti.podstawy.answers;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import pl.grafiszti.podstawy.main.Main;

public class Zad18 {
	File file;

	public Zad18() {
		file = new File("../podstawyJava/assets/Zad18.txt");
	}

	public Zad18(String path) {
		file = new File(path);
	}

	public void run() throws IOException {		
		System.out.println("Podaj imie do zapisania: ");
		String name = Main.consoleReader.nextLine();
		
		PrintWriter writer = new PrintWriter(file);
		writer.println(name);
	    writer.close();

	    System.out.println(Main.consoleReader.nextLine());
	}
}
