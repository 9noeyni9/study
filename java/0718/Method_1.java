package ja_0718;

class Super_1
{
	public void display() {
		System.out.println("Super_1 class display Method ~~~~");
		show();  //같은 클래스 안에서 접근하기 (메소드는 내부적으로 스레드가 돌아서 어떻게 나올지 모름,,,랜덤인가봐...?)메소드 안에서 또 다른 메소드 호출 가능
	}
	
	protected void message() {
		System.out.println("Super_1 class message Method @@@@@");
	}
	
	void print() {
		System.out.println("Super_1 class print Method #####");
	}
	
	private void show() {
		System.err.println("Super_1 class show Method &&&&&&&");
	}
}


public class Method_1 extends Super_1 {

	public static void main(String[] args) {

		Method_1 obj_1 = new Method_1();
		
		obj_1.display();
		obj_1.message();
		obj_1.print();
		//obj_1.show();  접근 불가능 하므로 같은 클래스 안에서 접근 해!
	}
}
