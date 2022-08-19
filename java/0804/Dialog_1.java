package ja_0804;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Dialog_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("Dialog Test");
		ff.setSize(400,400);
		
		Dialog info = new Dialog(ff, "새로운 소식", false); //false는 모달리스 방식으로 이벤트를 선점하지 않아서 두 창 자유롭게 이동 가능 true면 모달 방식으로 이벤트 선점 방식 먼저 뜬 창 해결해야 다른 작업이 가능하다
		
		info.setSize(240,190);
		info.setLocation(100, 100);
		info.setLayout(new FlowLayout());
		
		Label msg = new Label("This is model Dialog", Label.CENTER);
		Button ok = new Button("OK");
		
		info.add(msg);
		info.add(ok);
		
//		ff.add(info);
//		info.setVisible(true);
		ff.setVisible(true);  //두개의 프레임이 겹쳐 나오는데 각각 자유롭게 이동 가능해 서로를 벗어나도 ! 이런 상태를 modal과 modaless라고 해
		info.setVisible(true);
		
		/*
		 * Modal (모달)
		 * 
		 *  새 모달창이 열렸을 때 기조에 있던 창을 사용하지 못 한다.
		 *  
		 *  예를 들어 어떠한 응용 프로그램에서 에러 메시지가 뜬다면 그 메세지를
		 *  확인 또는 취소를 눌러야만 다음으로 진행이 가능하고
		 *  그 메시지가 뜬 상태라면 뒤에 있는 창을 선택할 수 없다
		 *  
		 *  즉 다이얼로그 창이 제어권을 독점해서 이 창이 종료되기 전에
		 *  다른 작업을 할 수 없는 것이다. 중요한 메시지를 표시하는
		 *  다이얼로그 창은 거의 대부분 모달로 나타낸다
		 *  
		 * Modaless (모달리스)
		 * 
		 *  모달리스는 어느 하나의 다이얼로그 차잉 있어도 프로그램 제어권을
		 *  독점하지 않으므로 다른 작업을 할 수 있다. 
		 */
		
	}

}
