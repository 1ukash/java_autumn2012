package ru.spbstu.telematics.javalectures.lecture11;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class BarObject implements Externalizable {
	private String name;
	private String testName;
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
	}
}
