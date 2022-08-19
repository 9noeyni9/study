package ja_0801;

import java.awt.Color;
import java.awt.Frame;

public class Frame_2 extends Frame{
		public Frame_2() {
			super("아름다운 사람~~~~~");
			
			setBackground(new Color(200,230,233)); // 이 방법으로 접근하기 내가 좋아하는 RGB값 외우기  
//			setBackground(Color.blue);	//이 방법도 있지만 쓰지말기 (가지수가 적어)		
			setLocation(400, 400);
			setSize(300,300);
			setVisible(true);
			
		}
		
       public static void main(String[] args) {
		new Frame_2();
	}
}

