package ja_0729;

import java.util.HashMap;
import java.util.Map;

public class HashMap_5 
{
	public static void main(String[] args) 
	{
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		String[] sample = {"to" , "be", "or", "not", "to", "be", "is", "a", "problem","lemon", "problem", "a"};
		
		//문자열에 포함된 단어의 빈도를 계산한다.		
		for(String a : sample)
		{
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq +1);//단어가 있으면 +1 반복문이니까 없을 떄 까지 반복
		}
		
		System.out.println(m.size() + " 개 단어가 있습니다."); //원소의 개수  		
		System.out.println(m.containsKey("to")); // 해당 원소 포함되어있는지
		System.out.println(m.isEmpty()); // 변수 안에 원소 없나 묻는 것
		System.out.println(m); 
		
	}

}
