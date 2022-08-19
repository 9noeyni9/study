package ja_0728;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_1
{
	public static void main(String[] args) 
	{
		
		int time = 10;
		Queue<Integer> qq = new LinkedList<>();
		
//		for(int i =0; i<time; i++)
//		  {
//		     qq.add(i);
//		  }   //add()나 offer()나 똑같다.
		  
		
		for (int i = 1; i < time ; i+=2) 
		{
			qq.offer(i);
			
		} 
		System.out.println(qq.peek() + " aaa");
		System.out.println(qq);
		/*
		 * 큐 안에 넣을 떄에는 Queue명.offer(값);
		 * 큐에서 값을 빼낼 때에는 Queue명.poll();
		 */
		
		while(!qq.isEmpty()) //안 비어져 있으면 돌아라~~ (비어있다면 멈춰)
		{
			System.out.println(qq.poll() + " aaa");
			//System.out.println(qq.remove() + " 333"); //poll()대신 remove()를 써도 돼!
			
			System.out.println(qq);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
