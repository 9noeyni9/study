package ja_0721;

public class MyPackage_33 {

	
	String weather;
	int tem;


	public MyPackage_33(String w, int t) {

//		this.weather =weather;
//		this.tem = tem;   //매개변수 값,, 잘 생각해보기
	    weather = w;
	    tem = t;
		
	}

	public void message(String str)
	{
		System.out.println("지금은 : " + weather + " 기온은 : " + tem );
		System.out.println("오늘 날씨는 " + str);
		System.out.println("오늘 날씨는 " + str);
		System.out.println("오늘 날씨는 " + str);
		System.out.println("오늘 날씨는 " + str);
		System.out.println("오늘 날씨는 " + str);
	}

	public void print(String name , boolean nat) {
		System.out.println("이름은 : " + name );
		if (nat) {
			System.out.println("한국사람입니다.");
			
		}
		else {
			System.out.println("한국 사람이 아닙니다.");
		}
	}
}
