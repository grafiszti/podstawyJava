package pl.grafiszti.podstawy.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class BinaryReaderWriter {
	RandomAccessFile stream;

	public BinaryReaderWriter(String path, String accessMode) {
		stream = null;
		try {
			stream = new RandomAccessFile(path, accessMode);
		} catch (FileNotFoundException e) {
			System.out.println("Nie znaleziono pliku");
			e.printStackTrace();
		}
	}

	public void write(int element) {
		if (stream == null) {
			System.out.println("Nie wczytano pliku");
			return;
		}

		try {
			stream.writeInt(element);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void write(String element) {
		if (stream == null) {
			System.out.println("Nie wczytano pliku");
			return;
		}

		try {
			stream.writeUTF(element);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void write(Double element) {
		if (stream == null) {
			System.out.println("Nie wczytano pliku");
			return;
		}

		try {
			stream.writeDouble(element);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			stream.close();
		} catch (IOException e) {
			System.out.println("Blad zamykania strumienia");
			e.printStackTrace();
		}
	}

	public int countBytesFromFile() {
		int byteCounter = 0;

		if (stream == null) {
			System.out.println("Nie wczytano pliku");
			byteCounter = -1;
		} else {
			try {
				while (stream.read() != -1) {
					byteCounter++;
				}
			} catch (IOException e) {
				System.out.println("Blad wejscia/wyjscia z pliku");
				e.printStackTrace();
			}
		}
		return byteCounter;
	}
}
