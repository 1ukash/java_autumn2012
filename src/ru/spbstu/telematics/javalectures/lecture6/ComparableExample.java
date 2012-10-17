package ru.spbstu.telematics.javalectures.lecture6;

import java.util.Vector;

public class ComparableExample {
	
	static class ManContainer<T extends Man> {
		T man;
		String name;
		public ManContainer(T man, String name) {
			super();
			this.man = man;
			this.name = name;
		}
		
		
	}
	
	public static void main(String[] args) {
		Man man = new Man();
		BlackMan blackMan = new BlackMan();
		int r = man.compareTo(blackMan);
		
		Man[] men = new Man[10];
		BlackMan[] blackMen = new BlackMan[10];
		
//		Man min = min(men);
//		BlackMan min2 = min(blackMen);
		
		ManContainer<Man> c1 = new ManContainer<Man>(man, "c1");
		ManContainer<BlackMan> c2 = new ManContainer<BlackMan>(blackMan, "c2");
		
		printMansDna(c2);
		printMansDna(c1);
		
		Vector<Person> persons = new Vector<>();
		persons.add(new Person(1, 20, "Ivan"));
		persons.add(new Person(2, 21, "Petr"));
		persons.add(new Person(3, 19, "Maria"));
		
		allToString(persons);
		
		Vector<String> strings = new Vector<>();
		strings.add("str1");
		strings.add("str2");
		strings.add("str3");
		strings.add("str4");
		allToString(strings);
		
		for (Person p : persons) {
			p.getName();
		}
		
		for (BlackMan m : blackMen) {
			m.printDNA();
		}
		
	}
	
	public static <T extends Comparable<? super T>> T min(T[] a) {
		
		if (a.length == 0)
			return null;
		
		T min = a[0];
		
		for (int i = 1; i < a.length; i ++) {
			if (min.compareTo(a[i]) < 0) {
				min = a[i];
			}
		}
		
		return min;
	}
	
	public static void printMansDna(ManContainer<? extends Man> container) {
		System.out.println(container.name);
		container.man.printDNA();
	}
	
	public static void allToString(Vector<?> v) {
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i).toString());
		}
	}
}
