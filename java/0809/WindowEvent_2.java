package ja_0809;
//그동안 했던 것들에도 닫기 기능을 추가해보세요~
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEvent_2  extends Frame 
{

	public WindowEvent_2(String title){
		super(title);
		
		addWindowListener(new Handler());
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
	   new WindowEvent_2("WindowEvent Test");	
	}
	
	class Handler  extends WindowAdapter   // WindowAdapter를 쓰면 많은 메소드 중 하나만 가져와서 쓸 수 있다.
	{
		public void windowClosing(WindowEvent e) { 
			System.out.println("윈도우 닫기");
			System.exit(0); //프로그램 종료
			
		}
	}
	
}
