package ja_0803;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TextField_3 {

	public static void main(String[] args) {
		
		Frame ff = new Frame("Login");
		
		ff.setSize(400,80);
		ff.setLayout(new FlowLayout());
		
		Label lid = new Label("ID : ", Label.RIGHT);//Label.RIGHT 우측정렬 이거 안 쓰면 기본적으로 왼쪽정렬이야
		Label lpwd = new Label("Password : ", Label.RIGHT);
		
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		
		pwd.setEchoChar('*');
		
		lid.setBackground(new Color(167,167,255));
		id.setBackground(new Color(235,235,255));
		
		ff.add(lid);
		ff.add(id);
		ff.add(lpwd);
		ff.add(pwd);
		
		ff.setVisible(true);
		
	}
}
