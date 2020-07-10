package com.test.jihe;

import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		TreeSet nums = new TreeSet();
		nums.add(6);
		nums.add(11);
		nums.add(45);
		nums.add(5);
		nums.add(-8);
		
		System.out.println(nums);
		
		//输出集合中的第一个元素，
		System.out.println(nums.first());
		
		//输出集合中的最后一个元素
		
		System.out.println(nums.last());
		
		//输出小于6的子集，不包含6
		
		System.out.println(nums.headSet(6));
		
		//返回大于6的子集，如果set中包含6，子集中也包含6
		
		System.out.println(nums.tailSet(6));
		
		//返回大于6小于11的子集
		
		System.out.println(nums.subSet(6, 11));
		
				
		
	}

}
