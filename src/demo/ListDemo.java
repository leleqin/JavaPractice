package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		show(list);
	}

	public static void show(List list) {
		//���Ԫ��
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		//��ȡ�б����������
		ListIterator it = list.listIterator();
		//����ʵ���ڵ��������е���ɾ�Ĳ�
		while(it.hasNext()){
			Object obj = it.next();
			if(obj.equals("abc2")){
//				it.add("abc10");//�������2�����abc10
				it.set("abc10");//�������2���滻��abc10
			}
		}
		System.out.println(list);
		
		/*//���е�ȡ����ʽ
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//List���е�ȡ��Ԫ��֮һ
		for(int x = 0;x < list.size();x++)
		{
			System.out.println(list.get(x));
		}*/
		//
		
//		System.out.println(list);
		//����Ԫ��
//		list.add(1, "abc9");
		//ɾ��Ԫ��
//		list.remove(1);
//		System.out.println(list.remove(2));
		//�޸�Ԫ��
//		System.out.println(list.set(1, "abc7"));
		//��ȡԪ��
//		System.out.println(list.get(3));
		//��ȡ���б�
//		System.out.println(list.subList(1, 3));
//		System.out.println(list);
		
	}

}
