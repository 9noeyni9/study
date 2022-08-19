package ja_0719;


class ParentPr
{
	int x = 907;
}

class ChildPr extends ParentPr
{
	int x = 1002;
	
	void message()
	{
		System.out.println("x의 값 : " +x);
		System.out.println("this.x 의 값" + this.x);
		System.out.println("super.x의 값" + super.x);
	}
	
}

//인영언니 보시오
//
//이 글을 읽는다면 옆자리 앉은 소희와 은아에게 
//용돈을 주시오.
//
//만원이면 될 것 같소.
//
//미리 고맙소.
//
//ㅡ김소희


public class SuperPr_1 {

	public static void main(String[] args) {
		
		ChildPr obj = new ChildPr();
		
		obj.message();
		
	}
}

