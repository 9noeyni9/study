package ja_0726;

public class String_6 {
	public static void main(String[] args) {
		
		String str = "나는 초보다! 자바 별거 아니네!";
		
		boolean flag = str.startsWith("나는 고수다!");  //하나 만들고 이걸로 계속 밑에서 활용하는거야
		System.out.println(flag);
		
		flag = str.startsWith("나는");
		System.out.println(flag);
		
		flag = str.endsWith("별거 아니네");
		System.out.println(flag);	
		
		flag = str.endsWith("별거 아니네!");
		System.out.println(flag);		
	}

}
