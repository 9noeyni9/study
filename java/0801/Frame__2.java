package ja_0801;

import java.awt.Color;
import java.awt.Frame;

public class Frame__2 extends Frame {

	public Frame__2() {
		super("푸르게 푸르게~~~");
		
		setBackground(new Color(0,85,0));
		setLocation(400, 400);
		setSize(300,300);
		setVisible(getFocusTraversalKeysEnabled());
		
	}
	public static void main(String[] args) {
		new Frame__2();
	}
}
