package ja_0719;


abstract class  도형
{
	int i =33; //강사님이 그냥 쓰신 것 포항항
	abstract void draw();
	
	void show()
	{
		System.out.println("도형 클래스 속 show() 메소드 ~~~~");
	}
	
}

class 사각형 extends 도형
{

	@Override
	void draw() {
		
		System.out.println("사각형을 그린다");
		// TODO Auto-generated method stub   //추상클래스를 상속받은 클래스는 추상 메소드를 (반드시) 똑같은 모습으로 재정의하는 것 : 오버라이딩
		                                     //몸통 만들어줘야해
	}
	 
}

class 삼각형 extends 도형
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그린다");
	}
	
}

public class Style_1 {
	public static void main(String[] args) {
		
		//사각형 obj_1 = new 사각형();
		//삼각형 obj_2 = new 삼각형();
		도형 obj_1 = new 사각형();
		도형 obj_2 = new 삼각형();		
		
		obj_1.draw();
		obj_2.draw();
		obj_1.show();
		obj_2.show();
		
	}

}
