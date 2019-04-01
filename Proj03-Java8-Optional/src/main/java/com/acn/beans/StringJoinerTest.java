package com.acn.beans;

import java.util.StringJoiner;

public class StringJoinerTest {

	public static void main(String[] args) {
		StringJoiner sj1 = new StringJoiner(":");
		sj1.add("FE");
		sj1.add("SE");
		sj1.add("TE");
		System.out.println(sj1);
		StringJoiner sjoiner = new StringJoiner(";", "{", "}");
		sjoiner.add("Spring");
		sjoiner.add("java8");
		sjoiner.add("oracle");
		sjoiner.add("hibernate");

		System.out.println(sjoiner);
		System.out.println(sj1.merge(sjoiner));

	}

}
