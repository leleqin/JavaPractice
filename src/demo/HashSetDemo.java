package demo;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ���幦��ȥ��ArrayList�е��ظ�Ԫ��
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
		//1.����һ����ʱ����
		ArrayList temp = new ArrayList();
		//2.����a1����
		Iterator it = a1.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
		//3.�жϱ���������Ԫ���Ƿ�����ʱ�����д���
			if(!temp.contains(obj))
			{
				temp.add(obj);
			}
		}
		return temp;
	}
}
