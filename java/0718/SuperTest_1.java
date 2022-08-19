package ja_0718;


class AA_3
{
	public AA_3() {
		super();    //object의 생성자를 호출하는 것  생성자 안에서 슈퍼 생성자의 호출은 생성자의 첫번째 줄에 호출되어야 한다. super();이게 시스템 아래로 못 내려가(에러)
		System.out.println("AA_3 생성자 호출 ######");		
	}
	int a = 33;
	
}

class BB_3 extends AA_3
{
	public BB_3() {
		//super();
		System.out.println("BB_3 생성자 호출 %%%%%%%");		
	}
	int b = 55;
	
}

class CC_3 extends BB_3
{
	public CC_3() {
		super();
		System.out.println("CC_3 생성자 호출 ~~~~!");
		
	}
	int c = 77;
}


public class SuperTest_1 {

	public static void main(String[] args) {
		
		CC_3 obj_1 = new CC_3();  //객체가 만들어지는 순서는 슈퍼클래스인 AA_3가 먼저 만들어진다 그 후에 BB_3 > CC_3
		
		System.out.println("\n obj_1 의 a 값" + obj_1.a);
		System.out.println("\n obj_1 의 b 값" + obj_1.b);
		System.out.println("\n obj_1 의 c 값" + obj_1.c);
		
	}
}
