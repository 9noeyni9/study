package ja_0718;

class AA_2
{
	
	int aa = 55; 
	int bb = 77;
	
	void display () {
		System.out.println("AA_2 클래스의 display() ~~~~ 메소드");
	}
}

class BB_2 extends AA_2{
	
	int bb = 478;
	int cc = 888;
	
	void display() {
		System.out.println("BB_2 클래스의 display() @@@ 메소드");  //오버라이딩
	}
}
public class Overriding_1 {

	public static void main(String[] args) {
		//AA_2 obj_1= new AA_2();	(1)	
	     //BB_2 obj_1 = new BB_2(); (2)           
	     AA_2 obj_1 = new BB_2();              // (3) 멤버변수는 쉐도잉(가려지고) 멤버메소드는 오버라이딩된 자기 자신 것 나옴 (인터페이스에서 중요)
		//3가지 경우 다 보면서 생각해 AA객체를 만들었을 떄 나오는 내용, BB값, AA에 형변환 된 BB값????
	     
	     
		obj_1.display();
		System.out.println(obj_1.bb);    // (1)~(3)번 출력해보면서 어디 값이 출력되는지 확인해!
	}
}
