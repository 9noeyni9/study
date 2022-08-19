package ja_0720;

public class ExceptionPr_3 {
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(34/0);
			System.out.println(4);
		} catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println(5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(6);
		}finally {
			System.out.println(7);
			System.out.println(8);
		}
	}

}
