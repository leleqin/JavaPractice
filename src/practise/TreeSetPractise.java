package practise;

import java.util.Iterator;
import java.util.TreeSet;

import comparator.ComparatorBylength;

/*
 * 对字符串进行长度排序
 * 
 * 思路
 * 1.TreeSet本身具有自然排序
 * 2.但需要的是字符串长度排序
 * 3.建一个构造器！
 * */
public class TreeSetPractise {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new ComparatorBylength());
		
		ts.add("aaaa");
		ts.add("asg");
		ts.add("df");
		ts.add("gtty");
		ts.add("akdjahds");
		
		Iterator it = ts.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
