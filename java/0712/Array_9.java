package ja_0712;

import java.util.Iterator;

public class Array_9 {

	public static void main(String[] args) {
		
		int[] number = new int[10];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = i;
			
			System.out.print(number[i] + "\t");
		}
		System.out.println();
		
		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 10); //0~9사이의 임의의 숫자
			
			int temp = number[0];
			number[0]=number[n];
			number[n]=temp;
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]+ "\t");
			
		}
	}
}
