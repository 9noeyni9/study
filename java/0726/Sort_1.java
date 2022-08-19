package ja_0726;

import java.util.Iterator;

public class Sort_1 {
	public static void main(String[] args) {
		
		String[] eng = { "사람", "자바", "Love", "LOVE", "愛"};
		

		
		System.out.println("\n ************* 정렬전 문자열 *************\n");
		
		for (int i = 0; i < eng.length; i++) {
			System.out.print(eng[i] + "\t");
		}
		
		System.out.println("\n \n ************* 정렬후 문자열 *************\n");
		
		for (int i = 0; i < eng.length-1; i++) {
			for (int j = i; j < eng.length; j++) {
				
				//if (eng[i].compareTo(eng[j])<0 ) { //내림차순
			    if (eng[i].compareTo(eng[j])>0 ) {	 //오름차순				
					
					String temp = eng[i];
					eng[i] = eng[j];
					eng[j] = temp;
					
				}
			}
		}
		
		for (int i = 0; i < eng.length; i++) {
			System.out.print(eng[i] + "\t");
		}
	}

}
