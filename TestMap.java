package com.test.jihe;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建一个map集合的实例
		Map map = new HashMap();
		
		//向集合中添加数据
		
		
		map.put("shuxue",25);
		map.put("shuxue", 26);
		map.put("yuwen", 12);
		
		//打印出map集合中的元素
		System.out.println(map);
		
		//判断是否包含某个值的key对象
		System.out.println("是否包含值为shuxue的key："+map.containsKey("shuxue"));
		
		//清除map里的所有key-value
		map.clear();
		System.out.println(map);
		
		
		

	}

}
