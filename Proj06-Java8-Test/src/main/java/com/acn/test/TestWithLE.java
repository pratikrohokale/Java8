package com.acn.test;

import com.acn.beans.FunctionalInterfaceDemo;

public class TestWithLE {

	public TestWithLE() {
		System.out.println("Task1 c::Inside TestWithLE()");
	}

	public static void methodRef() {
		System.out.println("Task1 b::Inside methodRef()");
		System.out.println("Task1 c::Inside methodRef()");
	}

	public void instMethodRef() {
		System.out.println("Task1 c::Inside instance methodRef()");
	}

	public static void main(String[] args) {
		FunctionalInterfaceDemo demo = () -> {
			System.out.println("Task1 a::Implemented abstractMethod via Lambda");
		};
		demo.abstractMethod();

		FunctionalInterfaceDemo demo1 = TestWithLE::methodRef;
		demo1.abstractMethod();

		FunctionalInterfaceDemo instDemo = new TestWithLE()::instMethodRef;
		instDemo.abstractMethod();

		FunctionalInterfaceDemo conDemo = TestWithLE::new;
		conDemo.abstractMethod();
		
		System.out.println("-----------------------------------------");

	}

}
