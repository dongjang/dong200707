package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		
		Map<String,Object> map = new HashMap<>();
		
		map.put("name", "애쉬");
		map.put("power", 30);
		map.put("Defense",50);
		map.put("level", 30);
		map.put("speed", 300);
		
		
		Iterator<String> it = map.keySet().iterator(); 
		
		while(it.hasNext()) {
			
			String key = it.next();
			

			System.out.println(key+ " : " + map.get(key));
			
			
		}
		
		

	}

}
