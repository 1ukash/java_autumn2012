package ru.spbstu.telematics.javalectures.lecture7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {
	public static void main(String[] args) throws Exception {
//		analyze(new FooObject("foo", 100));
		invokeAndCreate(FooObject.class.getName());
	}
	
	private static void invokeAndCreate(String name)  throws Exception{
		System.out.println(name);
		Class<?> objClass = Class.forName(name);
		FooObject obj = (FooObject) objClass.newInstance();
		
		Constructor<?> c = objClass.getConstructor(String.class);
		FooObject obj2 = (FooObject) c.newInstance("It is a string");
		System.out.println(obj2.getName());
		
		Method m = objClass.getDeclaredMethod("setName", String.class);
		
		invokeMethod(m, obj);
		
		System.out.println("After reflective invocation: " + obj.getName());
		
		Method m2 = objClass.getMethod("getName");
		Object result = m2.invoke(obj);
		System.out.println("And result again: " + result);
		
		Field field = objClass.getDeclaredField("name");
		field.setAccessible(true);
		Object val = field.get(obj2);
		System.out.println("private field value: " + val);
	}

	private static void invokeMethod(Method m, Object obj) throws Exception {
		m.invoke(obj, "dynamically invoked");
	}

	static void analyze(Object obj) {
		Class clazz = obj.getClass();
		String name = clazz.getName();
		System.out.println(name);
		
		Constructor[] constructors = clazz.getConstructors();
		for (Constructor c : constructors) {
			System.out.println("Constructor name: " + c.getName());
		}
		
		Field[] fields = clazz.getFields();
		for (Field f : fields) {
			System.out.println("field: " + f.getName());
		}
		
		Field[] declaredFields = clazz.getDeclaredFields();
		
		for (Field f : declaredFields) {
			System.out.println("declared field:" + f.getName());
		}
		
		Method[] methods = clazz.getMethods();
		
		for (Method m : methods) {
			System.out.println("method: " + m.getName());
		}
		
		Method[] declaredMethods = clazz.getDeclaredMethods();
		for (Method m : declaredMethods) {
			System.out.println("declared method: " + m.getName());
		}
	}
}
