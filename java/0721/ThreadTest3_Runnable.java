package ja_0721;

 class Runnable__1 implements Runnable {
	String name;
	 public Runnable__1(String name) {
	this.name = name;
	 }
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();				
			}
			System.out.println(" " +i + " 번 " + name + " : 스레드 " );
			
			
			
		}
	}
}



public class ThreadTest3_Runnable {

	public static void main(String[] args) {
		
		Runnable__1 obj_1 = new Runnable__1("첫번째");
		Runnable__1 obj_2 = new Runnable__1(" 두두번째");
		Runnable__1 obj_3 = new Runnable__1("  세세세번째");
		Thread thread_1  = new Thread(obj_1);   //**얘가 Runnable 인터페이스의 핵심이야
		Thread thread_2  = new Thread(obj_2);   //**얘가 Runnable 인터페이스의 핵심이야
		Thread thread_3  = new Thread(obj_3);   //**얘가 Runnable 인터페이스의 핵심이야

	   
		thread_1.start();		
		thread_2.start();		
		thread_3.start();		
	}
}
