package ja_0804;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayout_3 extends Frame {//클래스 생성없이 메소드에서 처리

	Button first, prev, next, last;
	Panel buttons;
	Panel slide;
	Panel card1, card2, card3, card4, card5;// slide에 포함될 Panel

	CardLayout card;

	public CardLayout_3(String title)
	{
		super(title);
		
		slide = new Panel();
		card = new CardLayout();
		
		slide.setLayout(card);
		
		//Button 을 담을 Panel
		
		buttons = new Panel();
		buttons.setLayout(new FlowLayout());
		
		first = new Button("<<");
		prev= new Button("<");
		next = new Button(">");
		last = new Button(">>");
		
		buttons.add(first);
		buttons.add(prev);
		buttons.add(next);
		buttons.add(last);
		
		first.addActionListener(new ActionListener() { //처음으로 간다  //메소드 안에서 이벤트 처리하는 에너니머스 클래스 방식(객체 안 만들고 메소드 안에서 클래스 만들고 사용)
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.first(slide);
			}
		});
		prev.addActionListener(new ActionListener() { //바로 이전 페이지로 간다
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.previous(slide);//이전
			}
		});
		
		next.addActionListener(new ActionListener() { //바로 다음 페이지로 간다
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.next(slide); //다음
			}
		});
		
		last.addActionListener(new ActionListener() { //마지막페이지로 간다
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.last(slide); //마지막 slide(Panel)이 보이도록 한다.
			}
		});
		
		card1 = new Panel();
		card1.setBackground(Color.green);
		card1.add(new Label("첫번째 페이지"));
		
		card2 = new Panel();
		card2.setBackground(Color.orange);
		card2.add(new Label("두두번째 페이지"));
	
		card3 = new Panel();
		card3.setBackground(Color.cyan);
		card3.add(new Label("세세세번째 페이지"));		
		
		card4 = new Panel();
		card4.setBackground(Color.gray);
		card4.add(new Label("네네네네번째 페이지"));	
		
		card5 = new Panel();
		card5.setBackground(Color.red);
		card5.add(new Label("다다다다다섯번째 페이지"));		
		
		slide.add(card1, "1");
		slide.add(card2, "2");
		slide.add(card3, "3");
		slide.add(card4, "4");
		slide.add(card5, "5");
		
		add("South", buttons);
		add("Center", slide);
		
		setSize(300,300);
		setLocation(300, 300);
		setVisible(true);
		
		card.show(slide, "3"); //처음 실행힐 때 세번째 슬라이드가 나타남
		
	}
	public static void main(String[] args) {
		new CardLayout_3("CardLayout Test");
	}

}
