package demo;

public class StringDemo2 {

	public static void main(String[] args) {
		String s = "张三，李四，王五";
		String[] arr = s.split("，");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			}
		char[] chs = s.toCharArray();
				for (int i = 0; i < chs.length; i++) {
					System.out.println(chs[i]);
				}
		s = "ab";
		byte[] bytes = s.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		System.out.println("abA".toUpperCase());
		System.out.println("abA".toLowerCase());
		
		System.out.println("java".replace('a', 'o'));
		System.out.println("java".replace('q', 'o'));
		
		System.out.println("-"+"    a   b    c    ".trim()+"-");
		System.out.println("-"+"    a   b    c    "+"-");
		
		System.out.println("bac".concat("kk"));//比较专业
		System.out.println("bac"+"kk");
		
		

		String str = "ArrayDemo.java";
			System.out.println(str.startsWith("Array"));
			System.out.println(str.endsWith(".java"));
			System.out.println(str.contains("Demo"));
		
		//System.out.println(s.equals("ABC"));
		//System.out.println(s.equalsIgnoreCase("ABC"));
		//System.out.println(s.contains("bc"));
		//System.out.println(s.contains("cc"));
		
		System.out.println("a".compareTo("c"));
		System.out.println("a".compareTo("A"));
		System.out.println("a".compareToIgnoreCase("A"));
		
		
		String s1 = new String("abc");
		String s2 = s1.intern();
		System.out.println(s1==s2);

	}
}
