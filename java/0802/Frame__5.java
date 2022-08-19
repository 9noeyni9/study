package ja_0802;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Frame__5 {
	public static void main(String[] args) {
		
		Frame ff1 = new Frame("1");
		Frame ff2 = new Frame("2");
		Frame ff3 = new Frame("3");
		Frame ff4 = new Frame("4");
		Frame ff5 = new Frame("5");
		
		
		ff1.setSize(400,300);
		ff2.setSize(400,300);
		ff3.setSize(400,300);
		ff4.setSize(400,300);
		ff5.setSize(400,300);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		Dimension screenSize = tk.getScreenSize();
		
//		ff.setLocation(screenSize.width/2, screenSize.height/2);
		ff1.setLocation(screenSize.width/2-200, screenSize.height/2-150);		
		ff2.setLocation(screenSize.width/4-200, screenSize.height/4-150);
		ff3.setLocation(screenSize.width/4*3-200, screenSize.height/4-150);
		ff4.setLocation(screenSize.width/4-200, screenSize.height/4*3-150);
		ff5.setLocation(screenSize.width/4*3-200, screenSize.height/4*3-150);
		
		ff1.setBackground(new Color(166,166,166));
		ff2.setBackground(new Color(255,255,255));
		ff3.setBackground(new Color(0,0,0));
		ff4.setBackground(new Color(209,178,255));
		ff5.setBackground(new Color(63,0,153));
		
		ff1.setVisible(true);
		ff2.setVisible(true);
		ff3.setVisible(true);
		ff4.setVisible(true);
		ff5.setVisible(true);
	}

}
