package ja_0712;

public class Array_5 {

	
	public static void main(String[] args) {
		
		int sum =0; //인트>더블  (데이터형 일치!!)
		float average =0.0f;
		
		int [] score  = {100,88,77,56,93}; //인트>더블   {100.45,88.78,77.345,56.80,93.435}
		
		for (int i=0 ; i < score.length ; i++)
		{
			sum += score[i];
		}
		average = (float)sum/ score.length;
		
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %7.2f ", average);
	}
}
