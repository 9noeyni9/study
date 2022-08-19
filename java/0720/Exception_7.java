package ja_0720;

public class Exception_7 {

	public static void main(String[] args) {
		
//		try {
//			method_1() ;
//			}catch(Exception e) {
//				System.err.println("main() 메소드에서 예외 처리~~~");
//				e.printStackTrace();
//			}
	
		method_1();
	
	}
//	
//	private static void method_1() throws Exception{
//		
//		throw new Exception();
//	}
	
	private static void method_1() {
		
		try {
			
			throw new Exception();
		}
		
		catch (Exception e) {
			System.err.println("method_1() 메소드에서 예외 처리");
			e.printStackTrace();
		}
	}
}
