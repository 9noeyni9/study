package ja_0804;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Window;

public class Window_1 extends Frame{

	Window[] win = new Window[200];
	Color[] color = {Color.red, Color.yellow, Color.green}; //
	int x,y;
	int n=1;
	public Window_1(String str) {
		super(str);
		
//		for (int i = 0; i < 20; i++) {
//			win[i] = new Window(this);
//			win[i].setBackground(color[i%3]); //**10을 3으로 나눌 때 나머지 나올 수 있는 거 0,1,2 >>Color[] color = {Color.red, Color.yellow, Color.green}; 얘네가 0,1,2
//			//만약에 컬러가 다섯가지라면 i/5하면돼
//			Label lbl = new Label(i + "번 윈도우");
//			
//			
//			win[i].add(lbl);
//			win[i].setBounds(100 + (i*10), 100+(i*10), 100,100);
//			win[i].setVisible(true);		
//			
			for (int i = 0; i < 200; i++) {
				win[i] = new Window(this);
				win[i].setBackground(color[i%3]); //**10을 3으로 나눌 때 나머지 나올 수 있는 거 0,1,2 >>Color[] color = {Color.red, Color.yellow, Color.green}; 얘네가 0,1,2
				//만약에 컬러가 다섯가지라면 i/5하면돼
				Label lbl = new Label(i + "번 윈도우");
				
				
//			if (i<10 || i>=20 & i<30 ) {
//				x += 10;
//				y += 10;
//	
//				win[i].add(lbl);
//				win[i].setBounds(100 + x, 100+y, 100,100);
//		
//				
//			}
//
//			else {
//				x += 10;
//				y -= 10;
//					
//				win[i].add(lbl);
//				win[i].setBounds(100+x,100+y,100,100);
//			
//			}
				
				if (i<= win.length/4) { 
//				if(i<=25)	
					if((int)(i/10)%2==0) {
					x += 10;
					y += 10;
		
					win[i].add(lbl);
					win[i].setBounds(100 + x, 100+y, 100,100);
							
				}
					else {
						x += 10;
						y -= 10;
							
						win[i].add(lbl);
						win[i].setBounds(100+x,100+y,100,100);						
					}
				}
				 if(i>win.length/4 && i<=win.length/2) {

				if((int)(i/10)%2==1) {
					x -= 10;
					y += 10;
						
					win[i].add(lbl);
					win[i].setBounds(100+x,100+y,100,100);
			
				}
				else {
					x += 10;
					y += 10;
						
					win[i].add(lbl);
					win[i].setBounds(100+x,100+y,100,100);
				}
	
				}
			
				if(i>(win.length/2) && i<=(win.length/4)*3 ) {

				if((int)(i/10)%2==1) {
					x -= 10;
					y += 10;
						
					win[i].add(lbl);
					win[i].setBounds(100+x,100+y,100,100);
			
				}
				else {
					x -= 10;
					y -= 10;
						
					win[i].add(lbl);
					win[i].setBounds(100+x,100+y,100,100);
				}
	
				}				
				if (i>(win.length/4*3)) {

				if((int)(i/10)%2==1) {
					x += 10;
					y -= 10;
						
					win[i].add(lbl);
					win[i].setBounds(100+x,100+y,100,100);
			
				}
				else {
					x -= 10;
					y -= 10;
						
					win[i].add(lbl);
					win[i].setBounds(100+x,100+y,100,100);
				}
	
				}
			win[i].setVisible(true);
			}
		

		
		setLocation(90, 90);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Window_1("윈도우");
	}
	
	
	
	
}
