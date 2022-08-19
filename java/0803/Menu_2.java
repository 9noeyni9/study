package ja_0803;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Menu_2 extends Frame{

	public Menu_2(String title) {
		super(title);
		
		MenuBar mb = new MenuBar();
		Menu file = new Menu("파일");
		Menu d = new Menu("도구");
		
		CheckboxMenuItem file_new = new CheckboxMenuItem("새 파일", true); //체크가 되는 거 (트루를 주면 체크인 상태)
		CheckboxMenuItem file_open = new CheckboxMenuItem("불러오기");
		MenuItem file_separator = new MenuItem("-");//언더바만 가능,메뉴 구분하기
		MenuItem file_close = new MenuItem("파일 닫기");
		

		file.add(file_new);
		file.add(file_open);
		file.add(file_separator);
		file.add(file_close);
		
		Menu edit = new Menu("편집");
		MenuItem edit_cut = new MenuItem("오려두기");
		MenuItem edit_paste = new MenuItem("붙이기");
		
		edit.add(edit_cut);
		edit.add(edit_paste);
		
		file.add(edit);
		
		mb.add(file);
		
		CheckboxMenuItem d_basic = new CheckboxMenuItem("기본 설정", true); //체크가 되는 거 (트루를 주면 체크인 상태)
		CheckboxMenuItem d_sort = new CheckboxMenuItem("정렬");
		MenuItem d_separator = new MenuItem("-");//언더바만 가능,메뉴 구분하기

		d.add(d_basic);
		d.add(d_sort);
		d.add(d_separator);
		
		Menu re = new Menu("기록");
		MenuItem re_tt = new MenuItem("tt");
		MenuItem re_gg = new MenuItem("gg");
		
		re.add(re_tt);
		re.add(re_gg);
		
		d.add(re);
		
		mb.add(d);
		
				
		
		setMenuBar(mb);
		setSize(300,300);
		setVisible(true);
				
	}
	
	public static void main(String[] args) {
		new Menu_2("메뉴 만들기 2 ");
	}
}
