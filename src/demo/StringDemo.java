package demo;

public class StringDemo {
  public static void main(String[] args)
  {
	  String s = "jdk";
	  String s1 = s.toUpperCase();
	  String s2 = s1.substring(1,3);
	  System.out.println(s1);
	  System.out.println(s2);
	  
	  StringBuffer sb = new StringBuffer("test");
	  sb.reverse();
	  System.out.println(sb);
	  
	  String a = "Java";
	  String a1 = new String("Java");
	  boolean b = a.equals(a1);
	  System.out.println(b);
  }
}
