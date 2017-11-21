package demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap();
//		method(map);
		method_keySet(map);
//		method_entrySet(map);
//		method_values(map);
	}
public static void method_values(Map<Integer,String> map){
	map.put(2, "lulu");
	map.put(3, "lele");
	map.put(4, "feifei");
	map.put(6, "yuanyuan");
	map.put(9, "baibai");
	
	//ֻ��ȡvalue��ֵ
	Collection<String> values = map.values();
	
	Iterator<String> it = values.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
public static void method_entrySet(Map<Integer,String> map){
	map.put(2, "lulu");
	map.put(3, "lele");
	map.put(4, "feifei");
	map.put(6, "yuanyuan");
	map.put(9, "baibai");
	
	/*ԭ��ͨ��Mapת��set�Ϳ��Ե���
	�÷���������ֵ��ӳ���ϵ��Ϊ����洢����Set������
	���ӳ���ϵ�����;���Map.Entry����*/
	
	Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
	Iterator<Map.Entry<Integer,String>> it = entrySet.iterator();
	while(it.hasNext()){
		Map.Entry<Integer,String> ma = it.next();
		Integer key = ma.getKey();
		String value = ma.getValue();
		System.out.println(key+":::"+value);
	}
}
public static void method_keySet(Map<Integer,String> map){

	map.put(2, "lulu");
	map.put(3, "lele");
	map.put(4, "feifei");
	map.put(6, "yuanyuan");
	map.put(9, "baibai");
	
	//ȡ��map�е�����Ԫ�ء�
	//ԭ��ͨ��keySet������ȡmap�����еļ����ڵ�Set���ϣ���ͨ��Set�ĵ�������ȡ
	//�ٶ�ÿһ����ͨ��map���ϵ�get������ȡ���Ӧ��ֵ���ɡ�
	
	Set<Integer> keySet = map.keySet();
	Iterator<Integer> it = keySet.iterator();
	while(it.hasNext()){
		Integer key = it.next();//��ȡ�����еļ�
		String value = map.get(key);//��ȡ����Ӧ��ֵ
		System.out.println(key+":"+value);
	}
}
public static void method(Map<Integer,String> map){
	//<Integer,String>���ͣ�ѧ�ţ�������
	//���
	System.out.println(map.put(8, "wangcai"));
	System.out.println(map.put(8, "xiaofang"));
	//����ͬ����ֵ�Ḳ�ǡ�
	map.put(2, "lele");
	map.put(5, "feifei");
	System.out.println(map);//��ӡ����
	
	//ɾ��
	System.out.println("remove:"+map.remove(2));
	System.out.println(map);//��ӡ����
	//��ʽ����=ֵ
	
	//�ж�
	System.out.println("containskey:"+map.containsKey(7));
	System.out.println(map);//��ӡ����

	//��ȡ
	System.out.println("get:"+map.get(8));
	System.out.println("get:"+map.get(6));//�����ڷ���ֵΪnull
	System.out.println(map);//��ӡ����
}
}
