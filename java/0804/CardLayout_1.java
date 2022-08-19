package ja_0804;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardLayout_1 extends Frame{ //2. 내부에 별도 클래스를 가지고 있는 방법

	CardLayout card = new CardLayout();
	Panel[] panel = new Panel[5];
	Color[] color = { Color.red, Color.blue, Color.yellow, Color.green, Color.cyan};
	int x,y;
	
	public CardLayout_1(String str) {
		super(str);
		setLayout(card);
		
		/*
		 * : CardLayout
		 * 
		 * . 카드 레이아웃은 한개의 컴포넌트를 한개의 컴포넌트로 표현하는 방법입니다.
		 *   여러개의 컴포넌트를 여러개의 카드에 배치하는 경우에
		 *   각 카드에 이름을 붙여 사용합니다. 해당 카드를 출력할 때 해당
		 *   카드의 이름을 show() 메소드로 출력하거나, first(), last(), next() 등의
		 *   메소드를 이용해 화면을 바꿔가며 출력할 수 있습니다.
		 *   
		 *  . 카드 레이아읏을 사용하는 과정
		 *    . setLayout() 메소드를 이용해 카드 레이아웃 등록
		 *    . 카드 레이아웃에 등록할 Panel을 만든다.
		 *    . add() 메소드를 이용해 패널을 컨테이너에 추가한다.
		 *    . 원하는 카드를 보여주기 위해서 show(), next(), first(), last() 메소드를 사용한다
		 *   
		 *   
		 *     이벤트를 처리하는 방법 3가지
		 *     1. 핸들을 가지고 잇는 익스텐즈 방법
		 *     2. 내부에 별도 클래스를 가지고 있는 방법
		 *     3. 외부에 별도 클래스를 가지고 있는 방법(어려움 ㅜ)
		 */
		
		MouseHandle mouse = new MouseHandle();
		
		for (int i = 0; i < 5; i++) { //밖에 있는 거 프레임 안에 색은 패널
			panel[i] = new Panel();
			panel[i].setBackground(color[i]);
			panel[i].addMouseListener(mouse); //마우스 이벤트 등록
			
			add((new Integer(i)).toString(), panel[i]);
			//여기서 요구하는 건 스트링타입 >> 숫자를 부여해서 panel[i] 스트링 타입으로 만든 것 요구하는 게 스트링 타입이니까
		}
		
		setSize(300,300);
		setVisible(true);
		
	}
	public class MouseHandle extends MouseAdapter//마우스 이벤트 처리 
	                                 // 메소드에 2개 이상 가지고 있다면 MouseAdapter
	                                 // MouseAdapter 안 쓰면 상속받지 않는 것 까지 포함 5개 전부 적어야 하는데 MouseAdapter 사용하면 사용하는 한 두개만 꺼내서 사용 가능
	{
		public void mouseClicked(MouseEvent e) { //마우스 클릭될 때
			card.next(CardLayout_1.this);
			System.out.println(e.toString()); //1: 마우스 왼쪽 2: 마우스 가운데 3: 마우스 오른쪽
		}
	}
	
	public static void main(String[] args) {
		new CardLayout_1("CardLayout 예제");
	}
	

			
}
