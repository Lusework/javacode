package com.test.type;

public class SwitchStatement {
	//随机生成本月的某一天（1～30）并显示改天是星期几
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//生成随机数并进行判断
		int data = (int)(Math.random()*30)+1;
		
		switch(data%7)
		{
		case 0:
			System.out.println("本月"+data+"日是星期天");
			break;
			
		case 1:
			System.out.println("本月"+data+"日是星期一");
			break;
			
		case 2:
			System.out.println("本月"+data+"日是星期二");
			break;
			
		case 3:
			System.out.println("本月"+data+"日是星期三");
			break;
			
		case 4:
			System.out.println("本月"+data+"日是星期四");
			break;
			
		case 5:
			System.out.println("本月"+data+"日是星期五");
			break;
		
		case 6:
			System.out.println("本月"+data+"日是星期六");
			break;
		}
	}

}
