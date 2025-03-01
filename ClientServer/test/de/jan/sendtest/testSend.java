package de.jan.sendtest;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class testSend {
	
	private static Socket socket; 
	
	public static void main(String[] args) {
		try {
			socket = new Socket("127.0.0.1", 187);
			
			// Stellt Output Stream her von der Verbindung
			OutputStream outputStream = socket.getOutputStream();
			// Stellt eine beschreibare Verbindung her.
			PrintStream printer = new PrintStream(outputStream, true);
			
			printer.println("ping");
			// Catch Fehler
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (socket != null){
				try {
					// Schlie�t verbindung
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
