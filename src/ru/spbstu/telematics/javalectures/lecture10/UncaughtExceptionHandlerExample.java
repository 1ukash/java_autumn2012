package ru.spbstu.telematics.javalectures.lecture10;

public class UncaughtExceptionHandlerExample {
	
	public static void main(String[] args) {
//		Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//
//			@Override
//			public void uncaughtException(Thread t, Throwable e) {
//				System.out.println("e: " + e.getMessage());
//			}
//			
//		});
		Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("e: " + e.getMessage() +", t: " + t.getName());
			}
			
		});

		fooMethod();
	}

	private static void fooMethod() {
		Long num = null;
		num.byteValue();
	}

}
