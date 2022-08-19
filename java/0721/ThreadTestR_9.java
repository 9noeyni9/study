package ja_0721;

class ThreadR_9 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 500 ; i++) {
			System.out.print("--");
			for (int j = 0; j < 10000000; j++); 
		}
		
	}
	
}

class ThreadR_9_2 implements Runnable{

	@Override
	public void run() {
		
		for (int i = 0; i < 500 ; i++) {
			System.out.print("|");
			for(int j = 0; j < 10000000 ; j++);
		}

		
	}
	
}
public class ThreadTestR_9 {

	public static void main(String[] args) {
		
		ThreadR_9 obj_1 = new ThreadR_9();
		Thread thread_1 = new Thread(obj_1);
		
		ThreadR_9_2 obj_2 = new ThreadR_9_2();
		Thread thread_2 = new Thread(obj_2);
		
		thread_1.setPriority(8);
		thread_2.setPriority(2);
		
		thread_1.start();
		thread_2.start();
		
		
	}
}
