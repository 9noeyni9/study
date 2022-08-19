package ja_0803;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class TextField_4 extends Frame {
	public TextField_4(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		
		TextArea txt1 = new TextArea("간단한 메모를 입력"); //사이즈 설정 안 했을 떄 열은 폼 크기에 맞게 설정된다
		TextArea txt2 = new TextArea(10,20);
		TextArea txt3 = new TextArea("문자열, 문자열,,,", 5, 30);
		
		add(txt1);
		add(txt2);
		add(txt3);
		
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextField_4("텍스트에어이러 테스트 ~~~~");
	}

	
	
}
