package demo;

public class WrapperDemo {
	public static void main(String[] args)
	{
//		System.out.println("123"+1);//�ַ���+1
//		System.out.println(Integer.parseInt("123")+1);
		//��123ת���������ٺ�1������
//		Integer i = new Integer("123");
//		System.out.println(i.intValue());
		//��Integer����ת��һ������
//		System.out.println(Integer.toBinaryString(60));//ת������
//		System.out.println(Integer.toOctalString(60));//ת�˽���
//		System.out.println(Integer.toHexString(60));//תʮ������
//		System.out.println(Integer.toString(60, 2));//ת�������
//		System.out.println(Integer.parseInt("110", 10));//תʮ����
//		System.out.println(Integer.parseInt("110", 2));//ת������
//		System.out.println(Integer.parseInt("3c", 16));//ת�������
		
//		int num = 4;
//		num = num + 5;
//		Integer i = 4;//�Զ�װ�䣬�ȼ��ڣ�i = new Integer(4);
//		i = i + 6;//�Զ����䣬�ȼ��ڣ� i = new Integer(i.intValue()+6);Ҳ�ȼ��ڣ�i.intValue();
		
		Integer a = new Integer("127");
		Integer b = new Integer(127);
		System.out.println(a==b);//��ͬ��������false
		System.out.println(a.equals(b));//Integer������object�࣬�Ƚϵ�����ֵ�͵�
//		System.out.println(a.compareTo(b));
		
		Integer x = 127;
		Integer y = 127;
		System.out.println(x==y);
		System.out.println(x.equals(y));
		
		
		
		
	}
}
