package ja_0803;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Panel_3 extends Frame{
	
	public Panel_3(String title) {
		super(title);
		Panel n,s,e,w,c;
		
		 n = new Panel();
		 s = new Panel();
		 e = new Panel();
		 w = new Panel();
		 c = new Panel();
	
		
		n.setBackground(new Color(211,240,255));
		s.setBackground(new Color(217,229,255));
		e.setBackground(new Color(242,217,255));
		w.setBackground(new Color(232,217,255));
		c.setBackground(new Color(255,217,250));
		
		n.add(new Button("북"));
		s.add(new Button("남"));
		e.add(new Button("동"));
		w.add(new Button("서"));
		c.add(new Button("중심"));
		
		add("North",n);
		add("South",s);
		add("East",e);
		add("West",w);
		add("Center",c);
		
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Panel_3("Panel Test~~~~");
	}
	

}
