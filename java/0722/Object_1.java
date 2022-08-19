package ja_0722;

class King //extends Object 얘네는 안 써도 있는거야 모든 클래스는 Object를 상속받고 있으니까
{
	
	String kbs;
	
	public King() {
	}
	public King(String kbs) {
		this.kbs = kbs;
	}
	
	public String toString() {
		return  "비가 오는 금요일 ~~~";
	}
}

public class Object_1 {
	public static void main(String[] args) {
		
		King obj = new King();
		
		King obj_1 = obj;
		King obj_2 = new King();
		
		
		
		System.out.println("클래스 이름 : " +obj.getClass());
		System.out.println("해쉬 코드 : " +obj.hashCode()); //해쉬코드 확인은 같은 객체인지 확인하려는 것
		System.out.println("해쉬 코드 : " +obj_1.hashCode());//obj와 obj_1이 값이 같은 이유는 obj를 통해 전달 받았으니까(같은 객체)
		System.out.println("해쉬 코드 : " +obj_2.hashCode());
		System.out.println("객체 문자열 : " +obj.toString());
		System.out.println("객체 문자열 : " +obj);  //toString을 쓰나 안 쓰나 똑같은 결과값 출력
		
	}
}
