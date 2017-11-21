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
	
	//只获取value的值
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
	
	/*原理：通过Map转成set就可以迭代
	该方法将键和值的映射关系作为对象存储到了Set集合中
	这个映射关系的类型就是Map.Entry类型*/
	
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
	
	//取出map中的所有元素。
	//原理：通过keySet方法获取map中所有的键所在的Set集合，再通过Set的迭代器获取
	//再对每一个键通过map集合的get方法获取其对应的值即可。
	
	Set<Integer> keySet = map.keySet();
	Iterator<Integer> it = keySet.iterator();
	while(it.hasNext()){
		Integer key = it.next();//获取到所有的键
		String value = map.get(key);//获取键对应的值
		System.out.println(key+":"+value);
	}
}
public static void method(Map<Integer,String> map){
	//<Integer,String>泛型（学号，姓名）
	//添加
	System.out.println(map.put(8, "wangcai"));
	System.out.println(map.put(8, "xiaofang"));
	//存相同键，值会覆盖。
	map.put(2, "lele");
	map.put(5, "feifei");
	System.out.println(map);//打印集合
	
	//删除
	System.out.println("remove:"+map.remove(2));
	System.out.println(map);//打印集合
	//格式：键=值
	
	//判断
	System.out.println("containskey:"+map.containsKey(7));
	System.out.println(map);//打印集合

	//获取
	System.out.println("get:"+map.get(8));
	System.out.println("get:"+map.get(6));//不存在返回值为null
	System.out.println(map);//打印集合
}
}
