package com.test.jihe;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLiseTest {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		//向集合里面添加数据
		list.add("6");
		list.add("tinxai");
		list.add("tianshang");
		
		//通过iterator将集合中的数据遍历出来
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			String ne = (String) it.next();
			System.out.println(ne);
		}
		
		System.out.println(list);
		
		

	}

}
