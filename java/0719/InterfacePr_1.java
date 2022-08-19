package ja_0719;

interface Book{
	void reading();
}

interface Movie{
	void watching();
}

interface Music{
	void listening();
}

interface Piano extends Book, Movie, Music
{
	void playing();
}

class Hobby implements Piano {

	@Override
	public void reading() {
		System.out.println("책을 읽는다~");
		
	}

	@Override
	public void watching() {
		System.out.println("영화를 본다 !");
		
	}

	@Override
	public void listening() {
		System.out.println("노래를 듣는다 ^^^^");
		
	}

	@Override
	public void playing() {
		System.out.println("피아노를 연주한다&&&&&&");
		
	}
	
}




public class InterfacePr_1 {
	
	public static void main(String[] args) {
		
		Hobby obj = new Hobby();
		
		obj.reading();
		obj.watching();
		obj.listening();
		obj.playing();
		
	}

}
