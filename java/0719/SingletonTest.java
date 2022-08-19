package ja_0719;

final class Singleton
{
	// 소프트웨어 디자인 패턴에서 싱글턴 패턴(Singleton Pattern)을 따르는 클래스는,
	// 생성자가 여러 차례 호출되더라도 실제로 생성되는 객체는 하나이고,
	// 최초 생성 이후에 호출된 생성자는 최초의 생성자가 생성한 객체를 리턴한다.
	// 이와 같은 디자인 유형을 싱글턴 패턴이라고 한다.
	// 주로 공통된 객체를 여러개 생성해서 사용하는 DBCP(DataBase Connection Pool)와 같은
	// 상황에서 많이 사용된다.


      private static Singleton ss;     // = new Singleton();
      private Singleton() {}
      public static Singleton getInstance() 
      {
    	  if (ss == null)  //null이라면 만들고
    	  {
			ss = new Singleton();
    	  }
    	  return ss; //생성된 후에는 있는 걸 그냥 써 
    	  }  
      }
   
class HelloWorld {  }




public class SingletonTest {

	public static void main(String[] args) {
		
		//singleton obj = new Singleton(); 이렇게 객체 생성 불가능 외부에서 못 만들어
		
		Singleton ss1 = Singleton.getInstance(); // 못 만드니까 getInstance(); 사용해서 만들자 위에 if문
		Singleton ss2 = Singleton.getInstance();
		
		System.out.println("Singleton 객체 ss1 hashCode " + ss1.hashCode());  //주소
		System.out.println("Singleton 객체 ss1 hashCode " + ss1);             //패키지명 클래스명 주소값(숫자는 16진수로 표현돼)
		System.out.println("Singleton 객체 ss2 hashCode " + ss2.hashCode());  //ss1와 ss2의 주소값이,,,같다 하나의 객체를 공유 object 속에 존재 모든 객체 사용 가능
		System.out.println("Singleton 객체 ss2 hashCode " + ss2);
		
		System.out.println("================================================");
		
		HelloWorld hh1 = new HelloWorld();
		HelloWorld hh2 = new HelloWorld();
		
		System.out.println("HelloWorld 객체 hh1 hashCode : " + hh1.hashCode());
		System.out.println("HelloWorld 객체 hh1 hashCode : " + hh1); //주소값 : 16진수 객체마다 고유한 값을 갖는다
		System.out.println("HelloWorld 객체 hh2 hashCode : " + hh2.hashCode());
		System.out.println("HelloWorld 객체 hh2 hashCode : " + hh2); 
	}
}
