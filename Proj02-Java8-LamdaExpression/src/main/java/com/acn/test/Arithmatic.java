package com.acn.test;

import java.util.function.BiFunction;

public class Arithmatic {

	public static int add(int a, int b) {
		return a + b;
	}

	public static float add(int a, float b) {
		return a + b;
	}

	public static float add(float a, float b) {
		return a + b;
	}

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> add1 = Arithmatic::add;
		BiFunction<Integer, Float, Float> add2 = Arithmatic::add;
		BiFunction<Float, Float, Float> add3 = Arithmatic::add;

		System.out.println(add1.apply(10, 2));
		System.out.println(add2.apply(10, 2.5f));
		System.out.println(add3.apply(10.5f, 2.5f));

	
	}

}
