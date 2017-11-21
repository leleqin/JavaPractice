package demo;

public class StringBufferDemo {

	public static void main(String[] args) {
		//创建缓冲区对象
		StringBuffer sb = new StringBuffer();
		sb.append(4).append(true);//.append("haha");//方法调用链
		sb.insert(1,"haha");
		//System.out.println(sb);//把缓冲区里的内容变成字符串了

		bufferMethodDem_2();
	}

	public static void bufferMethodDem_2() {
		StringBuffer sb = new StringBuffer("abcd");
		/*sb.setLength(2);
		System.out.println("sb:"+sb);
		System.out.println("len:"+sb.length());*/
		System.out.println(sb.reverse());
	}

	private static void bufferMethodDem_1() {
		StringBuffer sb = new StringBuffer("abcd");
	    //sb.replace(1, 3, "nba");
		sb.setCharAt(2, 'q');
		System.out.println(sb);
	}

	public static void bufferMethodDemo() {
		StringBuffer sb = new StringBuffer("abcd");
		//sb.delete(1, 3);
		
		//清空缓冲区
		sb.delete(0, sb.length());
		
		System.out.println(sb);
	}

}
