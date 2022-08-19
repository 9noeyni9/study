package ja_0712;

public class Lotto_1023 {
	public static void main(String[] args) {
		
		
		int[] ball = new int[45];
		
		for (int i = 0; i < ball.length; i++) {
			
			ball[i] = i+1; //여기서는 1~45번 공이 순서대로 있어
			
		}
		
		int temp = 0;
		int j =0;
		
		for (int i = 0; i<300 ; i++) {
			 j =(int)(Math.random() * 45);
			 
			 temp = ball[0];
			 ball[0] = ball[j];
			 ball[j] = temp;    //45개 공이 300번 교차한다 생각  => 배열이 달라짐 => 무작위로 섞여졌어
		}
		
		System.out.println();
		System.out.println("\n  1023차 로또 당첨번호 \n");
		
		for (int i = 0; i < 5 ; i++) {
			System.out.println(ball[i] + "\t"); //하나씩 뽑는 게 아니라 한번에 여섯개 공 뽑는다 생각해
			
		}
		
		System.out.println();
		System.out.println("/n 보너스 당첨 번호\n");
		System.out.println("\t" + ball[5]+ "번 입니다.\n"); 
	}

}
