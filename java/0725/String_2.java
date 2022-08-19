package ja_0725;

public class String_2 {  //스트링과 다른 타입 연산하면 스트링으로 바뀐다
	public static void main(String[] args) {
		
		int ii = 77;
		float ff = 45.78f;
		
		String str = "점수 : ";
		
		System.out.println(str + ii + ", " + ff);
		System.out.println(str + ii + ',' + ff);		
		System.out.println(2 + 0 + 2 + 2 + " 년" + 2 + 0 + 2 + 2); //앞에 정수면 식계산
		System.out.println("월드컵 : " +2 + 0 + 2 + 2 ); //앞에가 스트링이면 스트링화
	}

}
