package ja_0726;

import java.util.Iterator;

public class String___18
{

	public static void main(String[] args)
	{
		String[] joomin = { "800323 1523645",  "982101 2523645",
                            "940616 2524445",  "961203 1252364",
                            "940616 8524445",  "961203 1252364",
                            "990917 2553645",  "980323 2453228"};
		
		for (int i = 0; i < joomin.length; i++) {
			if (joomin[i].substring(7, 8).equals("2") || joomin[i].substring(7, 8).equals("4") ) 
			{
				System.out.println(joomin[i] + " 는 여자입니다.");
			} else if(joomin[i].substring(7, 8).equals("1") || joomin[i].substring(7, 8).equals("3") )
			{
				System.out.println(joomin[i] + " 는 남자입니다.");
			} else
			{
				System.out.println(joomin[i] +  "사람이 아닙니다.");
			}
		}
		
	}
}
