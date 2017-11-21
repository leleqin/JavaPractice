package demo;

import java.util.Iterator;
import java.util.TreeSet;

import admin.Person;
import comparator.ComparatorByName;

public class GenericDemo {

	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<Person>(new ComparatorByName());
		ts.add(new Person("lisi",21));
		ts.add(new Person("lisi3",23));
		ts.add(new Person("lisi4",21));
		ts.add(new Person("lisi0",25));
		
		Iterator<Person> it = ts.iterator();
		while(it.hasNext()){
			Person p = it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}
	}

}
