package com.maps;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Maps {
public static void main(String[] args) {
	
	Map a = new HashMap();
	
	a.put(1, "Anurag");
	a.put(2, 123456);
	
	System.out.println(a.get(1));
	System.out.println(a.get(2));
	System.out.println(a.entrySet());
	System.out.println(a.values());
	System.out.println(a.keySet());
	
for(Object entry : a.entrySet()) {
		System.out.println(entry);
	}
}
}
