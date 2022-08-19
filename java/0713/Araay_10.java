package ja_0713;

public class Araay_10 {
	public static void main(String[] args) {
		
		int[][] var  = new int [3][];  //가변 배열 (앞쪽은 비우면 안돼 마지막 하나만 비울 수 있어 행 3으로 채워졌어)
		
		int i,j,k = 0;
		
		var[0] = new int[3];
		var[1] = new int[2];
		var[2] = new int[4];
		
		//초기값 입력
		
		
		for ( i = 0; i < var.length; i++) {  //초기에 인트 값을 설정해줬다?? 그럼 포문에서 인트 안 쓰는 거고 안 설정했으면 써야 하고~~~~
			for ( j = 0; j < var[i].length; j++) {
				var[i][j]= ++k;//++k랑 k++랑 차이 직접 확인해보기
			}
		}  //여기서는 값을 담았고
		
		//출력
		
		for ( i = 0; i < var.length; i++) {
			for (j = 0; j < var[i].length; j++) {
				System.out.print(var[i][j]+"\t");
			}  //여기서 출력한거야
			System.out.println();
		}
	}

}
