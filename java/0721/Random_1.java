package ja_0721;

public class Random_1 {
	public static void main(String[] args) {
		
		int number = 0;
		int count = 0;
		
		//15~57사이의 난수 100개 이상 발생
		
		for (int i = 0; i < 100; i++) {
			
			number = (int)(Math.random()* (57 -15 +1) +15); // (상한가 - 하한가 +1) + 하한가  => 난수발생공식
			count ++;
			
			System.out.printf("%5d",number);
			
			if (count % 10 == 0) {
				System.out.println();
			}
			
		}
	}

}



//-35~ 50 사이의 난수 100개 발생
// number = (int)(math.random()*(50-(-35)+1))+(35);
