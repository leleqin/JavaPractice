package demo;

public class StringBufferDemo {

	public static void main(String[] args) {
		//��������������
		StringBuffer sb = new StringBuffer();
		sb.append(4).append(true);//.append("haha");//����������
		sb.insert(1,"haha");
		//System.out.println(sb);//�ѻ�����������ݱ���ַ�����

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
		
		//��ջ�����
		sb.delete(0, sb.length());
		
		System.out.println(sb);
	}

}
