package ja_0802;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Panel_1 {

	public static void main(String[] args) {
		
		Frame ff = new Frame("Panel Test ~~");
		
		ff.setSize(600,500);
		ff.setLayout(null);//Layout Manager 을 사용하지 않는다.
	
		Panel p1 = new Panel();
		p1.setBackground(new Color(209,178,255) );
		p1.setSize(150, 100);
		p1.setLocation(50,50);
		
		
		Panel p2 = new Panel();
		p2.setBackground(new Color(165,102,255) );
		p2.setSize(150, 100);
		p2.setLocation(50,170);
		
		Panel p3 = new Panel();
		p3.setBackground(new Color(63,0,153) );
		p3.setSize(150, 100);
		p3.setLocation(50,290);	
		
		Panel p4 = new Panel();
		p4.setBackground(new Color(209,200,255));
		p4.setSize(150,100);
		p4.setLocation(250,170);
		
		Button ok = new Button("OK~~");
		Label cancel = new Label("CANCEL", Label.CENTER);
		cancel.setBackground(new Color(255,255,255));
		
		p4.add(cancel); 
		p1.add(ok); 
//		p4.add(ok); //이 방법은 겹쳐져서 나와 p4만 나와
		p4.add(new Button("OK~~")); //new Button()을 사용했을 때는 1&4 둘 다 잘 나오는데
		p2.add(new Button("나 버튼"));
		p3.add(new Button("1번"));
		p3.add(new Button("2번"));
		p3.add(new Button("3번")); //버튼을 패널안에 넣는 것
		
		ff.add(p1);
		ff.add(p2);
		ff.add(p3); //패널을 프레임에 붙이는 것
		ff.add(p4);
		
		ff.setVisible(true);
		
		
		
	}
}
