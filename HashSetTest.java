package com.test.jihe;

import java.util.HashSet;

public class HashSetTest {
	
	
	
	//  创建一个HashSet的实例，向里面添加数据
	  
	  //从结果可以看出，当把一个对象添加到hashset中时，
	//如果需要重写该对象类的equals（）方法，则也应该重写其hashcode
	  
	//  @param args
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet bbs = new HashSet();
		bbs.add(new A());
		bbs.add(new A());
		bbs.add(new B());
		bbs.add(new B());
		bbs.add(new C());
		bbs.add(new C());
		
		System.out.println(bbs);
		
		

	}

}

class A
{
	public boolean equals(Object obj)
	{
		return true;
		
	}
}

class  B
{
	public int hashCode()
	{
		return 1;
	}
}

class C
{
	public int hashCode()
	{
		
		return 2;
	}
	public boolean equals(Object obj)
	{
		return true;
	}
}