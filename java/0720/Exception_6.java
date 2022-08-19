package ja_0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_6 {
	//public static void main(String[] args) throws Exception { //throw Exception 해주면 간단하게 모든 예외 가능하긴 함!
	public static void main(String[] args) throws NumberFormatException, ArithmeticException, IOException  {
	
		/*
		 * try {
		 * 
		 * 
		 * input();
		 * 
		 * } catch (ArithmeticException e) { //System.out.println(e.getMessage());
		 * e.printStackTrace();
		 * 
		 * } catch (IOException e) { //System.out.println(e.getMessage());
		 * e.printStackTrace();
		 * 
		 * } catch (NumberFormatException e) { //System.out.println(e.getMessage());
		 * e.printStackTrace(); }
		 */  //1.try~catch 방법
		
		input();  //위에 주석 지우면 얘도 필요없어 2.throws Exception방법
		
	}
	//public static void input() throws Exception {
	public static void input() throws ArithmeticException, IOException, NumberFormatException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("첫 번쨰 값을 입력하세요 => ");
			int num1 = Integer.parseInt(in.readLine());
			
			System.out.println("두 번쨰 값을 입력하세요 => ");
			int num2 = Integer.parseInt(in.readLine());	
			
			dividing(num1, num2);
		}
	}
	//public static void dividing(int num1, int num2) throws Exception {
	public static void dividing(int num1, int num2) throws ArithmeticException {
		System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
	}
}

// 예외처리는 1. try~catch해주거나 2. throws Exception 해주기
