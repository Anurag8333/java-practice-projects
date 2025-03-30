package com.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {
public static void main(String[] args) {
	
	Set a = new HashSet();
	Collection b = new LinkedHashSet();
	
	a.add(1);
	a.add(1);
	a.add(2);
	a.add(b);
	a.add(3);
	
	System.out.println(a.size());
	System.out.println(a);
}
}
