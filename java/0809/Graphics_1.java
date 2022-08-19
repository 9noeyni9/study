package ja_0809;

import java.awt.Frame;
import java.awt.Graphics;

public class Graphics_1  extends Frame
{
	public Graphics_1(String title) {
		super(title);
		
		setSize(300,250);
		setVisible(true);
	}
	
	public void paint(Graphics g) {   //paint는 도화지, Graphics는 붓 이라고 생각하자
		g.drawLine(10, 10, 190, 190);  
		//(10,10)위치에서 (190,190)위치까지 선을 긋는다.
		g.drawRect(10, 35, 100, 100);
		g.drawOval(50, 50, 100, 100);  
		//(50,50)위치에서 가로세로 길이 100인 사각형 안에 들어가는 원을 그린다.
		g.drawArc(100, 100, 80, 80, 0, -180); 
		// (100,100)위치에서 길이가 각각 80인 사각형 안에 들어있는 원의 크기로
		// 0도(3시방향)에서 시계방향으로 180도 만큼 원을 그린다.
		// 0도는 3시, 180도는 9시위치 , '+'은 시계반대방향, '-'은 시계방향으로 원을 그린다.
	}
	
	public static void main(String[] args) {
		new Graphics_1("Graphics TEST");
	}

}
