package ja_0714;


class Method_1
{
	double x;
	double y;
	
	
	public Method_1(double a, double b) { //생성자 (생성자도 메소드의 일종)
	    x = a;
		y = b;  // 만약 x=x로 y=y로 두며 안되나? 그냥 두면 안돼 (this.x=x, this.y=y) 이렇게 두면 변수로도 사용가능
	}
	
	public double add()   //멤버 메소드
	{
		return (x + y);
	}

	public double sub()   //멤버 메소드
	{
		return (x - y);
	}

	public double mul()   //멤버 메소드
	{
		return (x * y);
	}

	public int div()   //멤버 메소드
	{
		return ((int)(x / y));
	}	
}

public class Method_Test {
	public static void main(String[] args) {
		
		Method_1 obj = new Method_1(34.567, 676.3422);
		
		double abc = obj.add();
				
	    System.out.println("더하기 : " + obj.add()); //힢공간에 만들어짐,,?
	    System.out.println("더하기 : " + abc);
	    
		double def = obj.sub();
		
	    System.out.println("빼기 : " + obj.sub()); //힢공간에 만들어짐,,?
	    System.out.println("빼기 : " + def);	
	    
		double ghi = obj.mul();
		
	    System.out.println("곱하기 : " + obj.mul()); //힢공간에 만들어짐,,?
	    System.out.println("곱하기 : " + ghi);		    
	    
		int jkl = obj.div();
		
	    System.out.println("나누기 : " + obj.div()); //힢공간에 만들어짐,,?
	    System.out.println("나누기 : " + jkl);		    
	}

}
