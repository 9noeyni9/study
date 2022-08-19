package ja_0727;


import java.util.Vector;

public class Vector_1 
{
	public static void main(String[] args)
	{
		
		Vector<String> vv = new Vector<String>(5); //capacity 가 5인 Vector
		                                           //<String>제너릭에선 타입 이렇게 정해
		print(vv);

		vv.add("1");
		vv.add("2");
		vv.add("3");
		vv.add("4");
		vv.add("5");
		vv.add("6"); //왜 위에서 5까지만 만들었는데 6도 허용이 되는거지?
		
		//https://keepmind.net/java-collection-framework-1/
		
		print(vv);
		
		vv.trimToSize(); // 빈 공간을 없앤다 용량과 크기가 같아 진다.
		
	    System.out.println("=========================66");
	    
	    print(vv);
	    
	    vv.ensureCapacity(7);//Vector의 용량이 최소한 minCapacity가 되도록 한다.
	    System.out.println("=========================77");
	    print(vv);
	    System.out.println("=========================88");
		vv.add("1");
		vv.add("2");
		vv.add("3");
		vv.add("4");
		vv.add("5");
		vv.add("6");	    
		vv.add("7");	    
		vv.add("8");
		print(vv);
		
		vv.setSize(8);
		System.out.println("===========================");
		print(vv);
		
		vv.clear(); //Vector를 비운다
		System.out.println("===========================");
		print(vv);		
		
		
	}
	
	private static void print(Vector<String> vv)
	{
		System.out.println(vv);
		System.out.println("vv.size : " + vv.size());
		System.out.println("vv.capacity : " + vv.capacity());
	}

}
