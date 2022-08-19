package ja_0718;

//final class WordProcess {
 class WordProcess {
	void Input() { }
	
	void Edit() { }
	
	void Print() { }
	
	void About() { 
	 System.out.println("A회사 개발");
	}
}
 
 class NewWordProcess extends WordProcess{
	 
	 void About() {
		 System.out.println("B회사 개발");
	 }
 }

public class Final_1 {

	public static void main(String[] args) {
		
		NewWordProcess obj = new NewWordProcess();
		
		obj.About();
	}
}
