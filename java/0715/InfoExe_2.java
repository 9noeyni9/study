package ja_0715;

class Info2 {

	private String name;
	private int age;
	private char sex;
	private String tel;
	//생성자 overloading
	// 두 메소드가 같은 이름을 갖고 있으나 인자의 수나 자료형이 다른 경우를 말한다. 

	public Info2(String n, int a, char s, String t) { //생성자
		name = n;
		age = a;
		sex = s;
		tel = t;
	}

	public Info2(String n, int a) { //생성자
		name = n;
		age = a;
		sex = 'm';
		tel = "12345";
	}

	public Info2 (String n, char s) { //생성자 //객체를 만들 떄 다양한 타입이 가능해 근데 변수이름만 바뀌는 건 안돼
			name = n;
			age =77;
			sex =s;
			tel ="56789";
	}
	public Info2 (int a, char s, String t) { //생성자
			name = "장미";
			age =a;
			sex =s;
			tel =t;
	}
	public Info2( String n) {//생성자
		name = n;
		age = 25;
		sex = 'f';
		tel= "12121";
	}
	public Info2() { //생성자
		name = "해바라기";
		age = 36;
		sex = 'm';
		tel = "08080";
	}

	public void display() { //멤버 메소드
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);
		System.out.println("전화번호 : " + tel);
	}

}

public class InfoExe_2 {
	public static void main(String[] args) {
		
		Info2 info1 = new Info2(" 백일홍 ", 17, 'f',"99999");
		Info2 info2 = new Info2(" 들국화 ",33);
		Info2 info3 = new Info2(" 맨드라미 ", 'm');
		Info2 info4 = new Info2( 26, 'f',"57575");
		Info2 info5 = new Info2(" Anonymous ");
		Info2 info6 = new Info2();

		info1.display();
		System.out.println();
		
		info2.display();
		System.out.println();
		
		info3.display();
		System.out.println();		

	    info4.display();
		System.out.println();

		info5.display();
		System.out.println();
		
		info6.display();
		System.out.println();		
	}

}


