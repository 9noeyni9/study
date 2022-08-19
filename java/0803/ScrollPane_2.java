package ja_0803;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextArea;

public class ScrollPane_2 { //스크롤팬은 크기에 따라 자동으로 스크롤바 생성하는 것
	public static void main(String[] args) {
		
		Frame ff = new Frame("ScrollPane");
		
		ff.setSize(300,200);
		
		ScrollPane spp = new ScrollPane();
		Panel pp = new Panel();
		
		pp.setBackground(new Color(195,195,255));
		pp.add(new Button("첫번째"));
		pp.add(new Button("두번째"));
		pp.add(new Button("세번째"));
		pp.add(new Button("네번째"));
		pp.add(new TextArea(15,30)).setBackground(new Color(255,255,255));
		
		spp.add(pp); //스크롤팬은 하나만 add가능 (두개 붙이면 마지막 값만 유효)
		ff.add(spp); //그래서 Frame에 add 시켜주는 것
//		ff.add(pp); //panel 사용하면 창 크기가 작아져도 스크롤바 안 나와
		
		ff.setVisible(true);
		
	}

}
