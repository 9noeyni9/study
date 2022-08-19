package ja_0803;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

public class TextField_2 extends Frame{

	public TextField_2(String title) {
		super(title);
		setLayout(new FlowLayout()); //FlowLayout을 쓰면 창 사이즈 늘리면 위 아래가 아니라 옆으로 붙어 실행시켜서 확인해
		// 얘 안 쓰면 BoldLayout 겹쳐져서 마지막만 나와
		
		TextArea txt1 = new TextArea(10, 30); //한번에 10줄까지 보이고 한번에 30글자까지 가능
		TextField txt2 = new TextField("안녕하세요",20);
		
		txt1.setText("문자열 입력 ~~");
		txt1.setBackground(new Color(230,180,255));
		txt1.setFont(new Font("궁서체", Font.ITALIC | Font.BOLD,17));
		txt1.setForeground(new Color(255,255,255));

		txt2.setEchoChar('#');
		txt2.setForeground(new Color(155,136,255));
		
		add(txt1);
		add(txt2);
		
		setSize(300,330);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextField_2("TextArea Test ~~~");
	}
}
