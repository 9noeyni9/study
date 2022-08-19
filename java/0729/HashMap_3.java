package ja_0729;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_3
{
	static HashMap phoneBook = new HashMap();
	
	
	public static void main(String[] args) 
	{
		
		
		addPhoneNO("친구", "수선화", " 010-456-7890");
		addPhoneNO("친구", "해당화", " 010-123-7890");
		addPhoneNO("친구", "해당화", " 010-456-8943");
		addPhoneNO("친구", "들국화", " 010-456-6660");
		addPhoneNO("회사", "영산강", " 010-563-2538");
		addPhoneNO("회사", "섬진강", " 010-777-2538");
		addPhoneNO("회사", "금강", " 010-563-8538");
		addPhoneNO("회사", "한강", " 010-003-2538");
		addPhoneNO("세탁", " 010-563-8888");
		//
		printList();	
		
		
	}
	//전화번호부 전체를 출력
	
	private static void printList()
	{
		Set set = phoneBook.entrySet();
		Iterator itt = set.iterator();
		
		while (itt.hasNext())
		{
			
			Map.Entry e = (Entry) itt.next();
			
			Set subSet = ((HashMap) e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			
			System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]" );
			
			while(subIt.hasNext())
			{
				Map.Entry subE = (Entry) subIt.next();
				String telNo = (String) subE.getKey();
				String name = (String) subE.getValue();
				
				System.out.println(name + " " + telNo);
						
						
			}
			
			System.out.println();
				
			
		}		
			
		
	}	
		private static void addPhoneNO(String name, String tel)
		{
			
			addPhoneNO("기타", name, tel);
		}
		
		private static void addPhoneNO(String groupName, String name, String tel)
		{
			addGroup(groupName);
			
			HashMap group = (HashMap) phoneBook.get(groupName);
			group.put(tel, name);
		}
		
		private static void addGroup(String groupName)
		{
			if (!phoneBook.containsKey(groupName)) 
			{
				phoneBook.put(groupName, new HashMap());
			}
		}

}

