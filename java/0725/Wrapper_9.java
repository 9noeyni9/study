package ja_0725;

public class Wrapper_9 {
	public static void main(String[] args) {
		
		int ss_data = 0;
		
//		short max = Short.MAX_VALUE;
//		short min = Short.MIN_VALUE; //기본형은 값을 담을 수 있는 속성만 갖고 있는 것
		
		Short max = Short.MAX_VALUE; //속성 뿐 아니라 메소드도 갖고 있어 
		Short min = Short.MIN_VALUE;		
		
		Short ss = new Short("888");
		
		ss_data = ss.shortValue();
		
		//int sss_data = new Short("999".shortValue();
		
		System.out.println("\t ss_data : " + ss_data + ", \n\t 최대값 : " + max + ", \n\t 최소값 : " + min);
	}

}
