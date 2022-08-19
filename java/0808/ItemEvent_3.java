package ja_0808;


import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class ItemEvent_3 extends Frame implements ItemListener{
    
	List lst_1, lst_2, lst_3;
	Label lbl_info;
	int j =0;
	
	String[] 대륙 = {"아시아", "유럽","아프리카"}; //인덱스 0,1,2
    String[][]나라 = {{"한국","일본","중국",},
                     {"영국","스위스","프랑스"},
                     {"이집트","콩고","우간다"}};
    String [][]수도 = {{"서울","도쿄","베이징"},
    		         {"런던", "베른","파리"},
    		         {"카이로","브라자빌","캄팔라"}};

    
    
    public ItemEvent_3(String str) {
    	super(str);
    	Label lbl = new Label("대륙과 나라를 선택하세요");
    	Panel panel = new Panel();
    	
    	lbl_info = new Label();
    	lst_1 = new List(2, false);//보이는 건 2개 선택은 1개
    	lst_2 = new List(3, false); //보이는 건 3개 선택은 1개
    	lst_3 = new List(3, false); //보이는 건 3개 선택은 1개
    	
    	lst_1.addItemListener(this);
    	lst_2.addItemListener(this);
    	lst_3.addItemListener(this);
    	
    	for (int i = 0; i < 대륙.length; i++) 
			lst_1.add(대륙[i]); //lst_1에 add함
			
			 lst_2.add("                "); //실행 시키면 lst_2는 공백으로 시작(처음엔 공백으로 나옴)
			 lst_3.add("나라를 먼저 선택하세요");	
			 
			
		
						
			panel.add(lst_1);
			panel.add(lst_2);
			panel.add(lst_3);
			
			
			add("North",lbl);
			add("Center",panel);
			add("South",lbl_info);
			
			setSize(400,200);
			setVisible(true);
			
		
			        
    }

	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		List obj = (List)e.getSource();
		String str = "선택한 대륙, 나라, 수도는 : ";

		if (obj == lst_1) {
			lst_2.removeAll();
			lst_3.removeAll();
			int j = lst_1.getSelectedIndex();//자동적으로 인덱스 부여되있어

			for (int i = 0; i < 나라[j].length; i++) {
				lst_2.add(나라[j][i]);
				lst_3.add(수도[j][i]);

			}
			
		} else {
			str += lst_1.getSelectedItem();
			str += "-" + lst_2.getSelectedItem();
			str += "-" + lst_3.getSelectedItem();
			lbl_info.setText(str);
		}
	}
	public static void main(String[] args) {
		new ItemEvent_3("ItemEvent 예제3");
	}

	
}
