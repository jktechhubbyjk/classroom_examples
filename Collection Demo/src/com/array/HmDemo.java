package com.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HmDemo {
public static void main(String[] args) {
	HashMap< Integer, String> hm = new HashMap<>();
	hm.put(101, "abc");
	hm.put(106, "abc");
	hm.put(102, "abc");
	hm.put(104, "abc");
	System.out.println(hm);
	
	Set s = hm.entrySet();
	
	Iterator itr = s.iterator();
	
	while(itr.hasNext()) {
		Map.Entry m = (Entry) itr.next();
		
		System.out.println(m.getKey() +" "+m.getValue());
	}
}
}
