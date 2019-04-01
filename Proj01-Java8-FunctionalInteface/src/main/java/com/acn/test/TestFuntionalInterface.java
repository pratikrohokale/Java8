package com.acn.test;

import com.acn.beans.Interface1;

public class TestFuntionalInterface implements Interface1 {

	public static void main(String[] args) {
		TestFuntionalInterface test = new TestFuntionalInterface();
		test.display();
	}

	@Override
	public void display() {
		System.out.println("Hello to functional interface");

	}
}
