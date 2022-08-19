package ja_0719;

interface Car{
	void run();
}

interface Ship{
	void navigate();
}

interface Mole{
	void dig();
}

interface Wigs extends Car, Ship, Mole //이 경우는 인터페이스가 인터페이스 상속 받는 것 이때는 extends 사용 (다중 상속)
{
	void floating();
}

class EagelFive implements Wigs //클래스가 인터페이스 상속 받을 때는 implements 사용
//인터페이스 안에 추상 메소드들은 반드시 오버라이딩 되어야 한다.
{

	@Override // 오버라이딩 안 하면 에러 나와
	public void run() {
		System.out.println("황야를 달린다 !!!!");
		
	}

    @Override
	public void navigate() {
		System.out.println("바다를 질주한다 ~~~~~");
		
	}

	@Override
	public void floating() {
		System.out.println("습지를 날아 다닌다 #######");
		
	}

	@Override
	public void dig() {
		System.out.println( "땅 속을 파고 다닌다 ******");
		
	}
	
}

public class WigsTest {

	public static void main(String[] args) {
		
		EagelFive obj = new EagelFive();
		
		obj.floating();
		obj.run();
		obj.navigate();
		obj.dig();
	}
}
