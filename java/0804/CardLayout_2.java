package ja_0804;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardLayout_2 {
	public static void main(String[] args) {
		
		final Frame ff = new Frame("CardLayoutTest");
		final CardLayout card = new CardLayout(10,20); //좌측우측에 10만큼 여백을 주겠다, 위아래 20씩 여백을 주겠다(여백주기)
		
		ff.setLayout(card);
		
		Panel card_1 = new Panel();
		card_1.setBackground(Color.yellow);
		card_1.add(new Label("**** Card_1 ****"));
		
		Panel card_2 = new Panel();
		card_2.setBackground(Color.green);
		card_2.add(new Label("@@@@ Card_2 @@@@"));
		
		Panel card_3 = new Panel();
		card_3.setBackground(Color.cyan);
		card_3.add(new Label("&&&& Card_1 &&&&"));		
		
		ff.add(card_1, "1"); //다양한 매개변수 갖고 있는 메소드
		//Frame에 card_1을 "1"이라고 이름을 붙여주기
	    ff.add(card_2,"2");
	    ff.add(card_3,"3");
	    
	    class Handler extends MouseAdapter{
	    	
	    	public void mouseClicked(MouseEvent e) {
	    		System.out.println(e.toString());
	    		
	    		//마우스 오른쪽 버튼이 눌렸을 때
	    		if(e.getModifiers() == e.BUTTON3) //어떤 버튼이 눌렸는지 보여줌
	    		{
	    			card.previous(ff);//CardLayout의 이전 Panel을 보여줌 //원래 1>2>3순서로 내려가는데 프리비어스 해주면 3>2>1 순서가 돼
	    		}else 
	    		{
	    			card.next(ff);//CardLayout의 이후 Panel을 보여줌
	    		}
	    	}
	    }//class Hander
	    
	    card_1.addMouseListener(new Handler());
	    card_2.addMouseListener(new Handler());
	    card_3.addMouseListener(new Handler());
	    
	    ff.setSize(300,300);
	    ff.setLocation(300,400);
	    ff.setVisible(true);
		//지금까지 이벤트 단 방법들 다 다른 방법이야 다 알아두기!
		
		
	}

}
