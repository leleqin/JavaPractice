package practise;

import java.util.Iterator;
import java.util.TreeSet;

import comparator.ComparatorBylength;

/*
 * ���ַ������г�������
 * 
 * ˼·
 * 1.TreeSet���������Ȼ����
 * 2.����Ҫ�����ַ�����������
 * 3.��һ����������
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
