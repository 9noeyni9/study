package ja_0720;


public class Exception_3 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(34 / 0);
			System.out.println(4);
			}catch (NumberFormatException e) {  
				//catch (ArithmeticException e) {    // Arithmetic이라면 에러가 여기서 잡히지만
				e.printStackTrace();
				System.out.println(5);
			}catch (Exception e) {   // Arithmetic이 아닌 NumberFormat이라면 여기서 잡혀
				System.out.println(e.getMessage()); 
				System.out.println(6);
			}finally {   //필수는 아니지만,,마무리 멘트,,?라고 생각하면 돼!
				
				System.out.println(7);
				System.out.println(8);
			}
		
		
		

	}
}
