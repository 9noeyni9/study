package ja_0725;

public class String_1 {
	public static void main(String[] args) {
		
		char[] ss = {'k', 'o', 'r', 'e', 'a'};
		
		String str1 = "Hello"; // 문자열 대입

		String str2 = new String("java"); //문자열 생성자
		String str3 = new String(ss);   // 문자 배열을 이용한 생성자
		
		System.out.println(ss);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str1 + str2 + str3);
		System.out.println();
		System.out.println(ss.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		String kbs1 = "Hello";
		System.out.println(kbs1.hashCode()); //힢에 스트링 풀에 들어가 하나가 만들어지면 다시 입력했을 때 기존 코드에서 가져다 씀(그래서 주소값이 똑같아)
		
		String kbs2 = new String("Hello");
		System.out.println(kbs2.hashCode());		
		//https://velog.io/@jeb1225/JAVA-String-Pool
		
		
		if (str1 == kbs1) {
			System.out.println("str1과 kbs1은 같다");			
		}else {
			System.out.println("str1과 kbs1는 다다르다.");
		}
		if (str1.equals(kbs1)) {
			System.out.println("str1과 kbs1은 같다");			
		}else {
			System.out.println("str1과 kbs1는 다다르다.");
		}
		
		if (str1 == kbs2) {
			System.out.println("str1과 kbs2은 같다");			
		}else {
			System.out.println("str1과 kbs2는 다다르다.");
		}		
		if (str1.equals(kbs2)) {
			System.out.println("str1과 kbs2은 같다");			
		}else {
			System.out.println("str1과 kbs2는 다다르다.");
		}		
	}

}
