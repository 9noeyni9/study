package ja_0805;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_1 extends Frame implements ActionListener{ //ActionEvent_1가 

	Label lbl_info;
	Button btn1, btn2, btn3;
	
	public ActionEvent_1(String title) {
		
		super(title);
		
		lbl_info = new Label("버튼을 눌러 주세요");
		btn1= new Button("◀ Button");		
		btn2= new Button("▶ Button");
		btn3 = new Button("◇ Button");
				
		
		btn1.addActionListener(this); //여기서 이벤트가 발생하면 ActionPerformed가 실행된다
		btn2.addActionListener(this);// this : ActionEvent_1가 ActionListener를 갖고 있다
		btn3.addActionListener(this);
		
		Panel panel = new Panel();
		
		panel.add(btn1);
		panel.add(btn3);
		panel.add(btn2);

		
		
		add("Center",panel);
		add("South",lbl_info);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ActionEvent_1("ActionEvent Test ~~~ ");
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource(); //이벤트가 처음 발생한 객체
		
		if ((Button) obj == btn1) 
		{
			
			lbl_info.setText("왼쪽 버튼이 눌렸습니다.");//lbl_info에 "왼쪽 버튼이 눌렸습니다."거 출력해
			System.out.println("왼쪽 버튼이 눌렸습니다.");
			
		} else if((Button) obj == btn2)
		{
			lbl_info.setText("오른쪽 버튼이 눌렸습니다.");
			System.out.println("오른쪽 버튼이 눌렸습니다.");
		}
		else 
		{
		lbl_info.setText("가운데 버튼이 눌렸습니다.");
		System.out.println("가운데 버튼이 눌렸습니다."); //Runconfiguration >> common>>others>>EUC_KR치면 콘솔창 한글 안 꺠져
		}
	}

}
