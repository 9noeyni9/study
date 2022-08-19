package ja_0725;

class Card
{
	String kind;
	int number;
	
	Card() {
		this("SPACE", 1);
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	public String toString() {
		return "kind : " +kind+", number : " +number;
	}
}
	
	public class  CardToString {
		public static void main(String[] args) {
			
		
			Object obj_1 = new Card();
			Object obj_2 = new Card("HEART", 9);
			
			System.out.println(obj_1.toString());
			System.out.println(obj_2.toString());
			System.out.println(obj_1);
			System.out.println(obj_2);
		}
	}




