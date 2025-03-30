package com.collections;
import java.util.ArrayList;
import java.util.Collection;

public class Arraylist {

	public static void main(String[] args) {
	 	
		Collection c = new ArrayList();
		
		System.out.println(c.add("hello"));
		c.add(123);
		c.add(35.5);
		c.add(35.5);
		
		System.out.println(c);
		
		Collection d = new ArrayList();
		d.add(c);
		d.add("Anurag Singh");
		d.addAll(c);
		System.out.println(d);
		d.removeAll(c);
		d.remove(c);
		System.out.println(d);
		
	}
}
