package ja_0805;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_3 extends Frame implements ActionListener{

	Label lbl_info;
	Button[] btn = new Button[9];
	Color[] color = {Color.red, Color.orange, Color.yellow, Color.green, Color.magenta, Color.cyan, Color.gray, new Color(235,235,255), new Color(175,175,255)};
	String[] string = {"Red","Orange","Yellow","Green","Magenta","Cyan","Gray","light Purple", "Purple"};
	
	public ActionEvent_3(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		for (int i = 0; i < 9; i++)  //반복문 돌려서 버튼 7개 만든 것
		{
			btn[i] = new Button(string[i]);
			btn[i].setForeground(color[i]);
			btn[i].addActionListener(this);
			
			add(btn[i]); //버튼들을 프레임에 애드
			
		}
		
		setSize(300,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ActionEvent_3("Action Event Test~~~");
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Button obj =(Button) e.getSource(); //형변환해서 버튼으로 받겠다
//		Object obj = e.getSource(); 
		
		for (int i = 0; i <9; i++) 
		{
			if (obj == btn[i]) 
			{
				this.setBackground(color[i]);
				
			}
			
		}
		System.out.println(e.getActionCommand() + " 눌렀습니다. \n");
		
	}
	
}
