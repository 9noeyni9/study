package ja_0727;

public class StringBuffer_2  {

	public static void main(String[] args) {

		StringBuffer stbf = new StringBuffer("Java");
		System.out.println(stbf);
		
		stbf.append(" program");
		
		System.out.println(stbf);
		
		for (int i = 0; i < stbf.length(); i++)
		{
			System.out.print(stbf.charAt(i)+ "\t");
		}
		
		System.out.println();
		
		for (int i =  stbf.length()-1;i >= 0; i--) 
		{
		 	System.out.print(stbf.charAt(i) + "\t"); //charAt사용해서 반전시키기
		}
		
		stbf.insert(4, "*"); // 삽입
		
		System.out.println("\n" + stbf);
		
		System.out.println("문자열의 길이 : " + stbf.length());
		
		stbf.setLength(5);  //길이를 바꾸겠다
		
		System.out.println("새로운 문자열의 길이 : " + stbf.length());
		
		System.out.println("setLength(5) 적용 문자열 : " + stbf);
		
		System.out.println("반전 문자열 : " +stbf.reverse()); //반전시켜주는 것
		
		
	}
}
