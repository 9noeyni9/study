package ja_0713;

public class Araay_12 {
	public static void main(String[] args) {
	
		if (args.length != 3) {  //length는 숫자,갯수 인덱스가 아님
			System.out.println("usage : java Array_12 num1 OP num2");
			System.exit(0);
			
		}
		
		int num1 = Integer.parseInt(args[0]);  //문자인 숫자를 정수값으로 바꾸겠다
		char op = args[1].charAt(0); // 문자열에서 글자를 가져오겠다는 것 0이 아닌 n번째를 출력하면 n+1글자가 수식이어야함
		int num2 = Integer.parseInt(args[2]); 
		
		int result =0 ;
		
		switch (op) {
		case '+' :
			       result = num1 + num2;
			       break;
			       
		case '-' :
		       result = num1 - num2;
		       break;

		case 'x' :
		       result = num1 * num2;
		       break;
		       
		case '/' :
		       result = num1 / num2;
		       break;	
		       
	default :
	System.out.println("사칙 연산만 가능");
	System.out.println("다른 연산은 지원되지 않습니다~~~~~");
		}
		
		System.out.println("결과 : " +result );
	}

}
