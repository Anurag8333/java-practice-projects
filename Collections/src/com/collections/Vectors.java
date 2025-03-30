package com.collections;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Vectors {
 public static void main(String[] args) {
	
	 List a = new Vector();
	 
	 
	 a.add("Hi");
	 a.add(a);
	 System.out.println(a.get(0)); 
	 System.out.println(a); // [Hi , (this collection)]
	//a.remove(a);
	//a.removeAll(a);
	 System.out.println(a);
	 
	 Vector b = new Stack();
	 
	 b.add( a);
	 System.out.println(b);
}
}
