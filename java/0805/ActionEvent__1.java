package ja_0805;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent__1 extends Frame {

	
	Label lbl_info;
	Button btn1,btn2,btn3;
	
	public ActionEvent__1(String title) {
		super(title);
		
		lbl_info = new Label("버튼을 눌러주세요");
		btn1= new Button("◀버튼");
		btn2= new Button("●버튼");
		btn3= new Button("▶버튼");

		btn1.addActionListener(new Handler());
		btn2.addActionListener(new Handler());
		btn3.addActionListener(new Handler());
		
		Panel panel = new Panel();
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		add("Center",panel);
		add("South",lbl_info);
		
		setSize(300,300);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new ActionEvent__1("ActionEvent Test!!!!!!");
	}
	class Handler implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		if ((Button)obj == btn1) {
			lbl_info.setText("왼쪽 버튼이 눌렸습니다");
			System.out.println("왼쪽 버튼이 눌렸습니다.");
		}
		else if ((Button)obj == btn3) {
			lbl_info.setText("오른쪽 버튼이 눌렸습니다.");
			System.out.println("오른쪽 버튼이 눌렸습니다.");
		}else
		{
			lbl_info.setText("가운데 버튼이 눌렸습니다");
			System.out.println("가운데 버튼이 눌렸습니다.");
		}
		
	}//왼쪽 가운데 오른쪽에 각각 버튼을 만들어주세요
	
	}

}
