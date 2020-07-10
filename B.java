package com.test.extendst;

public class B extends A{
	public B()
	{
		System.out.println("B");
	}
	public static void main(String[] args) {
		
		new B();
		new A();
		A a = new B();
	}
}
