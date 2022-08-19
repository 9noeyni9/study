package ja_0727;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayList_1
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list_1 = new ArrayList<>(10); //제너릭을 인티저로 정했으니까 인티저로 한정한 것
		
		list_1.add(5);
		list_1.add(new Integer(4));
		list_1.add(new Integer(3));
		list_1.add(new Integer(2));
		list_1.add(new Integer(0));
		list_1.add(new Integer(1));
		list_1.add(new Integer(3));
		
		ArrayList list_2 = new ArrayList(list_1.subList(1, 4));
		
		print(list_1, list_2);
		
		Collections.sort(list_1); //지정 안 해주면 자동으로 오름차순
		Collections.sort(list_2);
		print(list_1, list_2);
		
		System.out.println("list_1.containAll(list_2) : " + list_1.containsAll(list_2));
		
		list_2.add("B");
		list_2.add("C");
		list_2.add("A");
		
		System.out.println("list_1.containsAll(list_2) : " +list_1.containsAll(list_2));
		print(list_1, list_2);
		
		list_2.set(3, "Queen"); //3번 인덱스값 변경
		print(list_1, list_2);
		
		//list_1에서 list_2와 겹치는 부분만 남기고 나머지 삭제
		System.out.println("list_1.retainAll(list_2)" + list_1.retainAll(list_2));
		print(list_1, list_2);
		
		//list_2에서 list_1에 포함된 객체들을 삭제
		for (int i = list_2.size()-1 ; i >= 0 ; i--) 
		{
			if(list_1.contains(list_2.get(i))) //가지고 있다면 list_2에서 삭제해라
			{
				list_2.remove(i);
				
			}
			
		}
		print(list_1, list_2);		
	}
	
	private static void print(ArrayList list_1,ArrayList list_2)
	{
		System.out.println("list_1 : " +list_1);
		System.out.println("list_2 : " +list_2);
		System.out.println();
	}
	

}
