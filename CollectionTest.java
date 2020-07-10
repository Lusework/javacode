package com.test.jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
	
	
		
		public static void main(String[] args)
		{
			//创建集合类的实例，实现类是Arraylist
			Collection names = new ArrayList();
			//向集合中添加数据
			names.add("孙悟空");
			
			names.add("天下");
			
			names.add("6");
			
			//使用iterator遍历数据
			Iterator it = names.iterator();
			
			while(it.hasNext())
			{
				String name = (String)it.next();   
				System.out.println(name);
			}
			
			System.out.println("c集合元素是否包含\"孙悟空\"字符串：" +names.contains("孙悟空"));
			System.out.println("c集合的元素个数为：" + names.size());
			
			System.exit(0);
		}
		
		
		

	}


