package ru.spbstu.telematics.javalectures.lecture12;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class NetworkExample {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(2048);
		while (true) {
			Socket client = server.accept();
			new Thread(new ClientHanldler(client)).start();
		}
	}

	static class ClientHanldler implements Runnable {
		private Socket client;

		public ClientHanldler(Socket client) {
			this.client = client;
		}

		@Override
		public void run() {
			InputStream is;
			try {
				is = client.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				Date d = new Date(dis.readLong());
				System.out.println("Client " + d + " socket: "
						+ client.toString());
				client.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
