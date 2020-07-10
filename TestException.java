package com.test.exception;

import java.util.Date;



public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个Date类变量d赋值为空
		Date d = null;
		//使用
		try{
			System.out.println(d.after(new Date()));
		}catch( NullPointerException ne)
		{
			System.out.println("空指针异常");
		}
		catch(Exception e)
		{
			System.out.println("未知异常");
		}

	}

}
