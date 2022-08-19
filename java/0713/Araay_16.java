package ja_0713;

public class Araay_16 {
	
	public static void main(String[] args) {
		
		
		int[] ff = {55,77,444}; // new int[] {55,77,444};이렇게 써도 되고 int 생략해도 돼
		
		System.out.println("main() 11 :" + ff[2]);
		
		change(ff); //메소드 호출 여기는 이름을 부여해주는...?
		change(ff); //메소드 호출
		
		System.out.println("After change(ff) ~~~~");
		System.out.println("main() 22 : " + ff[2]);
	}
	
	private static void change(int[] yy) { //메소드 정의 yy는 받는 쪽이라 배열을 선언만 해주면 돼 그래서 이름은 뭐로 해도 상관없어

		yy[2] =787878; //여기서 yy는 ff의 2번을 바꾼거야 이름은 상관없고 배열 형식은 일치해야해 인트로 주면 인트로 받아야 함
		System.out.println("change() : yy[2] = " + yy[2]);
}
}
