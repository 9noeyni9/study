package ja_0801;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Button_1 extends Frame {
	
	Button btn1, btn2, btn3;
	
	public Button_1(String str) {
		super(str);
		setLayout(new FlowLayout()); //FlowLayout() 얘는 창의 크기에 따라서 배치가 달라짐
		
		btn1 = new Button("가위");
		btn2 = new Button(" 바위 ");
		btn3 = new Button("   보   ");   
		/* 
		 * -Dfile.encoding=MS949 한글 나오게 해주는....뭐 그런건가봐
		 * RunConfigyrations >> Arguments>>VM Argument에 입력해주기
		 */
		
		add(btn1); //프레임은 다른 컴포넌트를 담을 수 있는 컨테이너
		add(btn2);
		add(btn3);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Button_1("가위바위보");
	}

}
