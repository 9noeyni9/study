
package ja_0727;

import java.util.Random;

public class Nansu__2 {
	public static void main(String[] args) {
		
		//Random 클래스 객체를 이용해
		//270~530 사이의 난수 100개를 만드세요
		// 난수 발생 공식  (정수화)((상한값 - 하한값 +1) * 난수발생 ) +하한값 **
		
		Random rnd = new Random(System.currentTimeMillis()); //항상 새로운 난수로 바꿔준다.,?
		int count = 0;

		for (int i = 0; i < 100 ; i++)
		{
			int nan = (int)(rnd.nextDouble()*(530-269))+270;  //nextDouble() 이 이유를 생각해 nextInt값 적용하면 안돼,,,왜ㅜ,,, 
			System.out.print(nan + "\t");
			
			count ++;
			
			if (count % 10 == 0)
			{
				System.out.println();				
			}			
		}
		
	
	
			
//			for (int i = 0; i < 100 ; i++)
//			{
//				System.out.print(rnd.nextInt(yy-xx+1)+xx+"\t");
//				count++;
//				
//				if (count % 10 == 0)
//				{
//					System.out.println();				
//				}
//				
//			}
			}
		
	}


