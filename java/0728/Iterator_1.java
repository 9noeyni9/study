package ja_0728;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.Iterator;

//속도가 느리대,,ㅎ 동기화 처리가 되어있어서,,,뭐랑,,,?ㅎㅎ,,,
public class Iterator_1 
{
	public static void main(String[] args) 
	{
		
		
		Vector list = new Vector();//벡터에서는 이터레이터 사용 가능해(반대는 불가)
		//List list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add(8);
		list.add(9);
		list.add(new Date());
		list.add(45.899);
		
		Iterator itt = list.iterator();
		
		

			
			while(itt.hasNext()) 
			{
				Object obj = itt.next(); //Object타입은 모든 타입을 갖겠다는 것!
				System.out.println(obj);
			}		
		
		
		
		
//	   Enumeration enu = list.elements();//여기서 제너릭 설정하면 범위가 한정되는 것 
//		
//		while(enu.hasMoreElements()) 
//		{
//			Object obj = enu.nextElement(); //Object타입은 모든 타입을 갖겠다는 것!
//			System.out.println(obj);
//		}		
		
	}

}
