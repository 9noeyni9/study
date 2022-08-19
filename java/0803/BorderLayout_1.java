package ja_0803;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class BorderLayout_1 extends Frame{
	
	/*
	 * .BorderLayout
	 * 
	 * : 보더레이아웃은 동(),서(),남(),북(),중앙()으로 화면을 분할합니다.
	 *   중앙에는 중요한 컴포넌트를 두고, 그 주변에 보조 컴포넌트를 배치할 때 사용합니다.
	 *   Frame 컨테이너의 기본 레이아웃입니다.
	 */
	
	//BorderLayout bbl = new BorderLayout(); //(1)  (1)와(2)는 굳이 안 써도 돼! >>Frame이 기본 BorderLayout을 갖고 있으니까!

	public BorderLayout_1(String title) {
		super(title);
//		setLayout(bbl);//(2)
		
		add("North", new Button("북쪽")).setBackground(new Color(200,200,255));
		add("South", new Button("남쪽")).setBackground(new Color(186,186,255));
		add("East", new Button("동쪽")).setBackground(new Color(230,230,255));
		add("West", new Button("서쪽")).setBackground(new Color(215,215,255));
		add("Center", new Button("중앙")).setBackground(new Color(255,255,255));
		
		setSize(300,300);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new BorderLayout_1("BorderLayout Test");
	}
}
