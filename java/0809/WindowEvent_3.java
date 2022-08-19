package ja_0809;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEvent_3  extends Frame
{
	Frame[] win = new Frame[7];
	
	String[] str = {"빨강", "주황","파랑","노랑","초록","핑크","검정"};
	Color[] color = {Color.red,Color.orange,Color.blue, Color.yellow,
			         Color.green,Color.pink, Color.black};
	
	public WindowEvent_3(String title) {
		super(title);
		int i;
		
		for (i = 0; i < 7; i++) {
			win[i] = new Frame();
			win[i].setBackground(color[i]);
			win[i].setLocation(i*80,i*80);
			win[i].setSize(100,100);
			win[i].addWindowListener(new WindowHandler());
			win[i].setVisible(true);
		}
	}

	class WindowHandler  extends WindowAdapter
	{
		public void windowClosing(WindowEvent e) {
			String msg = "";
			Window obj = (Window)e.getSource();
					
			for (int i = 0; i < 7; i++) {
				if (obj == win[i]) {
					msg = str[i];
					win[i].dispose();  //닫기 누른 부분만 종료
				   }
			 }
			System.out.println("닫힌 윈도우 색 : "+msg);
		}
		
		public void windowIconified(WindowEvent e) {
			System.out.println("윈도우 닫기 닫기");
			System.exit(0);  // 프로그램 완전 다 종료
		}
		
	}
 
	public static void main(String[] args) 
	{
		new WindowEvent_3("Window Evnet Test");
	}
	
}
