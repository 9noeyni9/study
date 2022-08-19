package ja_0720;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;  //한꺼번에 import하는 방법 : ctrl + shift + o // 두글자 쓰고 ctrl + space바 >>관련키워드 나옴 

public class FileException_1 {

	public static void main(String[] args) {
		
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream("error_11.log", true); //true는 누적 저장 , false는 마지막 데어터만 저장
			ps = new PrintStream(fos);
			
			//System.out.println(ps);
			System.setOut(ps);
			
			System.out.println(11);
			System.out.println(22);
			System.out.println(33);
			System.out.println(0 / 0);  //예외 발생     
			System.out.println(44);
			
		} catch(Exception e) {
			System.out.println(55);
			
			System.err.println("===================================");
			System.out.println("예외 발생 시간 : " + new Date());
			
			e.printStackTrace();
			System.err.println("예외 메시지 : " + e.getMessage());
			System.err.println("==================================");
			System.out.println(66);
			
		}
		System.out.println(77);
		
		
		
		
	}
}
