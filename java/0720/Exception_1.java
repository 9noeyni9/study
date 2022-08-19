package ja_0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			try {
		
			System.out.print("첫번째 값을 입력하세요 !  ");
			int num1 = Integer.parseInt(input.readLine());
			
			System.out.print("두번째 값을 입력하세요 !  ");
			int num2 = Integer.parseInt(input.readLine());		
			
				System.out.println(" " + num1 + "/" + num2 + "=" + (num1/num2));
			}catch (NumberFormatException e) {
			 System.err.println("숫자를 입력하세요.");
			 //e.printStackTrace();
			 System.err.println(e.getMessage());			 
			}catch (ArithmeticException e) {
			 System.err.println("몫이 0이 될 수 없습니다."); 
			 System.err.println(e.getMessage());
           	}catch (Exception e) {
			 System.err.println("Exception이 발생하였습니다."); //캣치블록이 여러개라면 상위에 있는 캣치블럭은 가장 아래에 있어야 해 왜냐면 상위에 더 큰 범위의 에러를 잡는 캣치가 미리 다 잡아버리니까
			}finally {
				System.out.println("\n 항상 실행되는 내용\n");
			}
			
			
		
	}
	}
}
    

