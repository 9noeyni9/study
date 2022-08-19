package ja_0721;

import javax.swing.JOptionPane;

class MyThreadR_7 implements Runnable{

	@Override
	public void run() {
          for (int i = 10 ; i > 0 ; i--) {
			
			System.out.println("\t\t" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}


public class ThreadTestR_7 {

	public static void main(String[] args) {
		
		MyThreadR_7 obj =new MyThreadR_7();
		Thread thread = new Thread(obj);
		
		thread.start();
		
		String input = JOptionPane.showInputDialog(" 아무 값 입력 ~~~~ ");
		System.out.println("입력한 값 : " + input + " 입니다 ~~ ");
	}
}
