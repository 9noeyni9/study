package ja_0721;

public class ThreadTest_10 {

	public static void main(String[] args) {
		
		Thread_10_1  obj_1 = new Thread_10_1();
		Thread_10_2  obj_2 = new Thread_10_2();
		Thread_10_3  obj_3 = new Thread_10_3();
		
		obj_1.start();
		
		try {
			obj_1.join();   //join을 사용하면 해당 스레드가 종료될 때 까지 기다리고 다음 스레드로 넘어갑니다.
			                // 그니까 지금은 obj_1 이 다 실행되고 다음 스레드로 넘어가서 obj_2과 obj_3이 짬뽕되서 나옴
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		obj_2.start();
		obj_3.start();
		
	}
}

class Thread_10_1 extends Thread
{
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
	}
}

class Thread_10_2 extends Thread
{
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}
	}
}

class Thread_10_3 extends Thread
{
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("#");
		}
	}
}
