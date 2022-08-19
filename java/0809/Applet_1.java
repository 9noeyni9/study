package ja_0809;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

//Applet은 main메소드 없이도 실행 가능
// eclipse 버전이 안맞아서 실행이 안됨. 코드만 가지고 있자.
public class Applet_1   extends Applet  
{
	public void paint(Graphics g) {
		for (int i = 0; i < 400; i++) {
			g.setColor(new Color((int)(Math.random()*256),
				              	(int)(Math.random()*256),
					            (int)(Math.random()*256)));
			g.drawOval(10, 10, i, i);
			g.drawOval(400-i, 30, i, i);
		}
		
	}
	
}
