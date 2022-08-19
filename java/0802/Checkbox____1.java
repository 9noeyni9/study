package ja_0802;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Checkbox____1 extends Frame {

	public Checkbox____1(String str) {
		super(str);
		
		
		setLayout(new FlowLayout());
		
		Checkbox cbx1 = new Checkbox("남자",false);
		Checkbox cbx2 = new Checkbox("여자",true);
		
		add(cbx1);
		add(cbx2);
		
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Checkbox____1("체크박스테스트~~~~~~~~");
	}
}
