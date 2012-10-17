package ru.spbstu.telematics.javalectures.lecture4;

public class Volvo extends AbstractMachine {

	@Override
	protected String getModel() {
		return "Volvo XC90";
	}

	@Override
	protected int getPower() {
		return 190;
	}

	@Override
	protected int getNumberCylinders() {
		return 4;
	}
	
	private void foo() {
		Engine e = getEngine();
	}

}
