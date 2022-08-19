package ja_0720;

class KooException extends Exception
{
	public KooException(String str) {
		super(str);
		
	}
}

public class UserExceptionTest {

	public static void main(String[] args) {
		
		int abc = 33;
		
		try {
			if (abc % 5 != 0) {
				throw new KooException("나의 전용 예외~~~~~");				
			}
		} catch (KooException e) {
			
			System.out.println("나도 예외로 동작합니다. !@@@@@@@@@@@");
			System.err.println("나도 예외로 동작합니다. !@@@@@@@@@@@");
			e.printStackTrace();
		}
		
		
		
	}
}
