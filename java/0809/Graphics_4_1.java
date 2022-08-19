package ja_0809;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Graphics_4_1   extends Frame{

	public Graphics_4_1(String title) {
		super(title);
		
		XCanvas_2 grr = new XCanvas_2();
		
		grr.setSize(300,300);
		
		add("Center",grr);
		
		setSize(350,350);
		setVisible(true);
		
		//원점에서 10씩 떨어져있는 점들의 모임
		
//		150,140   140,150 /   150,160    160,150 
//		
//           
//			x = 150+-10
//			y = 150+-10
//		
		
		
		
		
	}
	public static void main(String[] args) {
		new Graphics_4_1("Graphics Test");
	}
}
class XCanvas_2  extends Canvas{
	
	public void paint(Graphics g){    //Frame 크기를 움직이면 호출된다.
		
		
		for (int i = 0; i < 300; i++) {
			
			int red = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			
			int x1 = (int)(Math.random()*300);
			int y1 = (int)(Math.random()*300);

			int x = (int)(Math.random()*(170-150+1)+150);
			int y = (int)(Math.random()*(150-130+1)+130);
			if (x>y) {
				g.drawLine(x, y, x1, y1);
				
			}
			
			
			g.setColor(new Color(red,green,blue));
			
		}
	}
	}
