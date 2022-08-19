package ja_0801;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.util.Iterator;

public class Button_3 extends Frame {
	
	Label[] lbl = new Label[50];
	Button[] btn = new Button[50];
	
	public Button_3(String str)
	{
		super(str);
		setLayout(new FlowLayout());
		
		for (int i = 0; i < 50 ; i++)
		{
			
			lbl[i] = new Label(i + "레이블 ");
			btn[i] = new Button(i + " 버튼 ");
			
			btn[i].setBackground(new Color((int)(Math.random()*(255-180+1)+180), //계열색을 구하려면 그 계열색에 위치는 256에 가깝게 만들어지고 나머지 자리는 0에 가깝게 만들어주자
					                       (int)(Math.random()*70),
					                       (int)(Math.random()*70)));
			
			lbl[i].setBackground(new Color((int)(Math.random()*70),
                                           (int)(Math.random()*70),
                                           (int)(Math.random()*(255-180+1)+180)));		//난수발생 공식의 효과로 계열색을 배정할 수 있다.	
			
			add(lbl[i]);
			add(btn[i]);
		}
		
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Button_3("배열 레이블, 버튼 만들기");
	}

}
