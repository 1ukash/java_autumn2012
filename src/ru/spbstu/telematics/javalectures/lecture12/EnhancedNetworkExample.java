package ru.spbstu.telematics.javalectures.lecture12;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EnhancedNetworkExample {
	
	static ExecutorService service = Executors.newFixedThreadPool(10);
	
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(2048);
		while (!Thread.currentThread().isInterrupted()) {
			Socket client = server.accept();
//			new Thread(new ClientHanldler(client)).start();
			service.execute(new ClientHanldler(client));
		}
		
		service.shutdown();
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
