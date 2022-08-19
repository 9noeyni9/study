package ja_0721;

class MyThreadTest_3 extends Thread{
	
	public MyThreadTest_3(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		try {
			for (int i = 0; i < 5 ; i++) {
				
				Thread.sleep(1000);
				System.out.println(" " + i + " 번 " + getName() + " : 스레드 ");
				                                     
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}



public class MyThread_3 {

	public static void main(String[] args) {
		
		MyThreadTest_3 obj_1 = new MyThreadTest_3("첫번째");
		MyThreadTest_3 obj_2 = new MyThreadTest_3("두두번째");
		MyThreadTest_3 obj_3 = new MyThreadTest_3("세세세번째");
		
		obj_1.start();
		obj_2.start();
		obj_3.start();   //스레드호출
		
//		obj_1.run();
//		obj_2.run();
//		obj_3.run();   //메소드 호출
	}
}
