package ja_0719;

interface Bird
{
	
// public static final long speed = 65;
	long speed = 65;
// public abstract	void fly();
	void fly();
	
}

interface Horse
{
	void run();
}

interface Fish
{
	void swimming();
}

class Pegasus implements Bird, Horse, Fish  //자바는 단일 상속만 가능하지만 인터페이스는 다중 상속 가능해
{

	@Override
	public void swimming() {
		System.out.println("바다를 헤엄친다~~~~~");
		
	}

	@Override
	public void run() {

  	      System.out.println("대륙을 뛰어 다닌다^^^^^^^");		
	}

	@Override
	public void fly() {

	      System.out.println("푸른 하늘을 날아 다닌다 &&&&&&&");
	
		
	}
	
}

public class PegasusTest {

	public static void main(String[] args) {
		
		Pegasus obj = new Pegasus();
		//Bird obj = new Pegasus(); 버드로 상속하면 오류 뜨는 거 확인하기
		
		
		obj.fly();
		System.out.println("속도는 : " + Bird.speed + " 입니다.");
		
		obj.run();
		obj.swimming();
		
	}
}
