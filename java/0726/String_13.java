package ja_0726;

public class String_13 {
	//static String str_1 = "kbs";	
	//static String str_1 = null; //여기서 null은 상수
	//static String str_2 = "kbs";
	//static String str_2 = null;
	
	static String str_1 = ""; //여기서 null은 상수
	static String str_2 = "";
	
	
	public static void main(String[] args) {
		
//		String_13 obj = new String_13();		
		for (int i = 0; i < 10 ; i++) {
			
//			obj.str_1 += i;
//			obj.str_2 += i;
			str_1 += i;
			str_2 += i;			
			
			
		}
		
		System.out.println("str_1 : " + str_1);
		System.out.println("str_2 : " + str_2);
		System.err.println("str_11 : " + str_1.hashCode());
		System.err.println("str_22 : " + str_2.hashCode());
		System.err.println("str_1111 : " + System.identityHashCode(str_1));
		System.err.println("str_2222 : " + System.identityHashCode(str_2));
		
		System.out.println("str_1 == str_2 : " + ((str_1 == str_2) ? "동일일" : "틀림"));
		System.out.println("str_1 equals str_2 : " + ((str_1.equals(str_2)) ? "동일일" : "틀림"));
		System.out.println("str_1 equalsIgnoreCase str_2 : " + ((str_1.equalsIgnoreCase(str_2)) ? "동일일" : "틀림"));
		
		
		
	}

}
