package ja_0721;

public class MyPackage_22 {

	String name;  //멤버변수
	
	
	
	public String getName() {  //getName()
		return name;
	}



	public void show(String str) {   //show메소드 호출
	
		name = str;
		System.out.println("show() 메소드 호출 !!");
		System.out.println("show() 메소드 호출 !!");
		
	}
	
	public void print(String name, boolean sex) {
		System.out.println("나의 이름은 : " + name);
		if(sex) {
			System.out.println("여자입니다.");
		}
		else {
			System.out.println("남자입니다.");
		}
	}
}
