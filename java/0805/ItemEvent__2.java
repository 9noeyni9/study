package ja_0805;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import ja_0805.ItemEvent_2.Handler;

public class ItemEvent__2  extends Frame implements ItemListener{ //내부에 클래스를 갖는 방식

	CheckboxGroup group;
	Checkbox cb1,cb2,cb3;
	
	public ItemEvent__2(String title) {
		super(title);
		
		group = new CheckboxGroup();
		cb1 = new Checkbox("red", group, false);
		cb2 = new Checkbox("green", group, true);
		cb3 = new Checkbox("blue", group, false);
		
//		cb1.addItemListener(new Handler());
//		cb2.addItemListener(new Handler());
//		cb3.addItemListener(new Handler());
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		
		setLayout(new FlowLayout());
		add(cb1);
		add(cb2);
		add(cb3);

		setBackground(Color.gray);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ItemEvent__2("Radio CheckBox TEst###");
		
	}
	

//	class Handler implements ItemListener{ //
		


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
