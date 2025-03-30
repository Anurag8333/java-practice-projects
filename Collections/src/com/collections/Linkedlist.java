package com.collections;

import java.util.Collection;
import java.util.LinkedList;

public class Linkedlist {
	
	public static void main(String[] args) {
		
		Collection a = new LinkedList();
		
		a.add(new Linkedlist());
		a.add(123);
		System.out.println(a.contains(123));
		System.out.println(a);
		System.out.println(a.hashCode());
		a.clear();
		System.out.println(a);
		System.out.println(a.getClass());
	}
}
