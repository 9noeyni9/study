package ja_0729;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap__2 {
	public static void main(String[] args) {
		
		
		HashMap map = new HashMap();
		
		map.put("나자바", new Integer(90)); //순서의미없어
		map.put("나자바", new Integer(100)); //키값 중복 안되니까 하나만 나와 마지막 거
		map.put("안자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("이자바", new Integer(90));
		map.put("구인영", new Integer(100000));
		
		System.out.println(map);
		System.out.println();
		System.out.println("==============================================");
		
		Set set = map.entrySet();
		Iterator itt = set.iterator();
		
		while(itt.hasNext())
		{
			Map.Entry e  = (Entry) itt.next();
			
			System.out.println("참가자 명단 : " + e.getKey() + "점수 : " + map.values());
			
		}
		
		

		
	}

}
