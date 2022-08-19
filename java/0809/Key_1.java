package ja_0809;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Key_1  extends Frame  implements KeyListener //Key = 키보드 자판
{
	TextArea  txt_info;
	TextField txt;
	
	public Key_1(String title) {
		super(title);
		
		txt = new TextField();
		txt.addKeyListener(this);
		
		add("Center", txt_info = new TextArea());
		add("South",txt);
		addWindowListener(new Handler());
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Key_1("key Event TEST");
	}
	//KeyEvent 호출순서 : Pressed ->Typed ->Released
	
	@Override
	public void keyTyped(KeyEvent e) {
        txt_info.append(e.getKeyChar()+" 가 입력되었습니다. \n");		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		txt_info.append(e.getKeyChar()+" 가 눌렸습니다. \n");	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		txt_info.append(e.getKeyChar()+" 를 놓았습니다. \n");	
		
	}

	class Handler extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
