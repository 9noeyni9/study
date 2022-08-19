package ja_0721;

class Thread_8 extends Thread
{
	public Thread_8(String name) {
		super(name);
	}
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(getName() + " 스레드 ");
		}
	}
}

public class ThreadTest_8 {
	public static void main(String[] args) {
		
		
		Thread_8 obj_1 = new Thread_8("10 번");
		Thread_8 obj_2 = new Thread_8("  5 번");
		Thread_8 obj_3 = new Thread_8("     1 번");
		Thread_8 obj_4 = new Thread_8("     7 번");
		
//		obj_1.setPriority(Thread.MAX_PRIORITY);   //ctrl + 마우스 누르면 설명 나와 //MAX_PRIORITY : 10
		obj_1.setPriority(7); //값 부여는 1~ 10 사이에서 해주면 돼
		obj_2.setPriority(Thread.NORM_PRIORITY); // 5
		obj_3.setPriority(Thread.MIN_PRIORITY); // 1
		

//		obj_1.setPriority(10);
//		obj_2.setPriority(5);
//		obj_3.setPriority(1);	
		
	    System.out.println("a : " + obj_1.getPriority());
	    System.out.println("b : " + obj_2.getPriority());
	    System.out.println("c : " + obj_3.getPriority());
	    System.out.println("d : " + obj_4.getPriority());  //우선순위 부여 안 한 obj_4는 NORM인 기본값 5로 나와
		
		obj_3.start();
		obj_2.start();
		obj_1.start();
		obj_4.start();
	}
}
