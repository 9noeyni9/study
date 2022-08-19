package ja_0714;


class A_1
{
	/* int x = 10;  //멤버 변수
	 int y = 30;  //멤버 변수
	

	
	 int add()   //멤버 메소드  디폴트
	 */
	/* private int x = 10;  //멤버 변수
	 private int y = 30;  //멤버 변수
	

	
	public int add()   //멤버 메소드
	
	은닉화 직접 멤버의 접근하지 못하게 하는 것 메소드를 통해서만 접근 가능하게 하는 것
	*/
	 int x = 10;  //멤버 변수
	 int y = 30;  //멤버 변수
	
	 
	 
	 //퍼블릭과 프라이빗 차이 확실히 알기!!!!!

	
	  int add()   //멤버 메소드
	{
		return (x + y);
		
	}
}


public class Test_B {
	
	public static void main(String[] args) {
		
		
		A_1 obj = new A_1();
		
	//	obj.x = 55;
	//	obj.y = 77;
    	obj.x = 55;
		obj.y = 77;
		
		
		//System.out.println(" x =" + obj.x);
		//System.out.println(" y =" + obj.y);
		System.out.println(" x =" + obj.x);
		System.out.println(" y =" + obj.y);
		System.out.println(" ( x+y ) =" + obj.add());
	}

}
