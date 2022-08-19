package ja_0719;

abstract class 도형연습
{
	abstract void draw();
	
	void show()
	{
		System.out.println("도형 클래스 속 show() 메소드 ~~~~~");
	}
}

class 사각형연습 extends 도형연습
{

	@Override
	void draw() {
		System.out.println("사각형을 그린다");		
	}
	
}

class 삼각형연습 extends 도형연습
{

	@Override
	void draw() {
		System.out.println("삼각형을 그린다");
		
	}
	
}


public class StylePr_1 {

	public static void main(String[] args) {
	
		도형연습 obj_1 = new 사각형연습();
		도형연습 obj_2 = new 삼각형연습();
		
		obj_1.draw();
		obj_2.draw();
		obj_1.show();
		obj_2.show();
		
	}
}
