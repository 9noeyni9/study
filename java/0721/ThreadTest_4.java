package ja_0721;

import java.util.Iterator;

public class ThreadTest_4 {
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 500 ; i++) {
			
			System.out.print("--");
			
		}
		
		System.out.println("\n 소요시간 11 : " +(System.currentTimeMillis() - startTime) + " \n");
		
		for (int i = 0; i < 500 ; i++) {
			
			System.out.print("||");
		}
		
		System.out.println("\n 소요시간 22 : " + (System.currentTimeMillis() - startTime));	
		
		
	}

}
