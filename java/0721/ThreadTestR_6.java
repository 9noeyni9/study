package ja_0721; //다시해보기..ㅜ

import javax.swing.JOptionPane;

class Runnable__6 implements Runnable {

	@Override
	public void run() {
		

	}
	
}
public class ThreadTestR_6 {

	public static void main(String[] args) {
		 Runnable__6 obj = new Runnable__6();
	     Thread thread = new Thread(obj);	
		 thread.start();
		 
	
		String input = JOptionPane.showInputDialog("아무값이나 입력 !! ");
	    System.out.println("입력하신 값 : " + input + " 입니다 ~~~ ");
	    
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