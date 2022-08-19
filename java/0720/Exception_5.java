package ja_0720;

public class Exception_5 {

	public static void main(String[] args) {
		
		try {
			Exception obj = new Exception("고의로 만든 예외 발생");
			throw obj;
			//throw new Exception("고의로 만든 예외 발생"); //위에 두 줄을 이렇게 한줄로도 표현 가능
			
		} catch (Exception e) {
			System.err.println(" 내가 만든 예외 ~~~~");
			e.printStackTrace();
		}
 		// 구인영 보시오
		// 소희가 현질이 필요하다 하오
		// 2만원짜리가 필요하오
		// 구글플레이스토어는 수수료도 10프로 떼니
		// 소희에게 22000원을 건네주시오
		// - 양기석 강사님
		
	}
}
