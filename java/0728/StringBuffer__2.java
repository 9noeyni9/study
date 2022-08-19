package ja_0728;

public class StringBuffer__2 { 
	/*1. "Java"와 " program" 을 같이 출력해주세요
	 * 2.합친 문자열 charAt을 이용해서 반전시켜 주세요
	 * 3. 두 단어 사이의 *을 삽입해주세요(insert 이용)
	 * 4. 그 후 문자열의 길이 구해주세요
	 * 5. *까지만 적용해주세요
	 * 6. 적용한 후에 문자열 반전시켜주세요
	 */

	public static void main(String[] args)
	{
		StringBuffer stbf = new StringBuffer("Java");
		
		stbf.append(" program");
		System.out.println(stbf);
		
		for (int i = 0; i < stbf.length(); i++) {
			
			System.out.print(stbf.charAt(i) + "\t");
		}
		System.out.println();
		
		for (int i= stbf.length()-1;i>= 0 ; i--) {

			System.out.print(stbf.charAt(i) + "\t");
		} //for문은 반복문인 걸 다시 한 번 기억해!!!!!!!!!
		
		stbf.insert(4, "*");
		
		System.out.println();
		System.out.println(stbf);
		
		System.out.println("문자열의 길이는 : " + stbf.length());
		
		stbf.setLength(5);
		
		System.out.println("새로운 문자열의 길이는 : " +stbf);
		
		System.out.println("다시 한 번 반전~~~ : " +stbf.reverse());
		
		
		
		
		
		
		
	}
}
