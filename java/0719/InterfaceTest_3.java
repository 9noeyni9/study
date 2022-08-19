package ja_0719;  //Style_2 랑 같이 보기

interface Mbc
{
	void play()	;
}

class Kbs 
{
	void autoPlay(Mbc obj)
	{
		obj.play();
	}
}

class MySbs implements Mbc
{

	@Override
	public void play() {
		System.out.println("MySbs TV 생방송~~~~~"); //mbc를 상속받은 sbs이므로 가능 이렇기 떄문에 위에 클래스 kbs
		
	}
	
}

class MyCNN implements Mbc
{

	@Override
	public void play() {
		System.out.println("MyCnn TV 야구생중계 방송^^^^^^^");		 //mbc를 상속 받은 cnn
	}
	
}

public class InterfaceTest_3 {

	public static void main(String[] args) {
		
		Kbs obj = new Kbs();
		
		obj.autoPlay(new MySbs());
		obj.autoPlay(new MyCNN());
	}
}
