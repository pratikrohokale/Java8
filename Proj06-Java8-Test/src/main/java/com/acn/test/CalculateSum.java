package com.acn.test;

import java.util.Optional;

public class CalculateSum {

	static Integer a = null;
	static Integer b = 10;

	public static void sum(int a, int b) {
		/*Optional<Integer> op1 = Optional.ofNullable(a);
		if (op1.isPresent()) {
			System.out.println(op1.get() + b);
		} else {
			System.out.println(op1.orElse(0) + b);
		}*/
		int sum=a+b;
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		Optional<Integer> op1 = Optional.ofNullable(a);
		Optional<Integer> op2 = Optional.ofNullable(b);		
		CalculateSum.sum(op1.orElse(0), op2.orElse(0));
	}

}
