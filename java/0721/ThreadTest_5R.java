package ja_0721;



public class ThreadTest_5R {
	static long startTime = 0;
	public static void main(String[] args) {
		
	     MyThreadR_5 obj = new MyThreadR_5();
	     Thread thread = new Thread(obj);	
		 thread.start();
		
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 500 ; i++) {
			
			System.out.print("--");
		}
		System.out.println("\n 소요시간 11 : " + (System.currentTimeMillis() - startTime) +"\n");
	}

}


class MyThreadR_5 implements Runnable {
	
	public void run() {
		for (int i = 0; i < 500 ; i++) {
			
			System.out.print("||");
		}
		System.out.println("\n 소요시간 22 : " + (System.currentTimeMillis() - ThreadTest_5R.startTime)+ "\n");
	}
	
}