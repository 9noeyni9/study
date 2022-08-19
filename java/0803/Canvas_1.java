package ja_0803;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

public class Canvas_1 { //Canvas : 글씨를 쓰고 그림 그리는 용도로 필요해
	public static void main(String[] args) {
		
		Frame ff = new Frame("CanvasTest ~~~~");
		
		ff.setSize(300,300);
		ff.setLayout(null);
		
		Canvas cc11 = new Canvas();
		
		cc11.setBackground(new Color(180, 230, 240 ));
		cc11.setBounds(100, 100, 150, 100);
		
		Canvas cc22 = new Canvas();
		
		cc22.setBackground(new Color(196, 205,255 ));
		cc22.setBounds(100, 210, 150, 100);		
		
		ff.add(cc11);
		ff.add(cc22);
	
		ff.setVisible(true);
	}

}
