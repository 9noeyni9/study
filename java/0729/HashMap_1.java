package ja_0729;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_1 
{
	public static void main(String[] args) 
	{
		
		
		HashMap<Integer,String> map = new HashMap();//순서대로 고정은 아니야 1.인티저 인티저 가능 2.스트링스트링 가능3.인티저 스트링가능4.스트링인티저 가능
		//(key, value)
		map.put(1234,"korea");
		map.put(1111,"asdf");
		map.put(4567,"asdf");
		map.put(7890,"seoul");
		map.put(7890,"king"); //key값은 중복되지 않는다 앞에 건 기억 안 해 마지막 것만 기억해!value값은 중복 가능!
		Scanner ss = new Scanner(System.in);
		
//		map.put(1234, 345656);
//		map.put(1111,444);
//		map.put(4567,232323);
//		map.put(7890,333);
//		map.put(7890,333333); 
//		Scanner ss = new Scanner(System.in); //이거 value값 다시 String으로 바꿔봐
		
//		map.put("1234", "345656");
//		map.put("1111","444");		
//		map.put("4567","232323");
//		map.put("7890","333");
//		map.put("7890","333333"); 
//		Scanner ss = new Scanner(System.in); //이거 value값 다시 String으로 바꿔봐		
		
		while(true)
		{
			System.out.println("id와 password를 입력해 주세요 !!");
			System.out.println("id : ");
			int id = ss.nextInt();
			
			if (!map.containsKey(id))
			{
				System.out.println("입력하신 " + id + " 는 존재하지 않습니다. 다시 입력해 주세요 ");
				continue; //아이디 없으면 다시 위에 아이디 입력창으로 가는 것
				
			}
			else //아이디 일치하면 넘어가
			{
				System.out.println("password : "); 
				String password = ss.next().trim(); // *문자열에서!* trim은 보이지 않는 공백을 없애줘 문자열에서야 숫자는 필요없어~~~
				System.out.println();

//				if(!( id == Integer.parseInt(password )))
//				if(!(map.get(id) == password))
				if (!(map.get(id).equals(password)))
				{
					System.out.println(map.get(id));
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요 !!!");
					
				}
				else 
				{
					System.out.println("축하합니다. 로그인 하였습니다.");
					break;
				}
			}
		}

	}
}
