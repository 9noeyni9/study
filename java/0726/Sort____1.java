package ja_0726;

public class Sort____1 {

	public static void main(String[] args) {
		int[] num = {78, 66, 43, 89, 94, 54, 37}; //오름차순으로 정렬시켜
		
		for (int i = 0; i < num.length; i++) {
		  System.out.print(num[i] + "\t");
		}
		System.out.println();
		
		for (int i = 0; i < num.length-1; i++) 
		{
			for (int j = i+1 ; j < num.length; j++) 
			{
				
				if (num[i] > num[j]) //num[i]랑 num[j]가 있을 때 num[i]가 더 크면 바꿔!  정렬하면~~~~ =>오름차순
				{
				 int temp = num[i];
				 num[i] = num[j];
				 num[j] = temp;					
				}		
				
			}			
		}
		for (int i = 0; i < num.length; i++)
		{
			System.out.print(num[i] + "\t");			
		}		

		
	}
}
