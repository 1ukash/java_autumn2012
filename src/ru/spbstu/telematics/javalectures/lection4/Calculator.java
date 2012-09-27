package ru.spbstu.telematics.javalectures.lection4;

public class Calculator implements ICalculator, IComputer {
	

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	@Override
	public double divide(int a, int b) {
		return (double) a / b;
	}

	@Override
	public void compute() {
		
	}
}
