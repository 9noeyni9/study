package ja_0726;

public class String_8 {
	public static void main(String[] args) {
		
		String str = "몇 개의 단어가 포함되어 있나요!";
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == 32) { // 스페이스바 아스키코드 =32 16진수로는 20  
			//if (str.charAt(i) == ' ') { // 이것도 가능!
				count++;			
			}
			
		}
		System.out.println("단어의 갯수 : " + (count +1) + " 개"); //+1해주는 이유는 스페이스바를 기준으로 단어를 카운트 했기 때문!
	}

		
	}

