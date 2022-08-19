package ja_0726;

public class String__5 {

	public static void main(String[] args) {
		

		String[] joomin = { "8003231523645", "8210112523645",
	                        "8402162524445", "8612031523645",
	                        "8402163524445", "8612034523645",
	                        "84021690524445", "8612034523645",
	                        "8709172553645", "9803252453544"}; //여자인지 남자인지 charAt사용해서 구해봐
		
		System.out.println();
		
		for (int i = 0; i < joomin.length; i++)
		    {
			  if (joomin[i].charAt(6) == '2' || joomin[i].charAt(6) == '4')
			  {
				System.out.println(joomin[i] + " 는 여자입니다.");
			  }else if(joomin[i].charAt(6)=='1' || joomin[i].charAt(6)=='3')
			  {
				  System.out.println(joomin[i] +" 는 남자입니다.");
			  }else
				  System.out.println(joomin[i] + "는 사람이 아닙니다.");	
			
			
		}
	}
}
