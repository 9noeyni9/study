package ja_0727;

import java.util.Iterator;
import java.util.Random;

//Random 클래스 객체를 이용해
//270~530 사이의 난수 100개를 만드세요
// 난수 발생 공식  (정수화)((상한값 - 하한값 +1) * 난수발생 ) +하한값 **
public class Nansu___2
{
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int count = 0;
		
		for (int i = 0; i < 100 ; i++) 
		{
			int nan = (int)(rnd.nextDouble()*(530-269))+270;
			System.out.print(nan + " \t");
			
			count++;
			
			if(count % 10 == 0)
			{
				System.out.println();
			}
			
		}
		
	}

}
