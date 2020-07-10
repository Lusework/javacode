package com.test.type;

public class ThreadTest1 {
	//测试多线程的一个小程序
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个线程的实例
		Thread t1 = new Thread(new Hello());
		//调用start方法
		t1.start();
	}

	//private static Thread Thread(Hello hello) {
		// TODO Auto-generated method stub
		//return null;
	//}

}

class Hello implements Runnable
{
	int i;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println("Hello"+i++);
			if(i==5) 
				break;
		}
		
		
	}
	
}

