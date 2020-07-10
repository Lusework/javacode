package com.amaker.test;

import java.io.*;

public class FileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//创建字符输入流
			FileWriter f = new FileWriter("G:\\lmc\\note\\wenjianliu\\ttt.txt");
			//创建一个字符串变量s
			String s = "夏日炎炎";
			//将s变量写入到字符输入中
			f.write(s);
			//关闭输入流
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("ok");
		} 
		
		
		

	}
	
	
}
