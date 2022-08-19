package ja_0725;

public class Wrapper_1 {

	public static void main(String[] args) {
		
		Integer one = new Integer("345");
		Integer two = new Integer(45);
		
		int total = one.intValue() + two.intValue();
		String totalString = one.toString() + two.toString();
		
		System.out.println("one : " + one.intValue() + ", two : " + two.intValue()); //숫자 덧셈 
		System.out.println("one : " + one + ", two : " + two); 
		
		System.out.println("one + two : " + total);
		System.out.println("one.toString() + two.toString() : " + totalString); //문자열덧셈
		
		System.out.println(total + ">> 2 진수 : " + Integer.toBinaryString(total));
		System.out.println(total + ">> 8 진수 : " + Integer.toOctalString(total)); //8진수는 2진수를 세자리씩 
		System.out.println(total + ">> 16 진수 : " + Integer.toHexString(total)); //16진수는 2진수를 네자리씩
		
		System.out.println(Integer.TYPE);
			
		
	}
}
