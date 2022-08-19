package ja_0729;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSet_1 
{
	public static void main(String[] args)
	{
		
		//TreeSet set = new TreeSet(); //오름차순
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder()); //내림차순
		
		/*HashSet과는 달리 TreeSet은 이진 탐색 트릭(BinarySearchTree) 구조로
		 * 이루어져 있습니다. 이진 탐색 트리는 추가의 삭제에는 시간이 조금 더 걸리지만
		 * 정렬, 검색에 높은 성능을 보이는 자료구조입니다.
		 * 그렇기에 HashSet보다 데이터의 추가와 삭제는 시간이 더 걸리지만
		 * 검색과 정렬에는 유리합니다.
		 * TreeSet은 데이터를 저장할 시 이진탐색트리(BinarySearchTree)의 형태로
		 * 데이터를 저장합니다.
		 */
		
		int[] score = {75, 48, 66, 93, 37, 55, 10, 75, 63, 84};
		
		for (int i = 0; i < score.length; i++) 
		{
			set.add(new Integer(score[i]));
			
			
		}
		
//		System.out.println("65보다 작은 값 : " + set.headSet(new Integer(65)));
//		System.out.println("65보다 큰 값 : " + set.tailSet(new Integer(65)));

		System.out.println("65보다 큰 값 : " + set.headSet(new Integer(65)));
		System.out.println("65보다 작은 값 : " + set.tailSet(new Integer(65)));		
		
		
	}

}
