package demo;

public class WrapperDemo {
	public static void main(String[] args)
	{
//		System.out.println("123"+1);//字符串+1
//		System.out.println(Integer.parseInt("123")+1);
		//将123转成了整数再和1做运算
//		Integer i = new Integer("123");
//		System.out.println(i.intValue());
		//将Integer对象转成一个整数
//		System.out.println(Integer.toBinaryString(60));//转二进制
//		System.out.println(Integer.toOctalString(60));//转八进制
//		System.out.println(Integer.toHexString(60));//转十六进制
//		System.out.println(Integer.toString(60, 2));//转任意进制
//		System.out.println(Integer.parseInt("110", 10));//转十进制
//		System.out.println(Integer.parseInt("110", 2));//转二进制
//		System.out.println(Integer.parseInt("3c", 16));//转随意进制
		
//		int num = 4;
//		num = num + 5;
//		Integer i = 4;//自动装箱，等价于：i = new Integer(4);
//		i = i + 6;//自动拆箱，等价于： i = new Integer(i.intValue()+6);也等价于：i.intValue();
		
		Integer a = new Integer("127");
		Integer b = new Integer(127);
		System.out.println(a==b);//不同对象，所以false
		System.out.println(a.equals(b));//Integer覆盖了object类，比较的是数值型的
//		System.out.println(a.compareTo(b));
		
		Integer x = 127;
		Integer y = 127;
		System.out.println(x==y);
		System.out.println(x.equals(y));
		
		
		
		
	}
}
