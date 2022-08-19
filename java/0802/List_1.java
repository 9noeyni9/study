package ja_0802;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;

public class List_1 extends Frame {
	
	public List_1(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		
//		List list = new List(4, false);//List 객체 생성 4는 화면에 출력될 항목의 객수
		                               //false는 다중 선택 불가
		List list = new List(4, true);
		/*
		 * . List(리스트)
		 * 
		 * : 선택 버튼은 한 개의 아이템만 선택할 수 있는 반면,
		 *   리스트를 한 개 이상의 항목을 선택할 수 있습니다.
		 *   기본적인 사용 방법은 선택버튼과 비슷합니다.
		 */
		
		Label lbl = new Label("List TEst");
		add(lbl);
		
		list.add("386DX");
		list.add("486DX");
		list.add("486DX66");
		list.add("팬티엄");
		list.add("팬티엄4");
		list.add("에슬론XP3");
		list.add("인텔 듀얼코어");
		
//		add((Component)list);
		add(list);
		setSize(200, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new List_1("list test ~~~~~");
	}
	

}
