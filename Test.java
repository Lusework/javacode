package com.test.type;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d1 = new Dog("xiaohuang");
		Dog d2 = new Dog("xiaohuang");
		String s1 = d1.toString();
		String s2= d2.toString();
		String s3 = "xiaohuang";
		String s4 = "xiaohuang";
		
		System.out.println(d1.equals(d2));
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(d1 = d2);
		

	}
	
	

}

class Dog
{
	public String name;
	
	Dog(String name)
	{
		this.name = name;
	}

}

