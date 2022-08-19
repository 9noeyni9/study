package ja_0802;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Checkbox___1 {

	public static void main(String[] args) {
		
		Frame ff = new Frame("체크박스 테스트 ^0^");
		
		ff.setLayout(new FlowLayout());
		
		Checkbox cbx1 = new Checkbox("남자",false );
		Checkbox cbx2 = new Checkbox("여자",true );
		
		ff.add(cbx1);
		ff.add(cbx2);
		
		ff.setSize(200,200);
		ff.setVisible(true);
				
	}
}
