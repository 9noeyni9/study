package ja_0727;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Vector_2
{
	public static void main(String[] args) 
	{
		
		int i;
		
		Date date = new Date();
		
		Vector vv = new Vector(3, 5);
		
		vv.addElement("Java");

		vv.add(45.67);		
		vv.addElement(date);
		
		System.out.println("================ 3개의 객체 추가==============");
		
		System.out.println("size 11 : " + vv.size() + ", capacity : " + vv.capacity());
		
		System.out.println("===============================================");
		
		for (int j = 0; j < 10; j++)
		{
			
			vv.add(new Integer(j+1));
			
			
		}
		
		vv.add("Korea");
		
		System.out.println("=====================10개의 객체 추가==============");
		System.out.println("size22 : " + vv.size() + ", capacity : " + vv.capacity());
		
		System.out.println("============Vector 내용 출력 ===============");
		
		Enumeration enu = vv.elements();
		while (enu.hasMoreElements())
		{
			System.out.println(enu.nextElement() + " ");
		}//벡터속의 값을 뽑아오는 방법
		
		System.out.println("==================객체 포함 확인===========");
		
		if (vv.contains("Javar"))
		{
			System.out.println("Java 문자열 포함됨");
		}else
			System.out.println("Java 문자열 포함 안안안안됨");
		
		System.out.println("45.67 객체 위치 : " + vv.indexOf(new Double(45.67)));		
		System.out.println("56.7 객체 위치 : " + vv.indexOf(new Double(56.7))); //-1이 결과로 나왔다는 건 그 객체는 없다는 것
		System.out.println("\n 입력 시간 : " + vv.get(vv.indexOf(date)));
		
		//자바객체 삭제
		vv.removeElementAt(vv.lastIndexOf(date));
		
		for (int j = 0; j < vv.size(); j+= 3)
		{
			vv.removeElementAt(j);
		}
		
		vv.setElementAt("seoul", 2); //3번쨰 위치에 서울 문자열 추가
				
		enu = vv.elements();
		
		while (enu.hasMoreElements())
		{
			System.out.println(enu.nextElement() + " ");
		}
		
		System.out.println("\n size : " + vv.size() + " ,capacity : " + vv.capacity());
		
		vv.trimToSize();//공백제거
		System.out.println("\n size : " + vv.size() + " ,capacity : " + vv.capacity());
		
		enu =vv.elements();
		
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement() + " ");
		}
		vv.removeAllElements();//모든 객체 제거
		System.out.println("\n size : " + vv.size() + " ,capacity : " + vv.capacity());
		
				
		
	}

}
