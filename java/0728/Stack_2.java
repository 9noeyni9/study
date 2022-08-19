package ja_0728;

import java.util.Stack;

public class Stack_2
{
	
	
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	
	public static void main(String[] args) 
	{
		
		goURL("1.Google");
		goURL("2.Daum");
		goURL("3.Nate");
		goURL("4.Naver");
		
		printprint();
		
		goBack();
		System.out.println(" 뒤로 가기1 후~~~~");
		
		printprint();
		
		goBack();
		System.out.println(" 뒤로 가기2 후~~~~");		
		
		printprint();
		
		goForward();
		System.out.println(" 앞으로 가기 후~~~~");
		
		printprint();	
		
		goURL("5 www.korea.com");
		System.out.println(" 새로운 주소로 이동 후 ~~");
		
		printprint();
		
		
		
		
	}
	
	private static void goForward() 
	{
		if (!forward.empty())
		{
			back.push(forward.pop());
			
		}
	}
	
	private static void goBack() 
	{
		if (!back.empty())
		{
			forward.push(back.pop());
			
		}
	}	
	
	
	private static void printprint()
	{
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("현재 화면 : " +back.peek() + " 입니다."); //peek()는 현재의 포인트 위치,,,?
		System.out.println();
	}
	
	private static void goURL(String str)
	{
		back.push(str);
		if (!forward.empty()) {
			forward.clear();
			
			
			/* 데이터를 추가하는 작업을 푸시라고 한다.
			 * (리스트에서의 애드같은 역할이다.)
			 * 
			 * 데이터를 삭제하는 작업을 팝이라고 한다.
			 * (리스트에서의 리무브와 같은 역할)
			 */
		}
	}
	

}
