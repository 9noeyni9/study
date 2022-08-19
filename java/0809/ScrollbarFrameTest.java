package ja_0809;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScrollbarFrameTest 
{
public static void main(String[] args) 
{
	MyFrame  ff  = new MyFrame("My Speed ~~~");
	
	Graphics gg = ff.getGraphics();
	gg.setColor(Color.red);

	//글씨가 이동하는 것이 아니라. 위치가 달라지면서 써졌다 지워지는 것의 반복. 
	for (int i = 0; true; i += ff.speed) {  // 스크롤의 이동거리만큼 빨라져라, speed = sbb.getValue();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		gg.clearRect( 0, 0, 350, 350); // (x,y,x,y)0에서 350까지 이전글씨를 지운다.
		gg.drawString("구인영", 100, i); //("출력할문자", x좌표, y 좌표) 글씨를 쓴다.
		
		i = (i<350) ? i : 0; // 350을 넘으면 다시 0이 된다.
	}
	
}

}

class MyFrame extends Frame 
{
	int speed = 1;
	Scrollbar sbb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 15, 0, 95);  //0부터 80까지 움직인다
	
	Label lSpeed  = new Label("Speed : 1");
	
	public MyFrame(String title) {
		super(title);
		
		lSpeed.setBackground(Color.green);
		lSpeed.setSize(300,20);
		lSpeed.setLocation(20,40);  // setLayout(null)이기 때문에 좌표값을 설정해줬다.
		
		sbb.setSize(300,20);
		sbb.setLocation(20,250);
		
		add(sbb);
		add(lSpeed);
		
		sbb.addAdjustmentListener(new MyHandler());
		
		addWindowListener(new MyHandler());
		
		setSize(350,350);
		setLayout(null);
		setVisible(true);
		setResizable(false);
	}

    class MyHandler extends WindowAdapter implements AdjustmentListener
    {

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {

		speed = sbb.getValue();
		lSpeed.setText("Speed : "+speed);  //스크롤바의 움직임만큼 라벨안의 숫자가 커짐
	}
	public void WindowClosing(WindowEvent we) {
		System.exit(0);
	}
  }
    
}
