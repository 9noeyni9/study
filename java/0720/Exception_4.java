package ja_0720;  //throw는 사용자가 직접 예외를 발생시키는 것

import java.io.FileNotFoundException;

public class Exception_4 {

	public static void main(String[] args) {
		
		try {
			System.out.println("====================예외 발생 전 ========================");
			//throw new NumberFormatException("IO => 입출력 예외 발생 ~~~~");
			//throw new ArithmeticException("IO => 입출력 예외 발생 ~~~~");
			throw new FileNotFoundException("IO => 입출력 예외 발생 ~~~~");  //FileNotFound는 여기 없는 예외니까 마지막 Exception이 잡아!
			
		} catch (NumberFormatException e) {
			System.out.println("내가 만든 예외 2222!!!!!");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		} catch (ArithmeticException e) {
			System.out.println("내가 만든 예외 3333!!!!");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}catch (Exception e) {
			System.out.println("내가 만든 예외 4444!!!!");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}
}
