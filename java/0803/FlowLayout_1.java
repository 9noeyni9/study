package ja_0803;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayout_1 extends Frame {

	FlowLayout fll = new FlowLayout();
	Button[] btn = new Button[10];
	
	public FlowLayout_1(String title) {
		super(title);
		setLayout(fll); //얘 없으면 센터에 계속 누적되므로 값이 하나만 나온 것 처럼 보여 플로우레이아웃 모습
		
		for (int i = 0; i < 10; i++) {
			btn[i] = new Button(i + " 번 버튼");
			add(btn[i]);
		}
		
		setBounds(100,100,200,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new FlowLayout_1("FlowLayout Test");
	}
}
