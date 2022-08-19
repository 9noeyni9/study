package ja_0725;

public class Wrapper_6 {
	public static void main(String[] args) {
		
		Boolean bool_1 = new Boolean(true);
		Boolean bool_2 = new Boolean("345");
		Object bool_3 = new Boolean("True"); //boolean 타입이 object타입으로 형변환
		
		if (bool_1.booleanValue()) {
			System.out.println("bool_1 객체는 true 입니다.");
			
		}else {
			System.out.println("bool_1 객체는 false입니다.");
		}
		if (bool_2.booleanValue()) {
			System.out.println("bool_2 객체는 true입니다.");
			
		} else { 
		    System.out.println("bool_2 객체는 false입니다.");

		}
//		if (bool_3.booleanValue()) {  //에러 (bool_3 은 위에서 Object로 형변환 해줘서 그래)
//			System.out.println("bool_2 객체는 true입니다.");
//			
//		} else {
//		    System.out.println("bool_2 객체는 false입니다.");
//		}
		
		if (((Boolean)bool_3).booleanValue()) {    //다시 Boolean타입으로 형변환 //Object에는 .booleanValue()메소드가 없다..
			System.out.println("bool_2 객체는 true입니다.");
			
		} else {
		    System.out.println("bool_2 객체는 false입니다.");
		}		
	}

}
