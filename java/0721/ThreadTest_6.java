package ja_0721;

import javax.swing.JOptionPane;

public class ThreadTest_6 {

	public static void main(String[] args) {// throws InterruptedException { //try~catch 로 시도하면 throws InterruptedException 지워
		
		String input = JOptionPane.showInputDialog("아무값이나 입력 !! ");
	    System.out.println("입력하신 값 : " + input + " 입니다 ~~~ ");
		
	    for (int i = 10 ; i > 0 ; i--) {
			
	    	System.out.println("\t\t" + i);
	    	
	    	try {
	    		Thread.sleep(1000);
	    	} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    	
	    	//Thread.sleep(1000);
	    	
   
		}
		
		
	}
}
