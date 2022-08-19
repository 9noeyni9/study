package ja_0726;

public class String___5 {

	public static void main(String[] args) {
		String[] joomin = { "800323 1523645", "821011 2523645",
                "840216 2524445", "861203 1523645",
                "840216 3524445", "861203 4523645",
                "840216 90524445", "861203 4523645",
                "870917 2553645", "980325 2453544"}; //여자인지 남자인지 charAt사용해서 구해봐
		System.out.println("*************분류 전**************");
		for (int i = 0; i < joomin.length; i++) {
			System.out.println(joomin[i] + "\t");			
		}
		System.out.println("*************분류 후***************");
		
		for (int i = 0; i < joomin.length; i++) 
		    {
			if (joomin[i].charAt(7) == '2' || joomin[i].charAt(7) == '4') { //''이거 빼먹지마!!! *String[] joomin* 
				System.out.println(joomin[i] +  " 는 여자입니다.");
			}else if(joomin[i].charAt(7) == '1' || joomin[i].charAt(7) == '3')
			{
				System.out.println(joomin[i]+ " 는 남자입니다.");
			}else
			{
				System.out.println(joomin[i] + " 는 사람이 아닙니다.");
			}
		}
		
		
	}
}
