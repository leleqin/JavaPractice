package comparator;

import java.util.Comparator;

public class ComparatorBylength implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1 = (String)o1;
		String s2 = (String)o2;
		int temp = s1.length()-s2.length();
		
		return temp==0?s1.compareTo(s2):temp;
		//compareTo是字符串自身具备的方法
	}

}
