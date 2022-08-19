package ja_0714;

public class Circle_1 {
	public static void main(String[] args) {
		
		
		final float PI =3.1415f;
		
		int r =13;
		
		//PI = 5.345f;  // 파이널이 붙어서 변경 불가능 파이널이 아니면 가능 
		
		double area = PI * r * r;
		double round = PI * 2 * r;     
		
		System.out.printf("원의 넓이 %7.3f \u33A0  " , area );  //프린트에프 : ,뒤에는 출력값만 와야 한다. 아닐 수도 있음 ㅎㅎ;;
		System.out.printf("\n원의 둘레 %7.3f \u339D  " , round); //소수점 프린트 할 떄,,, 프린트 에프 쓰나봐!
		
	}

}
