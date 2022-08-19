package ja_0726;

public class String_15 {
	public static void main(String[] args) {
		
		String[] numbers = { "34.5", "21.5", "37.5", "45.5", "58.5" };
		String result_1 = "";
		Integer result_2 = 0;
		Double result_3 = 0.0;
		Float result_4 = 0.0f;
//		float result_4 = 0; //기본형일 때 =0허용 작은값은 큰 값에 그냥 들어가니까
//		Float result_4 = 0.0; //에러
//		Float result_4 = 0;	  //에러
				
		
		for (int i = 0; i < numbers.length; i++) {
			
			result_1 += numbers[i] + ", ";
			result_2 += (int)(Double.parseDouble(numbers[i])); //인트니까 소수점 없애고 계산(스트링이 정수화)
			result_3 += Double.parseDouble(numbers[i]); // 더블계산이니까 소수점도 같이 계산(스트링이 실수화)
			result_4 += Float.parseFloat(numbers[i]);
			
		}
		System.out.println("result_1 : " + result_1);
		System.out.println("result_2 : " + result_2);
		System.out.println("result_3 : " + result_3);
		System.out.println("result_4 : " + result_4); //printf는 소수점아래 몇자리까지 구할 때 쓰는 거 같아! ㅎㅁㅎ
	}

}
