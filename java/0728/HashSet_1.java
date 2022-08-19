package ja_0728;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet_1 //순서 없고, 중복 허용 안되지만 타입이 다르면 중복이 되는 것처럼 보여
{
	public static void main(String[] args) 
	{
		
		Object[] obj = { "1", new Integer(1), "1", "4", "4", "2", "2", "3", "3", "4", "4"}; //숫자 1과 문자 1
		
		Set sett = new LinkedHashSet();
		
		for (int i = 0; i < obj.length; i++) {
			sett.add(obj[i]);
		}
		
		System.out.println(sett);
		
		
	}

}
