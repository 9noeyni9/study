package ja_0728;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_3 
{
	public static void main(String[] args) 
	{
		
		ArrayList<String> numbers = new ArrayList<String>(); //<String>을 써주면 형변환할 필요가 없으므로 에러가 안 나와 밑에 이터레이터도 마찬가지
		
		numbers.add("10");
		numbers.add("20");
		numbers.add("30");
		numbers.add("40");
		System.out.println("add(값)");
		System.out.println(numbers);
		
		numbers.add(1, "50");
		System.out.println("\nadd(인덱스,값)");
		System.out.println(numbers);
		
		numbers.remove(2);
		System.out.println("\nremove인덱스)");
		System.out.println(numbers);
		
		System.out.println("\nget(인덱스)");
		System.out.println(numbers.get(2));
		
		System.out.println("\nsize()");
		System.out.println(numbers.size()); //넘버스 안에 값 몇개냐

		System.out.println("\nindexOf()");
		System.out.println(numbers.indexOf("45")); //45라는 값이 들어있니? :존재하지 않아서 -1이 출력
		
		Iterator<String> it = numbers.iterator();
		
		System.out.println("\niterator");
		while (it.hasNext())
		{
			String value = it.next();
			// it.next()가 오브젝트 타입이라면 String value = (String) it.next(); 이렇게 형변환이 필요해
			//지금은 Iterator<String> it = numbers.iterator(); 이렇게 String이 범위라 지금은 안 해줘도 돼
			//Iterator it = numbers.iterator(); 이러면 오브젝트 타입이라 String value = (String) it.next(); 이렇게 해줘야 해
			if (value.equals("30"))
			{
				it.remove();
			}
			System.out.println(value); //value는 지금 지우기 전에 값을 갖고 있어
			
		}
		
		System.out.println(numbers);
		
		System.out.println("\nfor each");
		for (String value : numbers)  // 향상된 for문 numbers값을 value에 하나씩 담는 것
		{
			System.out.println(value); //담은 걸 출력!			
		}
		
		System.out.println("\nfor");
		for (int i = 0; i < numbers.size(); i++)
		{
			System.out.println(numbers.get(i));
			
		}
		
		
		
	}

}
