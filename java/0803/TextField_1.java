package ja_0803;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TextField_1 extends Frame{

	public TextField_1(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		/*
		 * : TextField(텍스트 필드) 와 TextArea(텍스트 영역)
		 * 
		 * . TextField 는 한 줄로 되어 있는(한 줄 가능) 입력 컴포넌트 TextArea는 여러 줄에 (여러 줄 가능)
		 *   걸쳐 입력을 받을 수 있는 문자열 입력 컴포넌트입니다.
		 */
		
		Label lbl1 = new Label("아이디 입력 : ");
		Label lbl2 = new Label("비밀번호입력 : "); 
		
		TextField txt1 = new TextField("ID", 20);
		TextField txt2 = new TextField("korea", 20);

		//korea는 txt2 캄포넌트 위에 찍힐 초기 문자열, 
		//20은 20개의 문자를 입력 가능한 크기지정
		
		txt2.setEchoChar('*');//비밀번호 입력하면 *가 찍힌다 
		
		add(lbl1);
		add(txt1);
		add(lbl2);
		add(txt2);
		
		setSize(200,200);
		setVisible(true);
		
	
		
	
	}
	public static void main(String[] args) {
		new TextField_1("TextField Test !!!");
	}
}
