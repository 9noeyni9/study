package ja_0720;

class MyThread_2 extends Thread{
	public void run() {
		
	
	
	try {
		for (int i = 0; i < 20 ; i++) {
			Thread.sleep(1000);
			System.out.println("  " + i + " 번 쓰레드  ^^^^^^^");
			
		}
		
	} catch ( InterruptedException e) {
		e.printStackTrace();
	}
	
}
}




public class ThreadTest_2 {
	public static void main(String[] args) {
		
		MyThread_2 thread_1 = new MyThread_2();
		//thread_1.start(); //스레드호출 (두가지 일 동시에 작업)
		thread_1.run(); //메소드호출 (순차적으로 하나 끝내고 뒤이어서 하나 더 실행)
		
		try {
			for (int i = 0; i < 20 ; i++) {
				Thread.sleep(1000);
				System.out.println("  " + i + " main 쓰레드  ^^^^^^^^^^^^^");
				
			}
			
		} catch ( InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
