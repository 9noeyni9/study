package ja_0808;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

public class Container_1 extends Frame implements ContainerListener, ActionListener {

	Panel panel;
	Button btn, btn_s1, btn_s2;
	
	public Container_1(String title) {
		super(title);
		
		panel = new Panel();
		panel.setSize(200,200);
		add("Center",panel);
		
		panel.addContainerListener(this);
		
		btn = new Button("컴포넌트 추가!");
		btn.addActionListener(this);
		add("South",btn);
		
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Container_1("Container Event Test");
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Button obj = (Button)e.getSource();
		
		if (e.getActionCommand().equals("컴포넌트 추가!"))  //공백 주의!!
		{
			panel.add(btn_s1= new Button("추가된 버튼"));//버튼을 만들어서 패널을 더해라
			panel.add(btn_s2= new Button("또 추가된 버튼"));
			setVisible(true);
			btn.setLabel("컴포넌트 제거!");
			
		} else {
//			panel.remove(btn_s1);
//			panel.remove(btn_s2); //버튼 하나씩만 지울 수도 있고
			panel.removeAll(); //다 지울 수도 있어
			btn.setLabel("컴포넌트 추가!"); //위에 컴포넌트 추가!랑 같아야 해 아니면 추가 안돼
			
		}
		
	}

	public void componentAdded(ContainerEvent e) {
		setTitle("컨테이너에 컴포넌트 추가!!"); //프레임 타이틀 변경!
		
	}

	public void componentRemoved(ContainerEvent e) {
		setTitle("컨테이너에서 컴포넌트 제제거 ^^^");
		
	}




	
}
