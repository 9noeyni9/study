package ja_0726;

public class Sort__1 {

	public static void main(String[] args) {
		
		int[] num = {78, 66, 43, 89, 94, 54, 37}; //오름차순으로 정렬시켜
		
		System.out.println("오름차순 전~~~~~~");
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.print(num[i] + "\t");			
		}
		System.out.println();
		System.out.println("오름차순 후!!!!!!!!!!");
		
		for (int i = 0; i < num.length-1; i++) { //-1 안 해줘도 정렬은 되지만 필요하지 않은 한 번이 더 돌아
			for (int j = i+1 ; j < num.length; j++) {//윗줄 아랫줄이 숫자 비교해가면서 정렬하는 과정이야
				//+1 안 해줘도 정렬은 돼 위에랑 마찬가지로 불필요하게 추가로 더 돌아 그니까 이게 포인트야 어렵다 ㅠ

         if(num[i]>num[j]) { //오름차순  <이면 내림차순
        	 int temp = num[i];
        	 num[i] = num[j];
        	 num[j] = temp;
        			 
         }
		
		
	}
}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}		

	}
}




//for (int i = 0; i < num.length-1; i++) { //-1 안 해줘도 정렬은 되지만 필요하지 않은 한 번이 더 돌아
//	for (int j = i+1 ; j < num.length; j++) {//윗줄 아랫줄이 숫자 비교해가면서 정렬하는 과정이야		
//
// if(num[i]>num[j]) { //오름차순  <이면 내림차순
//	 int temp = num[i];
//	 num[i] = num[j];
//	 num[j] = temp;
//			 
// }   이 정렬식 꼭 외워둬야해! 시험 많이 나와~!~!~!~!!!