package com.acn.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 9);
		stream.forEach(System.out::println);

		// array
		Integer[] array = new Integer[] { 1, 2, 6, 7, 895, 3 };
		Stream<Integer> stream1 = Stream.of(array);
		stream1.forEach(System.out::println);

		// Collection
		List<String> list = new ArrayList<String>();
		list.add("Jhon");
		list.add("Pratik");
		list.add("java");

		Stream<String> listStream = list.parallelStream();
		listStream.forEach(System.out::println);
		

	}
}
