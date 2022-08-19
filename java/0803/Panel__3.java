package ja_0803;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Panel__3 extends Frame{

	public Panel__3(String title) {
		super(title);
		Panel n,s,e,w,c;
		
		n = new Panel();
		s = new Panel();
	    e = new Panel();
		w = new Panel();
		c = new Panel();
		
		n.setBackground(new Color(180,205,255));
		s.setBackground(new Color(228,255,231));
		e.setBackground(new Color(240,237,255));
		w.setBackground(new Color(255,230,230));
		c.setBackground(new Color(255,255,255));
		
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
		new Panel__3("Panel Test");
	}
}
