package org.set;

import java.util.*;

public class Question5 {

	public static void main(String[] args) {
		HashSet<Integer> list = new HashSet<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(90);
		list.add(10);
		list.add(10);
		list.add(40);
		list.add(50);
		System.out.println(list);

		HashSet<Integer> list1 = new HashSet<>();

		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		list1.add(80);

		list1.removeAll(list);
		System.out.println(list1);

	}

}
