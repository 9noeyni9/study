package ja_0728;

import java.util.HashSet;

public class HashSetLotto__1 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		HashSet set2 = new HashSet();
		
		while(true)
		{
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));
			
			if(set.size() == 6)
			{
				break;
			}
			
		}
		
		System.out.println(set);
		
		
	}

}
