package ja_0718;


class AA_4 
{
	//fina void display(){  //파이널이 붙으면 오버라이딩 하지 못하고 파이널 빼면 오버라이딩 가능
  void display()  
	{
	 System.out.println("재정의 불가 메소드 ~~~~~");	
	}
}

class BB_4 extends AA_4
{
	void display()
	{
	 System.out.println("재정의 한 메소드 display() @@@@@ ");	
	}	 
}

public class FinalMethod_1 {
	public static void main(String[] args) {
		
		BB_4 obj_1 = new BB_4();
		
		obj_1.display();
	}

}
