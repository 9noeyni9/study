package ja_0728;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_1  //Stack 이랑 Queue에서 뭐로 받고 어떤 걸로 출력하는지 비교해보기
{
	public static void main(String[] args) 
	{
		
		Stack stt = new Stack(); //제너릭을 안 쓰면 새로운 타입인 33도 출력 가능해 하지만 제너릭을 써주지 않으면 형변환등에서 오류발생 소지가 더 높아져
		//Stack<String> stt = new Stack<String>();		
        
		// LinkedList는 Queue 인터페이스를 구현하였다.
		
		Queue<String> qq = new LinkedList<String>();
		
		stt.push("1");  //Stack에 객체를 저장
		stt.push("2");
		stt.push("3");
		stt.push(33);
		stt.push("4");
		
		qq.offer("1"); //Queued에 객체를 저장한다 성공하면 true 실패 false
		qq.offer("2");
		qq.offer("3");
		qq.offer("4");
		
		System.out.println("============Stack============="); //먼저 들어가면 나중에 나옴
		
		while(!stt.empty())
		{
			System.out.println(stt.pop()); //Stack 의 맨 위에 저장된 객체를 꺼낸다
		}
		
		System.out.println("===============Queue==============="); //먼저 들어간게 먼저 나옴
		
		while(!qq.isEmpty())
		{
			System.out.println(qq.poll()); //Queue 에서 꺼낸다 비어있으면 예외 발생
		}
		
		
		
		
	}

}
