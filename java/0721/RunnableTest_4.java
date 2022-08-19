package ja_0721;

import java.util.Iterator;

public class RunnableTest_4  implements Runnable {

	//int kbs = 0;  //밖에 이 값은(전역변수 =멤버변수) 선언해도 안 써도 돼
	private int[] temp;
	
	public RunnableTest_4() {
		
		temp = new int[10];
		
		for (int i = 0; i < temp.length; i++) {
		
			// 150~ 200사이 난수 발생
			temp[i] = (int)(Math.random() * (200-150 +1)+150);
			
		}
				
	}
	
	public static void main(String[] args) {
		
		//int kbs2 = 0; //위에 인트랑 같은 이름으로 쓰면 안돼 지역변수는 만들어놓고 안 쓰면 문제가 생김
		
		RunnableTest_4 obj_1 = new RunnableTest_4();
		Thread thread_1 = new Thread(obj_1);
		
		Thread thread_2 = new Thread(new RunnableTest_4());
		
		thread_1.start();
		thread_2.start();
	}

	@Override
	public void run() {
		
//		for (int start : temp) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		System.out.println("쓰레드 이름 : " + Thread.currentThread().getName());
//	
//		System.out.println("temp[] value : " + start );	  //향상된 for문
//		}
		for (int i =0; i < temp.length; i++) {
			
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		System.out.println("쓰레드 이름 : " + Thread.currentThread().getName());
	
		System.out.println("temp[] value : " + temp[i] );	
		}   //일반 for문
	}
}

