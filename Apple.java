package com.test.extendst;
//创建一个Apple类继承Fruit类，Apple就拥有Fruit类的所有成员变量和方法
public class Apple extends Fruit{
	
	public static void main(String[] args) {
		//创建一个Apple的实例
		Apple a = new Apple();
		//为Apple实例的变量进行复制操作
		a.weight = 56;
		//调用info方法
		a.info();
	}

}

