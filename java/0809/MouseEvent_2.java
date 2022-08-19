package ja_0809;
// 마우스 이벤트에는 MouseMotionEvent와 MouseEvent가 있다.
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseEvent_2  extends Frame  implements MouseMotionListener
{
	Label info;
	public MouseEvent_2(String title) {
		super(title);
		info = new Label();
		
		add("North", info);
		addMouseMotionListener(this);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new MouseEvent_2("MouseMotion Event Test");
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		info.setText("마우스 드래그~");
        
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		info.setText(" X = "+e.getX()+
	   		     " XX = "+e.getXOnScreen()+
	   		     ", Y = "+e.getY()+
	   		     " YY = "+e.getYOnScreen());
	}

}
