package ja_0729;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.Set;

public class HashMap_2
{
	public static void main(String[] args) 
	{
		
		HashMap map = new HashMap();
		
		map.put("나자바", new Integer(90)); //순서의미없어
		map.put("나자바", new Integer(100)); //키값 중복 안되니까 하나만 나와 마지막 거
		map.put("안자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("이자바", new Integer(90));
		map.put("구인영", new Integer(100000));
		
		System.out.println(map);
		//정렬공식..외우기,,뭔데 그게ㅜㅠ
		System.out.println();
		System.out.println("=====================================================================");
		
		Set set = map.entrySet();
		/*entrySet() : HashMap에 저장된 키와 값을 엔트리(키와 값의 결합) 형태로
		Set에 저장하여 변환한다.
		
		자바 HashMap 사용법 : https://coding-factory.tistory.com/556 
		*/
		
		Iterator itt = set.iterator(); // 이 자체에는 반복이 없어
		
		while(itt.hasNext())
		{
			Map.Entry e = (Entry) itt.next(); // 반환한 Set의 값이 사용할 데이터 타입이 Map.Entry
			
			
			/*
			 * Map.Entry는 인터페이스 
			 * 1. getKey
			 * 2. getValue
			 * 1,2의 API를 갖고 있어
			 */
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}
		
		System.out.println();
		
		set = map.keySet();
		/*
		 * Map에 값을 전체 출력하기 위해서는 entrySet(), keySet() 메소드를 
		 * 사용하면 되는데 entrySet() 메서드는 key와 value의 값이 모두 필요한 경우 사용하고, 
		 * keySet() 메서드는 key의 값만 필요한 경우 사용
		 */
		
		System.out.println("참가자 명단" + set);
		
		Collection values = map.values();
		itt = values.iterator();
		int total =0 ;
		
		while(itt.hasNext())
		{
			Integer ii = (Integer) itt.next();
			System.out.println("ㅋㅋ :  "+ii);
			
			total += ii.intValue();
			
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total / set.size());
		System.out.println("최고 점수 : " + Collections.max(values));
		System.out.println("최저 점수 : " + Collections.min(values));
		
		

		
		
		
		
	}

}
