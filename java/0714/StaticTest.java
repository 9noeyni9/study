package ja_0714;

class Static_1
{
	static int num = 0;
	int xx = 0;  //객체 속성 변수 필트 클래스 밑에 있는 것, 메소드 밑에 있으면 지역 변수
	int yy = 0;
	
	
	
}


public class StaticTest {
	public static void main(String[] args) {
		
		
		Static_1  ss1 = new Static_1();
		Static_1  ss2 = new Static_1();
		Static_1  ss3 = new Static_1(); //스테틱으로 선언된 건 메소드 영역에 만들어지므로 클래스 명으로 접근 가능
		
		ss1.num = 88; // ss1>>Static_1으로 바꿔주면 경고 사라짐  밑에 경고 뜬 부분 Static으로 선언된
		                   //부분 다 바꾸면 경고 다 사라져 ss1으로 써도 접근은 가능
		ss1.xx = 43;
		ss1.yy = 57;
		
		System.out.println("\n ss1 . num = " + ss1.num + "\n ss1.xx = "
		                          + ss1.xx + "\n ss1.yy = "+ ss1.yy);
		
		ss2.num = 999;
		ss2.xx = 233;
		ss2.yy = 345;
		
		System.out.println("\n ss2.num = " + ss2.num + "\n ss2.xx = "
                + ss2.xx + "\n ss2.yy = "+ ss2.yy);	
		
		System.out.println("\n ss3.num = " + ss3.num + "\n ss3.xx = "
                + ss3.xx + "\n ss3.yy = "+ ss3.yy);

		System.out.println("\n Static_1.num = " + Static_1.num + "\n ss3.xx = "
                + ss3.xx + "\n ss3.yy = "+ ss3.yy);		
	}

}
