package ja_0805;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent___3 extends Frame{

	Label lbl_info;
	Button[] btn = new Button[9];
	Color[] color = {Color.red, Color.orange, Color.yellow, Color.green,Color.magenta,Color.cyan, Color.gray,new Color(235,235,255),new Color(168,168,255)};
	String[] string = {"Red","Orange","Yellow","Green","Magenta","Cyan","Gray","LightPurple","purple"};
	Panel panel1,panel2,panel3,panel4;
	
	
	public ActionEvent___3(String title) {
		super(title);
		panel1 = new Panel();
		panel2 = new Panel();
		panel3 = new Panel();
		panel4 = new Panel();
		panel1.setLayout(new GridLayout(1,2));
		
		for (int i = 0;  i < 9; i++)
		{
			btn[i]= new Button(string[i]);
			btn[i].setForeground(color[i]);
			btn[i].addActionListener(new Handler());
			
			panel4.add(btn[i]);	
		
			
			
		}
		
	
		panel1.add(panel2);
		panel1.add(panel3);
		add(panel4);
		
		add("North",panel4);
		add(panel1);

		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ActionEvent___3(" 연습~~~~~");
	}
	
	class Handler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Button obj = (Button)e.getSource();
			
			for (int i = 0; i < 9; i++) {
				if (obj == btn[i]) {
					panel2.setBackground(color[i]);
					panel3.setBackground(color[(i+1)%9]);
					
				}
				
			}
			System.out.println(e.getActionCommand() + " 눌렀습니다. \n");
		}
		
	}
}
