package ja_0803;//-Dfile.encoding=MS949

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Panel_2 extends Frame{  //Panel_2에서 동쪽이랑 서쪽에도 버튼 만들어주세요 >> Panel_3
	
	public Panel_2(String title) {
		super(title);
		
//		ff.setLayout(null);
		Panel panel1 = new Panel();
		
		panel1.add(new Button("북"));
		panel1.add(new Checkbox("홍길동"));
		
		Panel panel2 = new Panel();
		
		panel2.add(new Label("남"));
		panel2.add(new Button("Panel2 위의 버튼"));
		


		
		add("North", panel1);
		add("Center", new Button("버튼"));
		add("South",panel2);

		
//		add("North", panel1);
//		add("Center", new Button("버튼"));
//		add("South",panel2);	          //얘네 안 쓰면 센터에 다 쌓여서 마지막만 나와 	
		
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Panel_2("Panel Test ~~~~");
	}

}
