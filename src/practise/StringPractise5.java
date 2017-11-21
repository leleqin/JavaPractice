package practise;
/*
 * String s = "113@ ere qqq yyui"
 * 请输出所有所有字串
 * */
public class StringPractise5 {
	public static void main(String[] args)
	{
		String s = "113@ ere qqq yyui";
		s = s.replaceAll("@", "");
		String [] ss = s.split("");
		for (int i = 0; i < ss.length; i++) {
			System.out.print(ss[i]);
		}
	}
}
