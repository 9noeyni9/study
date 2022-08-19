package ja_0804;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.List;

import ja_0802.List_1;

public class GridLayout_2 extends Frame {

	public GridLayout_2(String title) {
		
		super(title);
		
		setLayout(new GridLayout(3,2));
		List list = new List(4,true);
		Choice choice = new Choice();
		
		add(new Button("Button1"));
		add(list); //꽃이름
		add(choice); //산이름
		add(new TextArea("아름다운 사람",5,15));
		add(new TextField("TextField"));
		add(new Panel());    //하나의 프레임에 각각 다른 형태의 데이터를 담을 수 있다.
		
		
		list.add("라일락");
		list.add("해바라기");
		list.add("망고튤립");
		list.add("장미");
			
		choice.add("백두산");
		choice.add("한라산");
		choice.add("설악산");
		choice.add("금강산");
		
		
		
		setSize(200,200);
		setVisible(true);
		
		
		
		
	
	}
	public static void main(String[] args) {
		new GridLayout_2("GridLayout Test");
	}
}
