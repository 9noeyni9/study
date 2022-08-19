package ja_0726;//주민번호charAt (_5,_7,__18)

public class String_5 {
	public static void main(String[] args) {

		
		String[] joomin = { "8003231523645", "8210112523645",
				            "8402162524445", "8612031523645",
				            "8402163524445", "8612034523645",
				            "84021690524445", "8612034523645",
				            "8709172553645", "9803252453544"};
		
		System.out.println();
		
		//joomin 배열에서 남여 성별을 구하시오
		
		for (int i = 0; i < joomin.length; i++) {
			
			if (joomin[i].charAt(6)=='1' || joomin[i].charAt(6)== '3') {  //이게 핵심이었는데 charAt은 숫자 비교야
				System.out.println("  " + joomin[i] + " 는 남자입니다.");
				 
			}else if (joomin[i].charAt(6)=='2' || joomin[i].charAt(6)=='4') { // =="2"이렇게 쓰면 에러인데 이유는 2는 문자열이 아니니까 '2'가 맞아~
				System.out.println("  " + joomin[i] + " 는 여자입니다.");
				 
			}else {
				System.out.println(" " + joomin[i] +" 는 사람이 아닙니다." );
				
			}
		}

	
	}

}
