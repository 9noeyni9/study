package ja_0721;

import java.util.Iterator;

public class RunnableTest_3  implements Runnable {

	int delay;
	
	String title;
	
public RunnableTest_3(String title) {
	this.title = title;
	System.out.println(" " + title + " 쓰레드 시작 ~~~");
}
 public static void main(String[] args) {
	
	Thread obj_1 = new Thread(new RunnableTest_3("첫번째"));
	Thread obj_2 = new Thread(new RunnableTest_3("두두번째")); //객체를 만들 떈 스레드가 돌지 않아
	Thread obj_3 = new Thread(new RunnableTest_3("세세세번째")); //객체를 따로 만들지않고 new를 직접 실행시켜서 객체 직접 만들 수 있음,,?
	
	obj_1.setPriority(Thread.MAX_PRIORITY);
	obj_2.setPriority(Thread.MIN_PRIORITY);
	obj_3.setPriority(7);
	
	obj_1.start();
	obj_2.start();
	obj_3.start(); //이 이전엔 스레드가 아니고 이 스타트 실행해주면 스레드 돌기 시작!
	
}	
	

	@Override
	public void run() {
		for (int i = 0; i < 5 ; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("[" + i + "]" + title + " 실행중 $$$$$");
		}
		System.out.println(title + " 실행 종료 ^^^^^^");
		
	}
}
