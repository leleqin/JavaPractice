package demo;

import java.util.Iterator;
import java.util.TreeSet;

import admin.Person;
import comparator.ComparatorByName;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new ComparatorByName());
		t.add(new Person("zhangsan",22));
		t.add(new Person("wangwu",28));
		t.add(new Person("zhaosi",23));
		t.add(new Person("wangyu",27));
		
		
		Iterator it = t.iterator();
		
		while(it.hasNext())
		{
			Person p = (Person)it.next();
			System.out.println(p.getName()+"ƒÍ¡‰:"+p.getAge());
		}
		
	}

}
