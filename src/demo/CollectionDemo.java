package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		/*Collection coll = new ArrayList();//��������
		
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");*/
		//ʹ����Collection�е�iterator()������
		//���ü����еĵ�����������Ϊ�˻�ȡ�����еĵ���������
//		Iterator it = coll.iterator();
		//��һ�ַ���
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		//���������Ԫ�ػ����java.util.NoSuchElementException�쳣
		//�ڶ��ַ���
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		//�ͷ�it�ڴ�
/*		for(Iterator it = coll.iterator();it.hasNext();)
		{
			System.out.println(it.next());
		}*/
		
//		Collection coll = new ArrayList();//��������
//		show(coll);
//		Collection c1 = new ArrayList();
//		Collection c2 = new ArrayList();
//		show(c1,c2);
	/*}
	public static void show(Collection c1,Collection c2)
	{
		//��c1���Ԫ��
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		//��c2���Ԫ��
		c2.add("abc4");
		c2.add("abc2");
		c2.add("abc5");
		System.out.println(c1);
		System.out.println(c2);
		
		//ȡ����
		boolean b = c1.retainAll(c2);
		System.out.println(c1);*/
		
		
		
		//ɾ��һЩԪ��
//		boolean b = c1.removeAll(c2);
		//��������������ͬԪ�شӵ���removeAll�ļ�����ɾ��

		//����
//		boolean b = c1.containsAll(c2);		
//		System.out.println(b);
//		System.out.println(c1);
		
		
		
		
		
		
		
		//�������Ԫ��
//		c1.addAll(c2);
//		System.out.println(c1);
		
		
		
	}
/*	public static void show(Collection coll)
	{
		//���Ԫ��
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		System.out.println(coll);
		//ɾ��Ԫ��
		coll.remove("abc2");//��ı伯�ϳ���
		System.out.println(coll);
		//�ж�
		System.out.println(coll.contains("abc4"));
		System.out.println(coll.contains("abc3"));
		
	}*/
}
