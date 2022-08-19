package ja_0715;

class Info {
	private String name; // 이름
	private int age;   // 나이
	private char sex;  // 성별  새성자이름과 동일, 자료가 없다..?
	private String tel;  //전화번호
	
   /*public Info() {       //디폴트를 쓰고자 하면 사용자가 직접 만들어줘야해
		
	}
	*/
	
	public Info(String n, int a, char s, String t) { //생성자 (매개변수가 있는 생성자를 하나라도 만들면 디폴트 생성자 안 만들어짐)
		name = n ; // 이름 초기화             //디폴트를 쓰고자 하면 사용자가 직접 만들어줘야해
		age = a;   // 나이 초기화
		sex = s;   // 성별 초기화
		tel = t;
	}
	
	public void display() //정보 출력 메소드
	{
		System.out.println("이름 : " + name );
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);       // 얘네는 디폴트 생성자가 없으므로 퍼블릭 부분 지우면 안돼(에러)
        System.out.println("전화번호 : " + tel);
	}
	
	
}


public class InfoExe {
	public static void main(String[] args) {
		

		Info obj1 = new Info("구인영", 29,'f', "01064851305"); //obj1초기화
		Info obj2 = new Info("라일락", 28, 'f' , "01056559898"); //obj2 초기화
		//Info obj3 =new Info() ;//(1) 위에 퍼블릭 부분 지우고 싶으면 (1),(2) 이 두 개 추가~~
		
		obj1.display();  //display() 메소드 출력
		obj2.display();
		//obj3.display();//(2)
	}

}
