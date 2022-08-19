package ja_0720;

public class ExceptionPr_2 {

	public static void main(String[] args) {
		
		int number = 100;
		int result = 0;
		
		for (int i = 0; i < 10 ; i++) {
			
			try {
				result = number/(int)(Math.random()*10);
				
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			System.out.print(result + "\t");
		}
	}
}
