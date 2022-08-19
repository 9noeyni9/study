package ja_0729;

import java.util.TreeSet;

public class TreeSet_2
{
	public static void main(String[] args)
	{
		
		TreeSet<String> set = new TreeSet<>(); //오름차순 아스키코드 기준으로 대문자 먼저 그 다음 소문자
		
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("elevator");
		set.add("dzzzz");
		set.add("elephant");
		set.add("korea");
		set.add("fan");
		set.add("flower");
		set.add("d");//얘도 포함아니야
		set.add("b");//얘는 포함이야
		
		
		System.out.println(set);
		
		System.out.println("range search : from : " + from + " to : " + to ); //b에서 d까지인데 대문자 C는 포함 안돼 아스키코드 기준이니까
		System.out.println("result11 : " + set.subSet(from, to));
		System.out.println("result22 : " + set.subSet(from, to +"zzzz"));
		
		
		
		
		
	}

}
