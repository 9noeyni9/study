package ja_0805;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_2 extends Frame implements ActionListener {

	TextArea txt_info;
	Button btn1, btn2, btn3;
	
	public ActionEvent_2 (String title)
	{
		super(title);
		
		txt_info = new TextArea("--버튼을 눌러 주세요 -- \n");
		btn1 = new Button("◀ 버튼");
		btn2 = new Button("▶ 버튼");
		btn3 = new Button("$ 버튼");
		
		btn1.addActionListener(this); //this : 이벤트 처리하는 액션리스너를 자기 자신이 가지고 있다
		btn2.addActionListener(this); //없으면 this 대신 new 클래스명() 써서 하면 되는데 이건 핸들러방식이야
		btn3.addActionListener(this);
		
		Panel panel = new Panel();
		panel.add(btn1);
		panel.add(btn3);
		panel.add(btn2);
		
		add("Center",txt_info);
		add("South",panel);
		
		setSize(300,200);
		setVisible(true);
		
	
	}
	
	public static void main(String[] args) {
		new ActionEvent_2("Action Event Test !!!!");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		txt_info.append(e.getActionCommand()+" 눌렀습니다.\n");//e.getActionCommand()여기에 버튼 속에 텍스트를 읽어올 수 있음
		System.out.println(e.getActionCommand()+" 눌렀습니다.");
		
	}
}
