package ru.spbstu.telematics.javalectures.lecture7;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionExample {
	
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		
		SortedSet<Integer> set = new TreeSet<>();
		
		for (int i = 0; i < 10; i++) {
			int num = new Random().nextInt(100);
			c.add(num);
			set.add(num);
		}
		
		for (Integer i : c) {
			System.out.println("foreach: " +i);
		}
		
		Iterator<Integer> it = c.iterator();
		
		while (it.hasNext()) {
			Integer element = it.next();
			System.out.println("iterator: " + element);
		}
		
		for (Integer n : set) {
			System.out.println("Sorted:" + n);
		}
		
		System.out.println("Unmodifable example");
		List<Integer> g = generate();
		for (Integer el : g) {
			System.out.println("um: " + el);
		}
		
		g.add(10);
		
		BitSet bitSet = new BitSet(16);
		bitSet.set(0);
		bitSet.clear(1);

		BitSet bitSet2 = new BitSet(16);
		bitSet2.set(1);
		
		bitSet.or(bitSet2);

	}
	
	private static List<Integer> generate() {
		List<Integer> list = new LinkedList<Integer>();

		for (int i = 0; i < 10; i++) {
			int num = new Random().nextInt(100);
			list.add(num);
		}
		
		Collections.shuffle(list);
		
		return Collections.unmodifiableList(list);
	}

}
