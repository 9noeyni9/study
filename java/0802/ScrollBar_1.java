package ja_0802;//-Dfile.encoding=MS949

import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;

public class ScrollBar_1 extends Frame {

	/*
	 * . ScrollBar (스크롤바)
	 * 
	 * : 스크롤바는 가로와 세로로 길쭉한 형태로 되어 있습니다. 주로 값의 범위를 지정할 때 많이 사용됩니다.
	 */
	
	public ScrollBar_1(String title) {
		super(title);
		
		Scrollbar srb1 = new Scrollbar(Scrollbar.VERTICAL, 10 , 100, 0, 255 );//10에 위치에서 100의 크기를 갖는다(0부터 155까지 움직인다 : 앞 꼭지점 기준으로 바 사이즈(100) 뼤준 만큼 이동가능)
		Scrollbar srb2 = new Scrollbar(Scrollbar.HORIZONTAL, 100 , 50 , 0, 255 ); //100에 위치에 50크기 값을 갖는다(0번부터 205까지 움직인다 : 앞 꼭지점을 기준으로 바 사이즈 빼준 것)
		
		add("East", srb1); //동쪽에
		add("Center", new Label("스크롤바 테스트~~"));
		add("North", srb2); //북쪽에 
		
		setSize(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ScrollBar_1("ScrollBar test ~~~~");
	}
}
