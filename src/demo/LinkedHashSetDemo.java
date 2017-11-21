package demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		HashSet a2 = new LinkedHashSet();
		a2.add("haha");
		a2.add("heihei");
		a2.add("luelue");
		a2.add("lulu");
		Iterator it = a2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
