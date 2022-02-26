package com.cursors;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapIterateDemo {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<>();
		map.put(101,"jitesh");
		map.put(105,"Ganesh");
		map.put(102,"Rahul");
		map.put(104,"Swapnil");
		map.put(103,"Dnyaneshwar");
		map.put(109,"Nilesh");
		map.put(110,"PRathmesh");
		System.out.println(map);
		
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Entry<Integer, String> e = (Entry<Integer, String>) itr.next();
			
			if(e.getKey()<=105) {
				System.out.println(e.getKey() + " "+ e.getValue());
			}
		}
		
		
		
		
	}

}
