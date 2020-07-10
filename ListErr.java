package com.test.jihe;
import java.util.ArrayList;
import java.util.List;

public class ListErr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//创建一个只保存字符串的List集合
	List strList = new ArrayList();		
		
		strList.add("疯狂java讲义");
		strList.add("英语");
		
		strList.forEach(x->System.out.println(((String)x).length()));
		
				
	}

}
