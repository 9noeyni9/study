package ja_0714;



class StaticMethod //메인 클래스가 있고 그 클래스가 퍼블릭이 붙어있다면 이 부분에 퍼브릭 붙이면 안돼 
{
	
	static int kor;
	static int eng;
	static int math; //밑에 스테틱 더블이 스테틱이 아니였다면 인트 매쓰; 가능함
	
	static double average() // 얘가 스테틱이라면 밑에 토탈 값에 더해지는 각각 값도 스테틱이어야함
	{                       
		int total = kor + eng + math;
		
		return (total / 3.0);
	}
}

public class StaticMethod_11 {
	public static void main(String[] args) {
		
		StaticMethod sm =new StaticMethod();
		
		StaticMethod.kor = 70;
		StaticMethod.eng = 50;
		StaticMethod.math = 100;  // StaticMethod대신 sm이라면 바로 위에 각주처리한 부분 써줘야 함
		
		System.out.println(" 평균 = " + sm.average()); //여기도 sm
		System.out.println(" 평균 = " + StaticMethod.average());
	}

}
