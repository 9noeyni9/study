package ja_0721; //아직 안 끝남 ㅜ 다시 해보기,,,

class MyThreadR_8 implements Runnable {
	
	String name;
	public MyThreadR_8(String name) {
	this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
		
			System.out.println( name  + " 스레드 ");
			
		}
	   
		}		
	}

public class ThreadTestR_8 {

	public static void main(String[] args) {
		
		MyThreadR_8 obj_1 = new MyThreadR_8("10번");
		MyThreadR_8 obj_2 = new MyThreadR_8("  5번 ");
		MyThreadR_8 obj_3 = new MyThreadR_8("     1번");
		
		Thread thread_1 = new Thread(obj_1);
		Thread thread_2 = new Thread(obj_2);
		Thread thread_3 = new Thread(obj_3);
		
		thread_1.setPriority(7);
		thread_2.setPriority(Thread.MIN_PRIORITY);
		thread_3.setPriority(Thread.NORM_PRIORITY);
		
		System.out.println("a : " + thread_1.getPriority());
	    System.out.println("b : " + thread_2.getPriority());
	    System.out.println("c : " + thread_3.getPriority());
	    
		
		
		
		thread_1.start();
		thread_2.start();
		thread_3.start();
	}
}
