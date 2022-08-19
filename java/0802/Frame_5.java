package ja_0802;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Frame_5 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("노랑");
		Frame ff2 = new Frame("연두");
		Frame ff3 = new Frame("빨강");
		Frame ff4 = new Frame("파랑");
		Frame ff5 = new Frame("흰색");
		
		ff.setSize(400,300); //왼쪽 꼭지점을 기준으로
		ff2.setSize(400,300); //왼쪽 꼭지점을 기준으로
		ff3.setSize(400,300); //왼쪽 꼭지점을 기준으로
		ff4.setSize(400,300); //왼쪽 꼭지점을 기준으로
		ff5.setSize(400,300); //왼쪽 꼭지점을 기준으로
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		//구현된 toolkit 객체를 얻는다
		
		Dimension screenSize = tk.getScreenSize();
		//화면의 크기를 구한다.
		
		       /*
		        * 화면의 크기의 절반값에서 Frame 크기의 절반 값을 뺀 위치로 하면
		        * Frame이 화면 가운데 위치하게 된다.
		        * 
		        * 좌>>우 : + ////  위 >> 아래 : +		        
		        */
		
//		ff.setLocation(screenSize.width / 2 ,screenSize.height / 2);
		//왼쪽 꼭지점 기준으로 좌표 먼저 잡아주는 거!
		
		ff.setLocation(screenSize.width /4*3 -200 , screenSize.height/4*3 -150); 
		ff2.setLocation(screenSize.width /4 -200 , screenSize.height/4 -150 );
		ff3.setLocation(screenSize.width /4 -200 , screenSize.height/4*3 -150 );
		ff4.setLocation(screenSize.width /4*3 -200 , screenSize.height/4 -150 );
		ff5.setLocation(screenSize.width /2 -200 , screenSize.height/2 -150 );
		
		ff.setBackground(new Color(255,255,0));
		ff2.setBackground(new Color(29,219,22));
		ff3.setBackground(new Color(255,0,0));
		ff4.setBackground(new Color(0,84,255));
		ff5.setBackground(new Color(255,255,255));
		
		ff.setVisible(true);
		ff2.setVisible(true);
		ff3.setVisible(true);
		ff4.setVisible(true);
		ff5.setVisible(true);
	}

}
