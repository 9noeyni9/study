package ja_0805;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.logging.Handler;

//public class ItemEvent_2 extends Frame implements ItemListener { //
public class ItemEvent_2 extends Frame {

	CheckboxGroup group;
	Checkbox cb1,cb2,cb3;
	
	public ItemEvent_2(String title) {
		super(title);
		
		group = new CheckboxGroup();
		cb1 = new Checkbox("red", group, false);
		cb2 = new Checkbox("green", group, true);
		cb3 = new Checkbox("blue", group, false);
		
		cb1.addItemListener(new Handler());
		cb2.addItemListener(new Handler());
		cb3.addItemListener(new Handler());
		
//		cb1.addItemListener(this);
//		cb2.addItemListener(this);
//		cb3.addItemListener(this);
		
		setLayout(new FlowLayout());
		add(cb1);
		add(cb2);
		add(cb3);

		setBackground(Color.gray);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ItemEvent_2("Radio CheckBox TEst###");
		
	}
	

	class Handler implements ItemListener{ //
		


		@Override
		public void itemStateChanged(ItemEvent e) {
			Checkbox cb = (Checkbox)e.getSource();
//			Object cb = e.getSource();
			
			String color = cb.getLabel();
			
			if (color.equals("red")) 
			{
				setBackground(Color.red);
			}else if (color.equals("green")) 
			{
				setBackground(Color.green);
			}else {
				setBackground(Color.blue);
			}
		}
			
		}
	}

