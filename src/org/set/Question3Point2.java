package org.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Question3Point2 {

	public static void main(String[] args) {

		Set<Integer> list = new TreeSet<>();

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

		Iterator<Integer> list1 = list.iterator();
		for (Integer ss : list) {
			System.out.println(ss);

		}

	}

}
