package ja_0802;//프레임 상속 받는 방법

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Checkbox__1 extends Frame
{
	
	public Checkbox__1(String str) {
		super(str);

	setLayout(new FlowLayout());
	
	Checkbox cbx_1 = new Checkbox("남자",false );
	Checkbox cbx_2 = new Checkbox("여자",true );
	
	add(cbx_1);
	add(cbx_2);
	
	setSize(200,200);
	setVisible(true);
	

		
		
	}
	public static void main(String[] args) {
		new Checkbox__1 ("체크박스 테스트 ~~~");
	}
	

	

}
