package ja_0719;

abstract class Style_88{ //추상메소드를 갖고 있는 추상 클래스
	int i = 77;
	
	abstract void draw(); //추상메소드
	abstract void print(); //추상메소드
	abstract void message();
	
 }

class Square extends Style_88
{

	@Override
	void draw() {
		System.out.println("사각형을 그린다!!!");
		// TODO Auto-generated method stub : 몸통을 구현해라
		
	}

	@Override
	void print() {
		System.out.println(" Square ");
		// TODO Auto-generated method stub
		
	}
	
	void message() {
		System.out.println("네모네모~~");
	}
	
}

class Circle extends Style_88{

	@Override
	void draw() {
		System.out.println("원을 그립니다.");
		// TODO Auto-generated method stub
		
	}

	@Override
	void print() {
	   System.out.println("Circle ");
		// TODO Auto-generated method stub
		
	}

	void message() {
		System.out.println("동글동글~~");
	}	
	
}

class Triangel extends Style_88 {

	@Override
	void draw() {
		System.out.println("삼각형을 그립니다.");
		// TODO Auto-generated method stub
		
	}

	@Override
	void print() {
		System.out.println("Triangel");
		// TODO Auto-generated method stub
		
	}
	
	void message() {
		System.out.println("세모세모~~");
	}	
	
}


public class Style_2 {
	
    public static void main(String[] args) {
    	
    	Square obj_1 = new Square();
    	Circle obj_2 = new Circle();
    	Triangel obj_3 = new Triangel();
    	
    	obj_1.draw();
    	obj_1.print();
    	obj_1.message();
    	
    	obj_2.draw();
    	obj_2.print();
    	obj_2.message();
    	
    	obj_3.draw();
    	obj_3.print();
    	obj_3.message();
    	
    	
    	System.out.println("========================================");
    	
    	Style_88 ooo_1 = new Square();  //형변환이 가능하다
    	ooo_1.draw();
    	ooo_1.print();
    	ooo_1.message();
    	
    	ooo_1 = new Circle(); //이름이 같지만 new를 해주니까 해주는대로 값이 전달된다..? (써클에서 해주면 써클값이 나오고,, 스퀘어 값을 전달하면 스퀘어 값이 나오고)
    	ooo_1.draw();
    	ooo_1.print();
    	ooo_1.message();
    	
    	ooo_1 = new Triangel();
    	ooo_1.draw();
    	ooo_1.print();
    	ooo_1.message();
		
	}

}
