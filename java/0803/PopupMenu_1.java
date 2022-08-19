package ja_0803;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PopupMenu_1 extends Frame implements MouseListener{
	
	PopupMenu popup;
	TextArea txt;
	
	public PopupMenu_1(String title) {
		super(title);
		
		popup = new PopupMenu("나의 팝업 메뉴");
		txt = new TextArea("구인영 ~~~~ 구인영");
		
		MenuItem cut = new MenuItem("오려두기");
		MenuItem paste = new MenuItem("붙이기");
		MenuItem copy = new MenuItem("복사하기");
		
		popup.add(cut);
		popup.add(paste);
		popup.add(copy);
		
		txt.addMouseListener(this); //이벤트 달아줌
		txt.add(popup);
		
		add(txt);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PopupMenu_1("popup menu Test");
	}

	@Override
	public void mouseClicked(MouseEvent e) { //클릭!! ( 마우스 클릭 한번에 3번의 이벤트 발생)
	
//		popup.show(txt, e.getX(), e.getY()); //놨을 때
	}

	@Override
	public void mousePressed(MouseEvent e) {//누르고
	
		popup.show(txt, e.getX(), e.getY()); //누르는 동안에
		System.out.println(" " + txt + " : " + e.getX() + ",\n"+ e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {//놓고
	
//		popup.show(txt, e.getX(), e.getY()); //놓을 때
	}

	@Override
	public void mouseEntered(MouseEvent e) { //마우스가 들어와

//		popup.show(txt, e.getX(), e.getY()); //마우스 들어오는 순간에 얘는 좀 애매
	}

	@Override
	public void mouseExited(MouseEvent e) {//마우스가 나가

		
	}

}
