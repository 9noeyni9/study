package ja_0715;

class SuperTV
{
	boolean power;
	int channel;
	int volumn;
	
	void power_1() {
		power = !power;  // false면 true로 나오고 true 라면 false나옴
	}
	
	void channelUP() {
		channel++;
	}
	
	void channelDown() {
		channel--;
		
	}
	
	void volumeUp() {
		volumn++;
	}
	
	void volumeDown() {
	    volumn--;
}
}
class MyTV extends SuperTV{
	
	void displayCaption(String str)
	{
		if (power) {    //참이라면 실행해~
			System.out.println(str);
		}
	}
}



public class SuperTest_2 {
	public static void main(String[] args) {
		
		MyTV myTV  =new MyTV();
		
		myTV.channel =9;
		myTV.channelUP();
		myTV.channelUP();
		myTV.channelUP();
		myTV.channelUP();
		myTV.channelDown();
		myTV.channelDown();
		myTV.channelDown();
		
		
		myTV.volumn = 29;  //여기서 값을 안 주면 0에서 시작 맨 처음에 초기화 시켰기 떄문에!
		myTV.volumeDown();
		myTV.volumeDown();
		myTV.volumeDown();
		myTV.volumeDown();
		myTV.volumeDown();
		myTV.volumeDown();
		myTV.volumeUp();
		myTV.volumeUp();
		myTV.volumeUp();
		
		System.out.println(myTV.channel);
		System.out.println(myTV.volumn);
	
		
		myTV.displayCaption("아름다운 강산");  //얘가 안 나오는 이유는 power기본값이 false기 때문
		
		myTV.power_1();
		
		myTV.displayCaption("시원한 여름 바람");
		
		
		myTV.power_1();
		
		myTV.displayCaption("신나는 금요일~!~!!~!!!");		
		
	}

}
