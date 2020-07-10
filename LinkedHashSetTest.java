package com.test.jihe;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	  static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建LinkedHashSet实例lhs
		LinkedHashSet lhs = new LinkedHashSet();
		
		//向集合中添加元素，查看输出的结果是否与添加的一致。
		 lhs.add("今天是个好天气");
		 lhs.add("明天天气怎么样");
		 lhs.add("明天下雨");
		 lhs.add("后天下雨");
		 
		 System.out.println(lhs);
		 
		 lhs.remove("今天是个好天气");
		 
		 lhs.add("今天是个好天气");
		 
		 
		 System.out.println(lhs);
		 
		 
		

	}

}
