package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;;

public class RegularDemo {
	public static void main(String[] args)
	{
		Pattern p = null;
		Matcher m = null;
		p=Pattern.compile("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(.[a-zA-Z0-9_-]+)+$");
		m=p.matcher("602568224@qq.com");
		boolean result = m.matches();
		if(result)
			System.out.println("正确");
		else
			System.out.println("不正确");
	}
}
