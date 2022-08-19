package ja_0728;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class HashSetLotto_1
{
	public static void main(String[] args) 
	{
		
		HashSet set = new HashSet();
		HashSet set2 = new HashSet();
		
		while (true)
		{
			
			int num = (int)(Math.random()*45 +1); //1~45숫자 나와
			set.add(new Integer(num));
			
			if (set.size() == 6)
			{
				break;
				
			}
		}
		
		List list = new LinkedList(set);
		
		System.out.println(list);
		System.out.println(set);
		Collections.sort(list);// 오름차순 시키는 것
		System.out.println(list);
		
		while(true)
		{
			int num = (int)(Math.random()*45 +1);
			set2.add(new Integer(num));
			
			if (set2.size() == 6)
			{
				break;
				
			}
		}
		
		List list2 = new LinkedList(set2);
		
		Iterator itt = list2.iterator();
		
		while (itt.hasNext())
		{
			Object obj = itt.next();
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("Lotto  당첨 번호");
		
		for (int i = 0; i < list2.size() -1 ; i++)  //for문 뒤에 한줄이라면 굳이 안 묶어줘도 돼 두줄이상이면 묶어줘야하고!
		
			System.out.println(list2.get(i));
			
			System.out.print("\n 2등 당첨 번호 : ");
			System.out.println(list2.get(list2.size() -1));
			
		
			
			
	
		
		
		
	}

}
