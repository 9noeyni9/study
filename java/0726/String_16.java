package ja_0726;

public class String_16 {
	public static void main(String[] args) {
		double d = 10.3;
		char ch[] = { '오', '늘', '날', '씨', ' ', '온', '도', '는' };
		
		String str = String.valueOf(ch) + " " + String.valueOf(d); //valueOf는 다양한 타입을 받을 수 있다.
		System.out.println(str); //valueOf로 ch타입과 d타입 데이터를 받아서 스티링화 했고 그걸 출력함
	}

}
