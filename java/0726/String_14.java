package ja_0726;

public class String_14 {

	public static void main(String[] args) {
		
		String str = "높이 나는 새가 멀리 본다. 일찍 일어나는 새가 모이를 줍는다.";
	    System.out.println("검색할 문자열 : \n" + str);
	    System.out.println("indexOf(새) : "+ str.indexOf("새"));
	    System.out.println("indexOf(새,10) : " + str.indexOf("새",10));
	    //인덱스 10번부터 새를 찾겠다
	    System.out.println("lastIndexOf(새) : " + str.lastIndexOf("새"));
	    System.out.println("lastIndexOf(새,10) : " + str.lastIndexOf("새",10));
	    //인덱스 끝에서 10번부터 새를 찾겠다
	}
}
