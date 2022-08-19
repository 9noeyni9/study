package ja_0728;//String

import java.util.HashSet;
import java.util.Iterator;

public class HashSet__2 
	{
		 public static void main(String[] args) 
		{
			 
			 HashSet<String> setA = new HashSet<String>();
			 HashSet<String> setB = new HashSet<String>();
			 
			 HashSet<String> setHap = new HashSet<String>();
			 HashSet<String> setKyo = new HashSet<String>();
			 HashSet<String> setCha = new HashSet<String>();
			 
			 setA.add("1");
			 setA.add("2");
			 setA.add("3");
			 setA.add("4");
			 setA.add("5");
			 
			 System.out.println(" A = " + setA);
			 
			 setB.add("4");
			 setB.add("5");
			 setB.add("6");
			 setB.add("7");
			 setB.add("8");
			 
			 System.out.println(" B = " + setB);
			 
			 Iterator<String> itt = setB.iterator();
			 while(itt.hasNext())
			 {
				 String obj = itt.next();
				 
				 if (setA.contains(obj))
				 {
					 setKyo.add(obj);
					
				}
			 }
			 
			 itt = setA.iterator();

			 while(itt.hasNext())
			 {
				 String obj = itt.next();
				 
				 if (!setB.contains(obj))
				 {
					 setCha.add(obj);
					
				}
			 }		
			 
			 itt = setA.iterator();
			 
			 while(itt.hasNext())
			 {
				 setHap.add(itt.next());

			 }	
			 
			 itt = setB.iterator();
			 while(itt.hasNext())
			 {
				 setHap.add(itt.next());

			 }	
			 
			 System.out.println(" A ∩ B : " + setKyo);
			 System.out.println(" A ∪ B : " + setHap);
			 System.out.println(" A - B : " + setCha);
			 
			 System.out.println();		 
			 System.out.println(" A ∩ B : " + setA.retainAll(setB)); // 두 객체의 공통적인 요소는 HashSet에 남기고
			                                                       // 그 외에 요소들은 HashSet에서 삭제합니다.
			 
			 System.out.println(" A ∩ B : : " + setA);
			 System.out.println(" A ∪ B : : " + setA.addAll(setB));
			 
			 System.out.println(" A - B : " +setA.removeAll(setB));
			 System.out.println(" A - B : " +setB);

			 
			 
			 
			
		}

	}


