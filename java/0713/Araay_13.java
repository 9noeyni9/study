package ja_0713;

public class Araay_13 {
	
	public static void main(String[] args) {
		// 주사위를 수십만번 돌리면 1~6까지 고르게 분포함 (확률분포~~)
		final int SIZE =6; //여기서 사이즈가 대문자인 건 파이널을 쓸 때는 변수는 상수 6만 써도 되는데 가독성을 높이려고 변수로 설정하는 것
		                   // 여기서 6자리만 바꿔주면 원하는 값 알 수 있어 예를 들어 동전 앞면 뒷면 알고 싶으면 6 >>2로 바꿔주면 돼
		int[] freq = new int[SIZE];
		
		for (int i = 0; i < 10000 ; i++) {
			
			++freq[(int)(Math.random()*SIZE)];  //여기서는 0~5까지 나오고 freq가 누적시키는 일을 함(0~5가 각각 몇 번 나오는지..)
			// freq[(int)(Math.random()*SIZE)]++;도 가능
		}
		
		System.out.println("==============================");
		System.out.println("   면              빈도수       ");
		System.out.println("==============================");
		
		for (int i = 0; i < SIZE ; i++) {
			
			System.out.println("   "+ (i+1) + "    :         "+freq[i] +"");
		}
	}

}  //난수 사용 (확률 찾을 때)
