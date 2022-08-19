package ja_0719;

class AAPr_5{

	
	String str;
	boolean bbb;

	public AAPr_5(String str, boolean bbb) {
		
		this.str = str;
		this.bbb = bbb;
		
		System.out.println("AA_5 생성자 호출 @@@ : " + str + "boolean : " +bbb);
	}
}

class BBPr_5 extends AAPr_5{
	public BBPr_5(String str, boolean bbb) {
		super(str, bbb);
		System.out.println("BB_5 생성자 호출 $$$ : " + str + "boolean : " +bbb);
		
	}
}

class CCPr_5 extends BBPr_5{
	
	public CCPr_5(String str, boolean bbb) {
		super(str, bbb);
		
		System.out.println("CC_5 생성자 호출 %%%%% : " + str + "boolean : " + bbb);
	}
}

public class SuperPr_2 {

	public static void main(String[] args) {
		CCPr_5 obj_1 = new CCPr_5("즐거운 화요일 " , true);
		
		System.out.println(obj_1.str);
		System.out.println(obj_1.bbb);
		
	}
}
