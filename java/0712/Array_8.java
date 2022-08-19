package ja_0712;

import java.util.Iterator;

public class Array_8 {
	public static void main(String[] args) {
		
		int[] score = { 83,64,35,97,58,73 };
		
		  int max = score[0];
		  int min = score[0]; // 초기값을 설정한다고 생각하기
		  
		  for (int i = 1; i < score.length; i++) {
			
			  if (score[i]>max) {
				  
				  max = score[i];	
			  }

			 if (score[i]<min) {
				
				 min = score[i];
			}
			
				  
			
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		}
		
	}


