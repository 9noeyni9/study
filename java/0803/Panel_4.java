package ja_0803;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class Panel_4 extends Frame {

	public Panel_4(String title) {
		super(title);
		
		Panel panel1 = new Panel();
		panel1.setLayout(new GridLayout(4,2)); //4행 2열의 격자무늬!
		
		
		panel1.setBackground(new Color(180,150,229));
		panel1.add(new Label(""));
		panel1.add(new Checkbox("리눅스"));		
		panel1.add(new Label(""));
		panel1.add(new Checkbox("윈도우10"));
		panel1.add(new Label(""));
		panel1.add(new Checkbox("리눅스"));
		panel1.add(new Label(""));
		panel1.add(new Checkbox("윈도우10"));
		
		Panel panel2 = new Panel();
		Label lbl1 = new Label("환경 설정");
		panel2.add(lbl1); //방법1
        lbl1.setForeground(new Color(255,167,167));		
		panel2.setBackground(new Color(200,200,255));
//		panel2.add(new Label("환경설정", Label.CENTER));
		panel2.add(new Label("환경설정", Label.CENTER)).setForeground(new Color(255,167,167)); //방법2

		panel2.add(new Button("불러오기"));
		panel2.add(new Button(" 저 장 "));
		panel2.add(new Button("다른 이름으로 저장"));
		
		add("North", panel1);
		add("Center", panel2);
		
		setSize(450,180);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Panel_4("Panel Test ~~~~");
	}
}
