package ja_0719;

public class SuperTest_1 {

	public static void main(String[] args) {
		
		Child obj_1 = new Child();
		
		obj_1.message();
				
				
		
	}
}


class Parent 
{
	int x = 888;
}

class Child extends Parent
{
	int x = 3456;
	//int xx = 3456; // 이렇게 바꿔주면 중복이 아니기 때문에 x값 출력은 슈퍼클래스 x뿐이니까 super값이 나옴  
	void message()
	{
		System.out.println(" x = " + x);  //그냥 x는 본인 값인 child 값이 나오고
		System.out.println("this.x=" + this.x); //this 역시 본인 값인 child 값
		System.out.println("super.x=" + super.x); //super는 부모 클래스에서 값이 나옴
	}
}
