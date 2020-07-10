package com.test.type;

public class IfElseExperssion {
//该程序生成一个（1～2000）的年份，然后判断是否为闰年
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个int类型变量year用来保存年份
		int year = (int)(Math.random()*2000);
		//如果该年份模以4等于0与上该年份模以100不等于0或年份模以400相等于0
		if(year%4==0&&year%100!=0||year%400==0)
		{
			System.out.println(year+"年是闰年");
		}else
		{
			System.out.println(year+"年不是闰年");
		}
		
	}

}
