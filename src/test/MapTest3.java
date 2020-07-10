package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest3 {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		Map<Double, Integer> map1 = new HashMap<>();
		Map<Integer,Double> map2 = new HashMap<>();
		Map<Object,Object> map3 =  new HashMap<>();
		
		
		map.put("이름", "장동진");
		map.put("저녁", "이삭토스트.....");
		map1.put(1.1, 3);
		map1.put(1.3, 5);
		map2.put(1,2.5);
		map2.put(123, 1.4);
	    map3.put(7.10,"오늘 알바....");
		map3.put("그래도 내일 쉼",2.8);
		
		
		
	Iterator<String> it = map.keySet().iterator();
	Iterator<Double> it1 = map1.keySet().iterator();
	Iterator<Integer> it2 = map2.keySet().iterator();
	Iterator<Object> it3 = map3.keySet().iterator();
	
	
	
		while(it.hasNext()) {
			
			String key = it.next();
			Double key1 = it1.next();
			Integer key2 = it2.next();
			Object key3 = it3.next();
			System.out.println(key+ " : " + map.get(key));
			System.out.println(key1+ " : " + map1.get(key1));
			System.out.println(key2+ " : " + map2.get(key2));
			System.out.println(key3+ " : " + map3.get(key3));
		}
		
		
	}
}
