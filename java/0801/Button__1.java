package ja_0801;


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;  //ctrl + shift + O =>한꺼번에 임포트

public class Button__1 {
	public static void main(String[] args) {
		
		Frame bb = new Frame("가위바위보");  // 객체 만들어주기
		Button btn1, btn2, btn3;		
		
		
		bb.setLayout(new FlowLayout());		

		
		btn1 = new Button("가위");
		btn2 = new Button("  바위  ");
		btn3 = new Button("    보     ");
		
		bb.add(btn1);
		bb.add(btn2);
		bb.add(btn3);
		
		bb.setSize(300,300);
		bb.setVisible(true);
	}

}
