package com.shuzu.test;

public class ShuZu {
	public static void main(String[] args)
	{	//静态初始化一个数组
		int[] a = {12,14,15};
		//将数组的长度打印出来，输出的长度为3
		System.out.println(a.length);
		//将数组中的数据遍历出来                                                                                       
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		System.out.println((int)12.34f*100);
	}
	
	

	
}
