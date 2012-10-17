package ru.spbstu.telematics.javalectures.lecture4;

public interface ICalculator {
	static final int OP_CODE = 1;
	
	int add(int a, int b);
	int multiply(int a, int b);
	double divide(int a, int b);
}
