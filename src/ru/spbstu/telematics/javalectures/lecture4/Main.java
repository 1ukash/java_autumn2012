package ru.spbstu.telematics.javalectures.lecture4;

import ru.spbstu.telematics.javalectures.lecture4.AbstractMachine.ElectricSystem;
import ru.spbstu.telematics.javalectures.lecture4.AbstractMachine.Engine;

public class Main {
	public static void main(String[] args) {
		AbstractMachine car = new Volvo();
		car.printModel();
		
		Volvo car2 = new Volvo();
		
		ElectricSystem s = new ElectricSystem();
		Engine e = car2.new Engine();
		
		
		// anonymous classes
		AbstractMachine vaz = new AbstractMachine() {

			@Override
			protected String getModel() {
				return "vaz 2109";
			}

			@Override
			protected int getPower() {
				return 72;
			}

			@Override
			protected int getNumberCylinders() {
				return 4;
			}
			
		};
		
		vaz.printModel();
		
		ICalculator calc = new ICalculator() {
			
			@Override
			public int multiply(int a, int b) {
				return (a * b) %2;
			}
			
			@Override
			public double divide(int a, int b) {
				return 0;
			}
			
			@Override
			public int add(int a, int b) {
				return (a + b) % 2;
			}
		};
		
		Object o = car;
		
		if (o.getClass() == Volvo.class) {
			System.out.println("object o is a Volvo");
		}

		if (o.getClass() == AbstractMachine.class) {
			System.out.println("object o is an Abstract machine");
		}
		
		if (o instanceof AbstractMachine) {
			System.out.println("o is abstract machine object");
		}
		
		if (o instanceof Volvo) {
			System.out.println("o is abstract machine object");
		}		
		
		Object cal = new Calculator();
		
		if (cal instanceof Calculator) {
			System.out.println("yes! it is a calculator!");
		}
		
		if (cal.getClass() == Calculator.class) {
			System.out.println("yes! it is a calculator!");
		}
		
		if (cal instanceof IComputer) {
			System.out.println("yes! it is a Icomputer!");
			IComputer comp = (IComputer) cal;
			comp.compute();
		}

		if (cal instanceof ICalculator) {
			System.out.println("yes! it is a Icalculator!");
			ICalculator c = (ICalculator) cal;
			
			c.add(1, 2);
		}
		
		ICalculator calculator = car.getCalculator();
		int r = calculator.multiply(2, 2);
	}
}
