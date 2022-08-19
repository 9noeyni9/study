package ja_0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionPr_1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			try {
				
				System.out.println("첫번째 값을 입력하세요 ! ");
				int num1 = Integer.parseInt(input.readLine());
				
				System.out.println("두번째 값을 입력하세요 ! ");
				int num2 = Integer.parseInt(input.readLine());
				
				System.out.println(" " + num1 + "/" + num2 + "=" + (num1/num2));
			
			} catch(NumberFormatException e) {
				System.err.println("숫자를 입력하세요.");
				System.out.println(e.getMessage());
			}catch (ArithmeticException e) {
				System.out.println("몫이 0이 될 수 없습니다.");
				System.out.println(e.getMessage());
				
			} catch (Exception e) {
				System.out.println("Exception이 발생하였습니다.");
			} finally {
				System.out.println("\n 항상 실행되는 내용 \n");
			}
		}
		
	}

}
