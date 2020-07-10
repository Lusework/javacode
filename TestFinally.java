package com.test.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个文件输入流fil赋值为空
		
		FileInputStream fil = null;
		
		try
		
		{//将一个不存在的文件写入一个字符输入流中
			fil = new FileInputStream("s.txt");
			
		}
		catch(IOException ioe)
		//捕获异常，提示找不到指定的文件
		{
			System.out.println(ioe.getMessage());
		}
		
		finally
		{
			if(fil!=null)
				try{
					fil.close();
				}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
			}
		}
		

	}

}
