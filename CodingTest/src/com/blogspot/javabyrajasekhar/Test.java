package com.blogspot.javabyrajasekhar;

public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.nullcheck(null);
	}
}


class A {

	public void nullcheck(Object o) {
		System.out.println("i am from object");
	}

	public void nullcheck(String s) {
		System.out.println("i am from string");
	}

}