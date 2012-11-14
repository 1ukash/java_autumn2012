package ru.spbstu.telematics.javalectures.lecture10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Semaphore;

public class OtherSync {
	public static void main(String[] args) throws InterruptedException {
		Semaphore s = new Semaphore(10);
		
		s.acquire(); // ++
		
		s.release(); // --
		
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		
		Map<String, String> map1 = Collections.synchronizedMap(new HashMap<String,String>());
		
		ConcurrentHashMap<String, String> map2 = new ConcurrentHashMap<>();
		
		map2.putIfAbsent("s", "s");
		
		CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();
		
		
	} 
}
