package org.set;

import java.util.*;

public class Question4Point2 {

	public static void main(String[] args) {

		LinkedHashSet<Integer> list = new LinkedHashSet<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(90);
		list.add(10);
		list.add(10);
		list.add(40);
		list.add(50);
		System.out.println(list);

		LinkedHashSet<Integer> list1 = new LinkedHashSet<>();
		list1.add(10);
		list1.add(20);
		list1.add(60);
		list1.add(50);
		list1.add(40);
		list1.add(70);
		list1.add(80);
		list1.add(90);

		list1.retainAll(list);
		System.out.println("Common Values : " + list1);

	}

}
