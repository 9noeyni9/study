package ja_0805;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_4 extends Frame implements ActionListener{

	TextField txt_1, txt_2, txt_3;
	public ActionEvent_4(String str) {
		
		super(str);
		
		txt_1= new TextField("문자를 입력하세요");
		txt_2 = new TextField("...",20);
		txt_3 = new TextField("3번 ,,,",20);
		
		txt_1.addActionListener(this);
		txt_2.addActionListener(this);
		txt_3.addActionListener(this);
		
		add("North", txt_1);
		add("Center", txt_2);
		add("South", txt_3);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		new ActionEvent_4("Action Event test !!!");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		TextField obj = (TextField) e.getSource();
		
		if (obj == txt_1)		
		{
			txt_2.setText(txt_1.getText()); // txt_1.getText() : txt_1에 문자를 입력할 거고 txt_2.setText(),txt_3.setText() : 그 문자를 2랑 3에도 출력하겠다
			txt_3.setText(txt_1.getText());
			txt_2.setFocusable(true); //true가 맨 앞에 와서 선점해야해 아니면 회전이 안돼! //enter키를 누르는 순간 ActionEvent가 실행된다
			txt_1.setFocusable(false);
			txt_3.setFocusable(false);
			
		}else if (obj == txt_2)		
		{
			txt_1.setText(txt_2.getText());
			txt_3.setText(txt_2.getText());
			txt_3.setFocusable(true);
			txt_1.setFocusable(false);
			txt_2.setFocusable(false);
			
		}
		else
		{
			txt_1.setText(txt_3.getText());
			txt_2.setText(txt_3.getText());
			txt_1.setFocusable(true);
			txt_2.setFocusable(false);
			txt_3.setFocusable(false);
		}
		
	}
}
