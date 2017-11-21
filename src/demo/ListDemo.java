package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		show(list);
	}

	public static void show(List list) {
		//添加元素
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		//获取列表迭代器对象
		ListIterator it = list.listIterator();
		//可以实现在迭代过程中的增删改查
		while(it.hasNext()){
			Object obj = it.next();
			if(obj.equals("abc2")){
//				it.add("abc10");//如果等于2就添加abc10
				it.set("abc10");//如果等于2就替换成abc10
			}
		}
		System.out.println(list);
		
		/*//共有的取出方式
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//List特有的取出元素之一
		for(int x = 0;x < list.size();x++)
		{
			System.out.println(list.get(x));
		}*/
		//
		
//		System.out.println(list);
		//插入元素
//		list.add(1, "abc9");
		//删除元素
//		list.remove(1);
//		System.out.println(list.remove(2));
		//修改元素
//		System.out.println(list.set(1, "abc7"));
		//获取元素
//		System.out.println(list.get(3));
		//获取子列表
//		System.out.println(list.subList(1, 3));
//		System.out.println(list);
		
	}

}
