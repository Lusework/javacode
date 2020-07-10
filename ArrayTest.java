package com.test.type;

public class ArrayTest {
	//数组测试小程序
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义int型变量i
		int i;
		//定义一个int类型的数组，并动态初始化为5
		int[] a = new int[6];
		//使用for循环将5个元素遍历出来
		for(i=0;i<6;i++)
			a[i] = i;
		
		for(i=a.length-1;i>=0;i--)
		
			System.out.println("a["+i+"]="+a[i]);
		
		
	}

}
