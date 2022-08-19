package ja_0725;

public class Wrapper_4 {
	public static void main(String[] args) {
		
		int abc = new Integer("789").intValue();
		int bcd = Integer.parseInt("678"); //문자열을 숫자열로 바꾸는데 하는데 기본형으로 리턴
		Integer cde = Integer.valueOf("567"); // Wrapper클래스 Integer타입
		
		int int_1 = Integer.parseInt("100", 2);
		int int_2 = Integer.parseInt("100", 8);
		int int_3 = Integer.parseInt("100", 16);
		//int int_4 = Integer.parseInt("FF"); //얘는 에러야
		int int_4 = Integer.parseInt("FF", 16);
		
		Integer integer_1 = Integer.valueOf("100", 2);
		Integer integer_2 = Integer.valueOf("100", 8);
		Integer integer_3 = Integer.valueOf("100", 16);
		//Integer integer_4 = Integer.valueOf("FF");
		Integer integer_4 = Integer.valueOf("FF", 16);
		
		System.out.println(abc);
		System.out.println(bcd);
		System.out.println(cde);
		
		System.out.println("100(2) : " + int_1);
		System.out.println("100(8) : " + int_2);
		System.out.println("100(16) : " + int_3);
		System.out.println("FF(16) : " + int_4);
		
		System.out.println("100(2) : " + integer_1);
		System.out.println("100(8) : " + integer_2);
		System.out.println("100(16) : " + integer_3);
		System.out.println("FF(16) : " + integer_4);
	}

}
