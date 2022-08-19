package ja_0803;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextArea;

public class ScrollPane_1 extends Frame {

	public ScrollPane_1(String title) {
		super(title);
		
		ScrollPane srp = new ScrollPane();
		
		srp.setSize(220,200);
		/*
		 * . ScrollPane(스크롤팬);
		 * : 스크롤펜은 하나의 자식 컴포넌트만을 가질 수 있습니다.
		 *   따라서 스크롤팬에 여러개의 컴포넌트를 포함시키기 위해서는
		 *   패널을 스크롤팬에 붙이고, 패널 위에 컴포넌트를 붙이는 것이 좋습니다.
		 */
		
		Panel panel = new Panel();
		panel.setLayout(new BorderLayout());
		
		TextArea txt = new TextArea("텍스트에어리어");
		txt.setBackground(new Color(230,230,255));
		txt.setForeground(new Color(167,167,255));
		
		Panel panel2 = new Panel();
		panel2.setLayout(new BorderLayout());
		
		TextArea txt2 = new TextArea("텍스트에어리어222");
		txt2.setBackground(new Color(230,255,255));
		txt2.setForeground(new Color(80,255,255));
		
		panel.add("North", new Button("버튼"));
		panel.add("Center",txt);
		panel.add("South", new Button("확인"));
		
		panel2.add("North", new Button("버튼"));
		panel2.add("Center", new TextArea("세번쨰 벙법")).setBackground(new Color (180,180,180));;
		panel2.add("South", new Button("확인"));	
		
		srp.add(panel); //패널을 스크롤팬에 올림
//		srp.add(panel2); //스크롤팬은 하나의 자식 컴포넌트만 갖기 떄문에 두개를 보여주려고 하면 나중값이 보이는거야
		
		add("Center",srp);//다시 프레임에 붙인다..?
		
		setSize(200,200); //충분히 커져서 컴포넌트가 다 보이면 스크롤바는 안 보여 하지만 창이 작으면 스크롤바가 보여
		setVisible(true);
	}
	public static void main(String[] args) {
		new ScrollPane_1("Test ~~~");
	}
	
}
