package comparator;

import java.util.Comparator;

import admin.Person;


public class ComparatorByName implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {

		Person p1 = (Person)arg0;//ǿת
		Person p2 = (Person)arg1;
		
		int temp = p1.getName().compareTo(p2.getName());
		return temp==0?p1.getAge()-p2.getAge():temp;
	}

}
