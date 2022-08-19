package ja_0805;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_6 extends Frame implements ActionListener {
	
	Label lid;
	Label lpwd;
	Label ltel;
	TextField tfId;
	TextField tfPwd;
	TextField tfTel;
	Button ok;

	public ActionEvent_6(String title) {
		super(title);
		
		
		lid = new Label("ID : ",Label.RIGHT);
		lpwd = new Label("PWD : ", Label.RIGHT);
		ltel = new Label("tel : ", Label.RIGHT);
		
		tfId= new TextField(10);
		tfPwd= new TextField(10);
		tfPwd.setEchoChar('*');
		tfTel= new TextField(10);
		tfTel.setEchoChar('#');
		ok = new Button("OK");
		
		tfId.addActionListener(this);
		tfPwd.addActionListener(this);
		tfTel.addActionListener(this);
		ok.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(lid);
		add(tfId);	
		add(lpwd);
		add(tfPwd);
		add(ltel);
		add(tfTel);
		add(ok);
		
		setSize(600,80);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ActionEvent_6("Login Test");
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String id = tfId.getText();
		String password = tfPwd.getText();
		String tel = tfTel.getText();
		
		if (!id.equals("korea")) { //==비교보다는 !equals를 많이 써
			System.out.println("입력하신 ID 가 존재하지 않습니다. 다시 입력해 주세요");
			tfId.requestFocus(); //포커스를 tfId에 두고 (커서를 그 위치에 갖다놔라
			tfId.selectAll(); //모두 반전시켜라(모두 선택해라) : 얘가 없으면 반전되지 않아 그럼 직접 지우고 다시 써야 하니까 귀찮지
		}else if (!password.equals("seoul")) {
			System.out.println("입력하신 password가 존재하지 않습니다 다시 입력해 주세요.");
			tfPwd.requestFocus();
			tfPwd.selectAll();
		}else if (!tel.equals("01010101010")) {
			System.out.println("입력하신 tel no.가 존재하지 않습니다 다시 입력해 주세요.");
			tfTel.requestFocus();
			tfTel.selectAll();
		}
		else {
			System.out.println(id+"님 로그인 되었습니다.");
		}
		
	}	
	
}
