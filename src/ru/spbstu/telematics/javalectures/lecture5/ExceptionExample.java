package ru.spbstu.telematics.javalectures.lecture5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;

public class ExceptionExample {
	public static void main(String[] args) throws IOException {
//		outOfMemory();
//		try {
//			npe();
//		} catch (MyException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		checkedException();
		
		badExample();
		System.out.println(badExample2());
	}

	private static int badExample2() {
		int result = 2;
		
		try {
			npe();
			return result;
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//do smth
			return 3;
		}
	}

	private static void badExample() throws IOException {
		try {
			npe();
		} catch (MyException e) {
			// should never happen
			e.printStackTrace();
		}
	}

	private static void checkedException() {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(new File("/tmp/file.txt"));
			System.out.println("File opened");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void npe() throws MyException, IOException {
//		Object obj = null;
		Object obj = new Object();
		try { 
			obj.toString();
		} catch (Throwable e) {
			System.out.println(e);
			throw new MyException(e);
		} finally {
			System.out.println("finally block");
		}
		
		System.out.println("After try/catch");
	}

	private static void outOfMemory() {
		
		Vector v = new Vector();
		
		while (true) {
			v.add(new Object());
		}
	}
}
