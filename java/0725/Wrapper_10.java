package ja_0725;

public class Wrapper_10 {
	public static void main(String[] args) {
		
		Float one = new Float("237.345f"); //f 생략 하면 더블타입돼ㅜ
		Float abc  = (float)(10/3.0);
		System.out.println(" 현재      값 : " + one);
		System.out.println(" byte     값 : " + one.byteValue());
		System.out.println(" short    값 : " + one.shortValue());
		System.out.println(" int      값 : " + one.intValue());
		System.out.println(" long     값 : " + one.longValue());
		System.out.println(" float    값 : " + one.floatValue());
		System.out.println(" double   값 : " + one.doubleValue());
		System.out.println(" NaN      체크 : " + one.isNaN()); //숫자가 아니다를 판별하는 것 숫자니까 false야
		System.out.println(" 무한대    체크 : " + one.isInfinite()); //무한대 판별 무한대 아니니까 false
		System.out.println(" 무한대    체크 : " + abc.isInfinite()); //wrapper클래스를 요구하므로 float abc  = (float)(10/3.0);는 오류 Float abc  = (float)(10/3.0);이렇게 써야해
		
	}

}
