package ja_0720;

class KiyException extends Exception {
	public KiyException(String str) {
		super(str);
	}
}

public class UserExceptionPr {

	public static void main(String[] args) {
		int kkk = 89;
		
		try {
			if (kkk % 3 != 0) {
				throw new KiyException("구인영 전용 예외~~~~");
			}
		} catch (KiyException e) {
			System.out.println("예외로 동작합니다~!~!~!!!!");
			System.err.println("예외로 동작합니다~!~!~!!!!");
			e.printStackTrace();
			
		}
	}
}
