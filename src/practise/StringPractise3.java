package practise;

/*
 * 3.两个字符串中最大相同的子串
 * "qwerabcdtyuiop"
 * "xabcdvbn"
 * 
 * 思想：
 * 1.取最大字符串，先看短的字符串是否在长的字符串中
 * 如果存在，短的那个字符串就是最大字符串
 * 2.如果不是，就将短的子串进行长度递减的方式去子串，再在长串中判断是否存在
 * 如果存在就找到了！
 * */
public class StringPractise3 {
	public static void main(String[] args) {
		String s1 = "qwerabcdtyuiop";
		String s2 = "xabcdvbn";

		String s = getMaxSubstring(s1, s2);
		System.out.println("s=" + s);
	}

	public static String getMaxSubstring(String s1, String s2) {
		for (int i = 0; i < s2.length(); i++) {
			for (int a = 0, b = s2.length() - i; b != s2.length() + 1; a++, b++) {
				String sub = s2.substring(a, b);
				//System.out.println(sub);//打印得到字符串（见小栗子）
				if(s1.contains(sub))
					return sub;
			}
		}
		return null;
	}
}
