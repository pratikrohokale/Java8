package com.acn.test;

import com.acn.beans.Square;

public class SquareTest {
	public static void main(String[] args) {
		int a = 5;
		// lambda expression to define calculate method
		Square s = (int x) -> {
			return x * x;
		};
		System.out.println(s.calculate(a));

		Square s1 = (int x) -> {
			return x * x * x;
		};

		System.out.println(s1.calculate(a));
	}
}
