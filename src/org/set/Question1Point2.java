package org.set;

import java.util.*;

public class Question1Point2 {

	public static void main(String[] args) {
		Set<Integer> list = new LinkedHashSet<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(10);
		list.add(20);
		System.out.println("LinkedHashSet Values: "+list);

	}

}
