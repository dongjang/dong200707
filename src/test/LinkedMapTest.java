package test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMapTest {




public static void main(String[] args) {

	
	
		Map<String,String> map = new LinkedHashMap<>();
		
	
			map.put("4","4");
			map.put("왜","뭐");
			map.put("응","어");
			map.put("그","래");
		
			
			Iterator<String> it = map.keySet().iterator();
			
			
			while(it.hasNext()){
				
				
				String key= it.next();
				System.out.println(key+""+map.get(key));
				
				
			}
			
			
			
			
}

}
