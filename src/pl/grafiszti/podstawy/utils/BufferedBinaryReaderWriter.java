package pl.grafiszti.podstawy.utils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedBinaryReaderWriter {
	DataInputStream inputStream;
	DataOutputStream outputStream;
	int bufferSize;
	byte[] buffer;

	public BufferedBinaryReaderWriter() {
		bufferSize = 512;
		buffer = new byte[bufferSize];

		inputStream = null;
		outputStream = null;
	}

	public BufferedBinaryReaderWriter(String inputFilePath,
			String outputFilePath) {
		bufferSize = 512;
		buffer = new byte[bufferSize];

		inputStream = null;
		outputStream = null;

		try {
			inputStream = new DataInputStream(
					new FileInputStream(inputFilePath));
			outputStream = new DataOutputStream(new FileOutputStream(
					outputFilePath));
		} catch (FileNotFoundException e) {
			System.out.println("Nie znaleziono plikow");
			e.printStackTrace();
		}
	}

	public int copyInputToOutput() {
		int byteCounter = 0;
		if (inputStream == null || outputStream == null) {
			byteCounter = -1;
			System.out.println("Nie zaladowano wszystkich potrzebnych plikow");
		} else {
			int tempByteCounter = 0;
			try {
				while ((tempByteCounter = inputStream.read(buffer)) != -1) {
					outputStream.write(buffer, 0, tempByteCounter);
					byteCounter += tempByteCounter;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return byteCounter;
	}

	public void close() {
		try {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		} catch (IOException e) {
			System.out.println("Blad wejscia/wyjscia");
			e.printStackTrace();
		}
	}
}
