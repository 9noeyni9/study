package ja_0722;

import ja_0721.MyPackage_22;
import ja_0721.UserPackage_11;
import ja_0721.MyPackage_33;  // 다른 패키지 안에 파일에 내용을 클릭으로만 실행시킬 수 있다

public class MyTest_1 {

	
		public static void main(String [] args) {
			UserPackage_11 obj_1 = new UserPackage_11("korea",45 );
			MyPackage_22 obj_2 = new MyPackage_22();
			MyPackage_33 obj_3 = new MyPackage_33("summer", 32);
		
			
			
			obj_1.message("아름다운 사람");
			obj_1.message("즐거운 하루~~~");
			
			
			obj_2.show("화려한 금요일");
			//System.out.println(obj_2.getName()); //얘가 여기 오면 화려한 금요일 호출 가능
			
			obj_2.show("싱그러운 바람");  
			
			obj_3.message("무더운 여름 날씨");
			obj_3.message("해 쨍쨍 ~~~~");
			
			String abc = obj_2.getName();   //값 받기 위해서 변수로 만들어준 것
			obj_2.getName();  //getName의 마지막 값만 갖게 됨
			//여기까지는 프린트 안되고 값만 받은 거야
			//get은 가져오겠다 set은 바꾸겠다,값삽입

		    System.out.println("abc = " + abc); //getName의 첫번째 값 프린트 한 것 //다른 클래스의 있는 값을 import해서 쓸 수 있다.
			
			System.out.println(obj_2.getName());
			System.out.println(obj_2.getName()); //얘네가 프린트해~~
			

		    
		    obj_2.print("kbs", true);
		    obj_3.print("구인영",true);
		}
	}

