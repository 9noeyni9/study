package ja_0809;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Graphics_3_1 extends Frame {
	public Graphics_3_1(String title) {
		super(title);
		
		setSize(300,300);
		setVisible(true);
		
	}	
		public void paint(Graphics g) {
			int[] point_x1 = {10, 20, 50, 10 ,100};
			int[] point_y1 = {20, 70, 100, 150, 100};
			
			int[] point_x2 = {100, 10, 190};
			int[] point_y2 = {110, 200, 200};
			
			int[] point_x3 = {150,230,230,150}; // 점찍는 순서도 중요한듯.
			int[] point_y3 = {80, 80, 150,150};
			
			g.drawPolygon(point_x1, point_y1, 5);
			g.fillPolygon(point_x2, point_y2, 3);
			
			g.setColor(new Color(50,20,200));
			g.fillPolygon(point_x3, point_y3, 4);
		}
		

		public static void main(String[] args) {
			new Graphics_3_1("Test");
		}
}
