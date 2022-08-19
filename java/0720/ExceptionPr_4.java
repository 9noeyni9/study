package ja_0720;

import java.io.FileNotFoundException;

public class ExceptionPr_4 {

	public static void main(String[] args) {
		
		try { 
			
			System.out.println("========================예외 발생 전============================");
			throw new FileNotFoundException("IO => 입출력 예외 발생 ~~~~");
			
		} catch (NumberFormatException e) {
			System.out.println("내가 만든 예외 22222 !!!!!!");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("내가 만든 예외 3333 !!!!!");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("내가 만든 예외 4444 !!!!!");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
