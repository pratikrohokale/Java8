package com.acn.beans;


@FunctionalInterface
public interface FunctionalInterfaceDemo {
	
	public static void diplay() {
		System.out.println("Inside FunctionalInterface static diplay() method");
	}

	public default void defaultMethod() {
		System.out.println("Inside FunctionalInterface default defaultMethod() method");
	}

	public void abstractMethod();
}
