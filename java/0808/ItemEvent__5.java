package ja_0808; //핸들러 방식

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent__5 extends Frame{

	Checkbox[] os = new Checkbox[5];
	Checkbox[] cpu = new Checkbox[3];
	
	CheckboxGroup cbg;
	Label lbl_info;
	
	String[] os_str = {"윈도우 98", "리눅스","윈도우10","MS_DOS","윈도우 XP"};
	String[] cpu_str = {"AMD","인텔","사이덱스"};
	
	int i;
	
	public ItemEvent__5(String title) {
		super(title);
		
		
		Label lbl = new Label("설치된 운영체제와 CPU를 먼저 선택하세요");
		lbl_info = new Label();
		
		Panel panel1 = new Panel();
		Panel panel2 = new Panel();
		Panel panel3 = new Panel();
		
		for (int i = 0; i < os.length; i++) {
			
			os[i] = new Checkbox(os_str[i]);
			panel1.add(os[i]);
			os[i].addItemListener(new Handler());
			
		}cbg= new  CheckboxGroup();
		
		for (int i = 0; i < cpu.length; i++) {
			
			cpu[i] = new Checkbox(cpu_str[i],cbg,(i==1)? true : false); 
			//1번쨰 위치인 인텔에 체크하기위해 위 구문을 설치했다
			panel2.add(cpu[i]);
			cpu[i].addItemListener(new Handler());
			
		}
		panel3.setLayout(new GridLayout(3,1));
		panel3.add(panel1);//배치를 따로 따로 줘서 실행 화면에 두 줄이 각각 존재할 수 있다
		panel3.add(panel2);
		
		add("North",lbl);
		add("Center",panel3);
		add("South",lbl_info);
		
		setSize(400,250);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ItemEvent__5("");
	}

	class Handler implements ItemListener{
	@Override
	public void itemStateChanged(ItemEvent e) {


		String msg = "당신의 컴퓨터 Os는 : ";
        for (int i = 0; i < os.length; i++) {
			if (os[i].getState())
			{
				msg += "[" + os[i].getLabel()+"]";
				
			}
		} //체크를 할 때마다 메소드 호출 되고 (위 이벤트는 호출)
        for (int i = 0; i < cpu.length; i++) { 
        	if (cpu[i].getState())
			{
				msg += "[" + cpu[i].getLabel()+"]";
				
			}
		}
        lbl_info.setText(msg);
	}
}
}