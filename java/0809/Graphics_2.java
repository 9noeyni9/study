package ja_0809;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Graphics_2  extends Frame 
{
public static void main(String[] args) {
	new Graphics_2("Graphics Test");
}

  public void paint(Graphics g) {
	  g.setFont(new Font("Serif", Font.PLAIN, 17));
	  g.drawString("Graphics를 이용해 그림을 그립니다.", 10, 50);
	  
	  g.drawOval(50, 100, 50, 50);  // 원
	  
	  g.setColor(Color.blue); //색칠된 원
	  g.fillOval(100, 100, 50, 50);
	  
	  g.setColor(Color.red); //모서리가 둥근 사각형
	  g.drawLine(100, 100, 150, 150);  //선
	  g.fillRoundRect(200, 100, 120, 80, 30, 30); 
	  // (200,100)위치에서 시작해 가로가120, 세로가80인 사각형 + 모서리의 각도가30도만큼 둥글다.
	  
	  g.setColor(Color.orange);  //다각형
	  g.fillPolygon(new int[] {50, 100, 150, 200, 150, 100},  //x좌표
	                new int[] {250, 200, 200, 250, 300, 300}, 6); //y좌표  , 6각형
	    
	  g.setColor(Color.cyan); 
	  g.fillArc(250, 200, 100, 100, 0, 120);
	  
	  g.setColor(new Color(240,10,50));
	  g.fillArc(250, 280, 100, 100, -45, -270);
	  
	  g.setColor(new Color(100,100,100));
	  g.fillPolygon(new int[] {150,200,250,220,180},
	                new int[] {280,230,280,320,320},5);
	  
	  
	  
  }
  
  public Graphics_2(String title) {
	 super(title); 
	 
	 addWindowListener(new WindowAdapter() {
		 public void windowClosing(WindowEvent  we) {
			 System.exit(0);
		 }
	});
	 setBounds(100,100,400,400);
	 setVisible(true);
  }



}
