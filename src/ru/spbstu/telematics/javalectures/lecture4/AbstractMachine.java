package ru.spbstu.telematics.javalectures.lecture4;


public abstract class AbstractMachine {
	
	private int id;
	
	public class Engine {
		
		private int coef;
		
		public void eatFuel() {
			AbstractMachine.this.fuelLevel -= coef;
//			fuelLevel -= coef;
		}
	}
	
	static class ElectricSystem {
		
	}
	
	private int fuelLevel;
	private Engine engine = new Engine();
	
	public void printModel() {
		
		class ModelPrinter {
			void print() {
				System.out.println(getModel() + " " + getPower() + " " + getNumberCylinders());
			}
		}
		
		new ModelPrinter().print();
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public ICalculator getCalculator(){
		return new Calculator();
	}

	protected abstract String getModel();

	protected abstract int getPower();

	protected abstract int getNumberCylinders();
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AbstractMachine) {
			return ((AbstractMachine) obj).id == id;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
}
