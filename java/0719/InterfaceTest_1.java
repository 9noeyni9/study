package ja_0719;

interface AA_1 {
	void print1();  // public abstract void print1(); 따로 abstract키워드를 붙이지 않아도 의미를 갖는다. public abstract 생략되있는 것
}

class BB_1 implements AA_1{  //상속x 구현한다는 말

	@Override
	public void print1() {
		System.out.println("AA_1 인터페이스 메소드 재정의");
	}

	public void print2() {
	System.out.println("BB_1 클래스 메소드 print2()");
	}
	
}


public class InterfaceTest_1 {

	public static void main(String[] args) {
		
		BB_1 obj_1 = new BB_1();
		
		obj_1.print1();
		obj_1.print2();
		
		System.out.println("=======================================");
		
		
		AA_1 obj_2 = new BB_1();
		obj_2.print1();
		//obj_2.print2(); 오버라이징 된 print1은 실행되는데 print2는 오버라이징 되지 않아서 허용 안돼 
		
	}
	
}
