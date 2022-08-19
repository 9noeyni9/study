package ja_0803;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TextField__1 extends Frame{

	public TextField__1(String str) {
		super(str);
		setLayout(new FlowLayout());
		
		Label lbl1 = new Label("아이디 입력 : ");
		Label lbl2 = new Label("비밀번호 입력 : ");
		
		TextField txt1 = new TextField("ID",20);
		TextField txt2 = new TextField("Password",20);
		
		txt2.setEchoChar('*');
		
		add(lbl1);
		add(txt1);
		add(lbl2);
		add(txt2);
		
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextField__1("TextField 연습!");
	}
}
