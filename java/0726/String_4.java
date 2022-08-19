package ja_0726;

import java.util.Iterator;

public class String_4 {
	public static void main(String[] args) {
		
		int i;
		
		String str = "2022 WorldCup Korea";
		
		System.out.println("정상 문자열 : " + str);
		System.out.print("문자열 뒤집기 : ");
		
	    for(i = str.length() -1 ; i >= 0; i--) {
	    	System.out.print(str.charAt(i));
			
		}
	    
	    System.out.print("\n 짝수 문자열 : ");
	    
	    for(int j = 0 ; j < str.length() ; j++){  //열은 0부터 시작하니까 짝수가 아닌 배열이 결국 짝수인 것
	     if(j % 2 != 0) {
	    	 System.out.print(str.charAt(j));			
		} else {
			System.out.print(" ");
		}
		
	}

	}
}
