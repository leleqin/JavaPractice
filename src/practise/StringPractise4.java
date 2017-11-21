package practise;
/*
 * 4.模拟一个trim功能一致的方法.去除字符串两端的空白
 * 
 * 思路
 * 1.定义两个变量
 * 一个作为从头开始判断字符串空格的角标。start++
 * 一个作为从尾开始判断字符串空格的角标。end--
 * 2.判断到不是空格为止，去头尾之间的字符串即可
 * */
public class StringPractise4 {

	public static void main(String[] args) {
		String s = "   ab  c   ";
		s = myTrim(s);
		System.out.println("-" + s + "-");
	}
	public static String myTrim(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start <= end && s.charAt(start) == ' ') {
			start++;
		}
		while (start <= end && s.charAt(end) == ' ') {
			end--;
		}
		return s.substring(start, end + 1);
	}
}
