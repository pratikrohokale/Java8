package com.acn.test;

import com.acn.beans.FunctionExample;

public class FunctionTest {

	public static void display() {
		System.out.println("diplay():: inside the class");
	}

	public void threadStatus() {
		System.out.println("threadStatus():: Running Thread");
	}

	public FunctionTest() {
		System.out.println("FunctionTest():: Inside Constructor");
	}

	public static void main(String[] args) {
		
		// Reference with static methods
		/*
		 * FunctionExample fun = (String name, int id) -> {
		 * System.out.println("Method for functional interface implemented by: " + name
		 * + ", Id: " + id); System.out.println("Written on :" +
		 * System.currentTimeMillis()); };
		 */

		FunctionExample funExam = FunctionTest::display;
		funExam.show();

		/*
		 * Thread t = new Thread(FunctionTest::threadStatus); t.start();
		 */

		// Reference with Instance method
		// way 1
		FunctionTest test = new FunctionTest();
		FunctionExample fun1 = test::threadStatus;
		fun1.show();
		// way 2
		FunctionExample fun2 = new FunctionTest()::threadStatus;
		fun2.show();
		
		//Reference with Constructor
		FunctionExample fun3 = FunctionTest::new;
		fun3.show();
	}

}
