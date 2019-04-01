package com.acn.test;

@FunctionalInterface
interface Sayble {
	void say();
}

public class MethodReference {
	public static void saySomeThing() {
		System.out.println("saySomething");
	}
	
}
