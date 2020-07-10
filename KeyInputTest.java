package com.test.type;

import java.util.Scanner;

public class KeyInputTest {
	//测试从键盘获取数据,并将它们打印到控制台
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("您贵姓?(如:王)");
		String familyName=in.nextLine();
		System.out.println("您多大了?(如:21)");
		int age = in.nextInt();
		
		System.out.println("喂,"+familyName+",w");
		
	}

}
