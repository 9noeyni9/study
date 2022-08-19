package ja_0808;


import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxEventText_1 extends Frame{// 지금 여기서는 액션이벤트만 달아서사용한거,,>?
	
	//3.Panel의 기본 레이아웃 (25점)
	
	

	Label q1,q2,q3;
	Label score;
	
	Checkbox q1cb1,q1cb2,q1cb3,q1cb4;
	Checkbox q2cb1,q2cb2,q2cb3,q2cb4;
	Checkbox q3cb1,q3cb2,q3cb3,q3cb4;
	
	CheckboxGroup group;
	Button end;
	
	public CheckBoxEventText_1 (String title) {
		super(title);
		setSize(500,300);
		setLayout(new GridLayout(20,1));
		
		q1 = new Label("1. 다음 중 ActionEvent의 " + " actionPerformed()메소드가 호출되는 경우는?");
		q1cb1= new Checkbox("Button 을 눌렀을 때");
		q1cb2= new Checkbox("TextField 에서 Enter 키를 눌렀을 떄");
		q1cb3= new Checkbox("MenuItem 을 클릭했을 때");
		q1cb4= new Checkbox("List에서 더블 클릭으로 Item 을 선택했을 때");
		
		q2 = new Label("2. Frame 의 기본 LayoutManager 는(하나만 고르세요) " );
		q2cb1= new Checkbox("FlowLayout",group,false);
		q2cb2= new Checkbox("GridLayoutr",group,false);
		q2cb3= new Checkbox("BorderLayout",group,false);		
		q2cb4= new Checkbox("CardLayout",group,false);
		
		q3 = new Label("3. Panel 의 기본 LayoutManager 는(하나만 고르세요) " );
		q3cb1= new Checkbox("FlowLayout",group,false);
		q3cb2= new Checkbox("GridLayoutr",group,false);
		q3cb3= new Checkbox("BorderLayout",group,false);		
		q3cb4= new Checkbox("CardLayout",group,false);
		
		score = new Label("*** 결과 : ");
		end = new Button("이 버튼을 누르면 결과를 알 수 있습니다");
		end.setBackground(Color.green);
		
		end.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				float totalScore = 0.0f;
				
				if(q1cb1.getState())      totalScore += 12.5f;
				if(q1cb2.getState())      totalScore += 12.5f;
				if(q1cb3.getState())      totalScore += 12.5f;
				if(q1cb4.getState())      totalScore += 12.5f;
				
				
				if(q2cb3.getState())      totalScore += 25.0f;
				if(q3cb1.getState())      totalScore += 25.0f;
				
				score.setText("당신의 점수는 :" + totalScore +" 점 입니다.");

				
			}
		});
		
		add(q1);
		add(q1cb1);
		add(q1cb2);
		add(q1cb3);
		add(q1cb4);
		add(new Label("")); //공백 만들기
		add(q2);
		add(q2cb1);
		add(q2cb2);
		add(q2cb3);
		add(q2cb4);
		add(new Label(""));
		add(q3);
		add(q3cb1);
		add(q3cb2);
		add(q3cb3);
		add(q3cb4);
		
		add(end);
		add(score);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new CheckBoxEventText_1("Score Test");
	}
}
