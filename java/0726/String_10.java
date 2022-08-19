package ja_0726;

public class String_10 {
	public static void main(String[] args) {
		
		String str_1 = "korea";
		String str_2 = "korea"; //먼저 만들어진 거 있으면 같은 걸로 공유해 그래서 얘네는 그냥 하나!
		
		System.err.println("str_1 : " + System.identityHashCode(str_1));
		System.err.println("str_2 : " + System.identityHashCode(str_2));
		
		System.out.println("String str_1 = \"korea\" ");
		System.out.println("String str_2 = \"korea\" ");
		System.out.println();
		
		if (str_1 == str_2) {
			System.out.println("str_1 == str_2 = true");			
		}else
			System.out.println("str_1 == str_2 = false");
		if (str_1.equals(str_2)) {
			System.out.println("str_1.equals(str_2) = true");			
		}else
			System.out.println("str_1.equals(str_2) = false");
		
		System.out.println();
		
		String str_3 = new String("seoul");
		String str_4 = new String("seoul");// new를 통해서 이름은 같지만 각자의 서울을 만든 것 그래서 주소값은 다르고 내용은 같은 것
		
		System.out.println("String str_3 = \"seoul\" ");
		System.out.println("String str_4 = \"seoul\" ");
		System.out.println();
		
		if (str_3 == str_4) {
			System.out.println("str_3 == str_4 = true");			
		}else
			System.out.println("str_3 == str_4 = false");
		if (str_3.equals(str_4)) {
			System.out.println("str_3.equals(str_4) = true");			
		}else
			System.out.println("str_3.equals(str_4) = false");
		
		System.out.println();
		
		System.err.println("str_3 : " + str_3.hashCode());
		System.err.println("str_4 : " + str_4.hashCode()); //여기선 hashCode()는 정확하게 비교되지 않음 System.identityHashCode를 통해서 비교할 수 있음		
		System.err.println("str_3 : " + System.identityHashCode(str_3));
		System.err.println("str_4 : " + System.identityHashCode(str_4));  //문자열속에 값을 비교하려면  equals로 해야 해!(내용비교)
	}

}
