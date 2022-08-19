package ja_0729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine_1 
{
	
	public static void main(String[] args) throws IOException //강제 사항 반드시 해야해
	{
		
		String name = null;
		String addr = null;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		/*BufferedReader 클래스의 객체 reader를 생성합니다.
		 * System.in.read()는 한문자씩 바이트로 입력받기 때문에
		 * 문자열로 변형해야 합니다.
		 * InputStreamReader 클래스는 바이트 단위 입력 스트림을 문자 단위 입력 스트림으로
		 * 변형합니다. 문자열을 효울적으로 처리하기 위해 BufferedReader클래스의 객체를
		 * 이용하면 사용자가 입력한 문자열을 쉽게 입력 받을 수 있습니다.
		 * 문자열을 입력 받기 위해 BufferedReader 클래스를 사용합니다.
		 */
		
		System.out.println("이름을 입력 하세요 ! ");
		name = reader.readLine();
		
		System.out.println("주소를 입력하세요 !! ");
		addr = reader.readLine();
		
		System.out.println(name + " 님 반갑습니다. 당신은 " + addr + " 에 살고 있군요 !");
				
		
		
		
	}

}
