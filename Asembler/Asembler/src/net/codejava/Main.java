package net.codejava;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String fileName = "Pong";
		try {
			Parser p = new Parser(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
