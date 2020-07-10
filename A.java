package com.test.type;

public  class A {
	private static int size;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.taskInner();
		
	}
	public void taskInner()
	{
		Inner k = new Inner();
		k.doSomething(8);
				
	}
	
	public class Inner{
		
		private int size;
		public void doSomething(int y)
		{
			size++;
			this.size++;
			A.this.size++;
			System.out.println(size+" "+this.size+" "+A.this.size);
		}
		
	}
	

}
