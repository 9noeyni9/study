package ja_0726; //주민번호substring (_5,_7,__18 이 주민번호 사용법 비교해서 확실하게 이해하기)

public class String__18 {

	public static void main(String[] args) {
		
		String[] joomin = { "8003231523645", "98210112523645",
	                        "9406162524445", "96120312523645",
	                        "9406168524445", "96120312523645",
	                        "9909172553645", "9803232345322"};
		for (int i = 0; i < joomin.length; i++) {
			
			if (joomin[i].substring(6,7).equals("1") || joomin[i].substring(6,7).equals("3") ) { //서브스트링 해줄 때 우리는 7번째 숫자만 비교해주면 돼 그래서 문자열로 범위를 (6,7)로 잡아주는거야
				System.out.println(" " + joomin[i] + " 는 남남자입니다.");
			}else if (joomin[i].substring(6,7).equals("2") || joomin[i].substring(6,7).equals("4") ) {
				System.out.println(" " + joomin[i] + " 는 여자입니다.");
			}else {
				System.out.println(" " + joomin[i] + " 는 사람이 아닙니다.");
			}

			

			
		}
	
	}
}
