package ja_0719;

class AA_5 {
		
	String str;
	boolean bbb;
	char sex = 'm';
	
	public AA_5(String str, boolean bbb,char sex) { //(3)
		this.str = str;
		this.bbb = bbb;
		this.sex = sex;; 
		
		System.out.println("AA_5 생성자 호출 ~~~~ : " + str + "boolean : " + bbb);
	}
}

class BB_5 extends AA_5{
	public BB_5(String aa, boolean kbs,char sex) { //(3)  // 꼭 변수가 같은 이름일 필요 없어 형식(String, boolean)만 일치하면 돼  똑같은 이름으로 전달하는 게 가독성이 좋을 뿐!
		super(aa, kbs,sex); //(3)
		System.out.println("BB_5  생성자 호출 $$$$$ : " + aa + " boolean : " + kbs);
	}
}

class CC_5 extends BB_5{
	
	char sex ='f';//(2)
	public CC_5(String mbc, boolean bbb, char sex) { //매개변수는 데이터 전달하는 통로  //(2)
		super(mbc, bbb, sex); //(2)(3)
		
		this.sex = sex;//(2)
		System.out.println("CC_5  생성자 호출 ^^^^^^ : " + mbc + " boolean : " + bbb);
	}
}

public class SuperTest_2 {
	public static void main(String[] args) {
		
		//CC_5 obj_1 = new CC_5("즐거운 화요일 ", true); //객체가 만들어지면서 값 전달하고  //(1)
		CC_5 obj_1 = new CC_5("즐거운 화요일 ", true, 'm');  //(2) 성별 추가했을 때   		
		
		System.out.println(obj_1.str);
		System.out.println(obj_1.bbb); //출력..
		System.out.println(obj_1.sex); //(2)
	}

}
