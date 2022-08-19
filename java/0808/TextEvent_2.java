package ja_0808;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
	
public class TextEvent_2 extends Frame{
 TextArea txt_area;
 TextField txt;
	
	public TextEvent_2 (String title) {
		super(title);
		
		addWindowListener(new Handler_2());
		
		txt_area = new TextArea();
		txt= new TextField("",20);
		
		txt.addTextListener(new Handler());
		txt.addActionListener(new Handler());
		
		txt_area.setFocusable(false); //포커스 둘 수 없고(false 니까..)
		
		txt_area.setEditable(false); //접근도 불가능(false 니까..)
		
		add("North", new Label(" 글자를 입력하고 Enter"));
		add("Center", txt_area);
		add("South", txt);
		
		setSize(300,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new TextEvent_2("Text Event Test 22");
	}
	
	class Handler_2 extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.out.println("윈도우 닫기");
			System.exit(0);//프로그램 종료 //0을 써도 되고 다른 숫자를 써도 상관없어
		}
	}
	class Handler implements ActionListener, TextListener{
		
		@Override
		public void actionPerformed(ActionEvent e) { //엔터키를 치면 호출되는 것 : ActionEvent
			txt.setText("");
			txt_area.append("\n");
			
		}
		

		@Override
		public void textValueChanged(TextEvent e) {//글씨를 쓰는 순간
			try {
				int i = txt.getText().length();
				if (i==0) 
				{
					return;
				}
				txt_area.append(" " + txt.getText().charAt(i-1));
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
			
		}

	
	}
}
