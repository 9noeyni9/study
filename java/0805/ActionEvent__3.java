package ja_0805;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent__3 extends Frame implements ActionListener{

	Label lbl_info;
	Panel p1,p2,p3,p4,p5;

	Button[] btn = new Button[9];
	Color[] color = {Color.red, Color.orange, Color.yellow, Color.green, Color.magenta, Color.cyan, Color.gray, new Color(235,235,255), new Color(175,175,255)};
	String[] string = {"Red","Orange","Yellow","Green","Magenta","Cyan","Gray","light Purple", "Purple"};
	
	public ActionEvent__3(String title) {
		super(title);
		p1= new Panel();
		p2= new Panel();
		p3= new Panel();
		p4= new Panel();
		p5= new Panel();
		
		p1.setLayout(new GridLayout(1,3));
		
		
		for (int i = 0; i < 9; i++)  //반복문 돌려서 버튼 7개 만든 것
		{
			btn[i] = new Button(string[i]);
			btn[i].setForeground(color[i]);
			btn[i].addActionListener(this);
			
			
			
			p4.add(btn[i]); //버튼들을 프레임에 애드
		}
		p1.add(p2);
		p1.add(p3);
		p1.add(p5);
		
		add("North",p4);
		add(p1);


		
		setSize(300,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ActionEvent__3("Action Event Test~~~");
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Button obj =(Button) e.getSource(); //형변환해서 버튼으로 받겠다

		
//		Object obj = e.getSource(); 
		
		for (int i = 0; i <9; i++) 
		{
			if (obj == btn[i]) 
			
			{
				
				p2.setBackground(color[i]);
				p3.setBackground(color[(i+1)%9]);
				p5.setBackground(color[(i+2)%9]);
//				if(i==9)
//				{
//					west.setBackground(color[0]);
//				}
//				
			}
			
		}
		System.out.println(e.getActionCommand() + " 눌렀습니다. \n");
		
	}
	
}
