package ja_0719;

interface AA_2{
	
	int kbs = 999; // static *final* int kbs = 999; 값변경을 못 함
}

class BB_2 implements AA_2{
	
	int mbc = 345;
	int kbs = 789;
}

public class InterfaceTest_2 {

	public static void main(String[] args) {
		
		BB_2 obj_1 = new BB_2();
		
		//AA_2.kbs = 345; 값변경 못해 이미 만들어져있어 
		
		obj_1.kbs = 111;
		obj_1.mbc = 333;
		
		System.out.println(" kbs 11 = " + obj_1.kbs); //메소드에 있는 값 변경 불가 (static final로 선언된)
		System.out.println(" kbs 22 = " + AA_2.kbs);  //힢공간에 kbs   만약 heap공간에 kbs가 없다면 메소드 값 출력 지금은 위 kbs와 다른 kbs라고 봐야 함
		System.out.println(" mbc = " + obj_1.mbc);

		
	}
}
