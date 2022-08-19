package ja_0729;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto 
{
	public static void main(String[] args) 
	{
		
		Set<Integer> set = new TreeSet<>();
		Set<Integer> set2 = new TreeSet<>();
		
		for (int i = 0; set.size() <6; i++)
		{
			int num = (int)(Math.random()*45+1);
			
			set.add(new Integer(num)); //중복배제 할 필요 없어 set은 중복이 안되니까
			
		} 
		System.out.println(set);
		
		for (int i = 0; set2.size() <7 ; i++)
		{
			int num = (int)(Math.random()*45+1);
			
			set2.add(new Integer(num));
			
		}
		
		System.out.println(set2);
		
	}
}
