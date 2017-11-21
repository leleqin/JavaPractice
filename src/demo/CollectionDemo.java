package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		/*Collection coll = new ArrayList();//有容器了
		
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");*/
		//使用了Collection中的iterator()方法。
		//调用集合中的迭代器方法，为了获取集合中的迭代器对象
//		Iterator it = coll.iterator();
		//第一种方法
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		//当输出超过元素会出现java.util.NoSuchElementException异常
		//第二种方法
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		//释放it内存
/*		for(Iterator it = coll.iterator();it.hasNext();)
		{
			System.out.println(it.next());
		}*/
		
//		Collection coll = new ArrayList();//有容器了
//		show(coll);
//		Collection c1 = new ArrayList();
//		Collection c2 = new ArrayList();
//		show(c1,c2);
	/*}
	public static void show(Collection c1,Collection c2)
	{
		//给c1添加元素
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		//给c2添加元素
		c2.add("abc4");
		c2.add("abc2");
		c2.add("abc5");
		System.out.println(c1);
		System.out.println(c2);
		
		//取交集
		boolean b = c1.retainAll(c2);
		System.out.println(c1);*/
		
		
		
		//删除一些元素
//		boolean b = c1.removeAll(c2);
		//将两个集合中相同元素从调用removeAll的集合中删除

		//包含
//		boolean b = c1.containsAll(c2);		
//		System.out.println(b);
//		System.out.println(c1);
		
		
		
		
		
		
		
		//添加所有元素
//		c1.addAll(c2);
//		System.out.println(c1);
		
		
		
	}
/*	public static void show(Collection coll)
	{
		//添加元素
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		System.out.println(coll);
		//删除元素
		coll.remove("abc2");//会改变集合长度
		System.out.println(coll);
		//判断
		System.out.println(coll.contains("abc4"));
		System.out.println(coll.contains("abc3"));
		
	}*/
}
