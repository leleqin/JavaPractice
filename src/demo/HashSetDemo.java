package demo;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 定义功能去除ArrayList中的重复元素
 * 
 * */
public class HashSetDemo {
	public static void main(String[] args){
		ArrayList a1 = new ArrayList();
		a1.add("abc1");
		a1.add("abc2");
		a1.add("abc2");
		a1.add("abc1");
		a1.add("abc");
		System.out.println(a1);
		
		a1 = getSingleElement(a1);
		
		System.out.println(a1);
	}
	public static ArrayList getSingleElement(ArrayList a1) {
		//1.定义一个临时容器
		ArrayList temp = new ArrayList();
		//2.迭代a1集合
		Iterator it = a1.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
		//3.判断被迭代到的元素是否在临时容器中存在
			if(!temp.contains(obj))
			{
				temp.add(obj);
			}
		}
		return temp;
	}
}
