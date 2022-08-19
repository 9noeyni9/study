package ja_0802;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

public class Login_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("Login");
		
		ff.setSize(300,200);
		ff.setLayout(null); //Layout이 null일 경우 따로 좌표값을 정해줘야한다...
		/*
		 * .Label(레이블)
		 *  : 레이블은 문자열을 출력하는 컴포넌트입니다.
		 *    보통 화면에서 다른 컴포넌트 용도를 알리기 위한
		 *    목적으로 사용됩니다.
		 */
		
		Label id = new Label("ID : ");
		id.setBounds(100, 100, 30, 18); //setLocation() + setSize() //100,100의 위치에 30,18사이즈 값 만들어줘
		
		Label pwd = new Label("password : ");
		pwd.setBounds(100, 120, 100, 18);
		
		Label add = new Label("address : ");
		add.setBounds(100, 140, 100, 18);
		add.setBounds(100, 140, 100, 18);
		add.setForeground(new Color(0,87,102));
		
		ff.add(id);
		ff.add(pwd);
		ff.add(add);
		
		ff.setVisible(true);
		
		
	   
		
		
		
		
	}

}
