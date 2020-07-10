package test;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {

	public static void main(String[] args) {
		
		Map<String,Integer> m = new HashMap<>();
		
			m.put("age",10);
			
			
			for(int i=m.get("age"); i<=50;i++) {
				
			int	sum = m.get("get")+i;
				m.put("age",sum);
				
			}
			
		
		System.out.println(m);
		
		
	}
}

