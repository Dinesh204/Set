package org.set;

import java.util.*;

public class Question2point2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(105);
		list.add(205);
		list.add(305);
		list.add(405);
		list.add(505);
		list.add(605);
		list.add(705);
		list.add(805);
		list.add(505);
		list.add(605);
		System.out.println(list);

		Set<Integer> list1 = new TreeSet<>();

		list1.addAll(list);
		System.out.println("Convert in to : " + list1);

	}
}
