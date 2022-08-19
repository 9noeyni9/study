package ja_0808;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;


public class Component__1 extends Frame{

	TextArea txt;
	Button btn;
	
	public Component__1 (String title) {
		super(title);
		
	
		
		
		
		btn= new Button("화면에서 잠시 사라짐~~~~");
		btn.addActionListener(new Handler());
		
		add("South", btn);
		
		txt= new TextArea();
		add("Center", txt);
		addComponentListener(new Handler());
		
		setSize(300,300);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Component__1("Component Event Test");
		
	}
	class Handler implements ComponentListener, ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
			     setVisible(false);
				
				Thread.sleep(3000);
				
				
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			setVisible(true);
			
		}

		@Override
		public void componentResized(ComponentEvent e) {
			txt.append("컴포넌트 크기 변경 ~~~~~\n");
			
		}

		@Override
		public void componentMoved(ComponentEvent e) {
			txt.append("컴포넌트 이동동 변경 !!!!!!!!!!!!!!\n");
			
		}

		@Override
		public void componentShown(ComponentEvent e) {
			txt.append("컴포넌트가 화면에 나타남 ###################\n");
			
		}

		@Override
		public void componentHidden(ComponentEvent e) {
			txt.append("컴포넌트가 숨겨짐짐 ********************************\n");
			
		}
		
	}

}
