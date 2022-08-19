package ja_0805;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import ja_0803.ScrollPane_1;

public class Adjustment_1 extends Frame implements AdjustmentListener{

	Scrollbar r,g,b;
	Panel panel;
	
	public Adjustment_1(String title) {
		super(title);
		
		r= new Scrollbar(Scrollbar.HORIZONTAL, 0,20 ,0,275);
		g= new Scrollbar(Scrollbar.HORIZONTAL, 0,20 ,0,275);
		b= new Scrollbar(Scrollbar.HORIZONTAL, 0,20, 0,275);
		
		r.addAdjustmentListener(this);
		g.addAdjustmentListener(this);
		b.addAdjustmentListener(this);
		
		panel = new Panel();
		
		panel.add(r);
		panel.add(g);
		panel.add(b);
		
		add("Center",panel);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Adjustment_1("Adjustment Event Test ###");
	}
 	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {


 		int red, green, blue;
 		
 		red = r.getValue(); //r의 값을 가져다가 red에 담아라
 		green = g.getValue();
 		blue = b.getValue();
 		
 		System.out.println("red : "+ red + ", green : " +green + ", blue" +blue);
 		panel.setBackground(new Color(red,green,blue));
 		
		
	}

}
