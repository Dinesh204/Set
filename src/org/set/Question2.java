package org.set;

import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(90);
		list.add(10);
		list.add(10);
		list.add(40);
		list.add(50);
		System.out.println("List :" + list);

		Set<Integer> list1 = new HashSet<>();

		list1.addAll(list);

		System.out.println("Convert in to Set: " + list1);

	}

}
