package ja_0713;


 
public class MyTV {
	public static void main(String[] args) {
		
		
		   TV   ttvv ;  // 스텍영역에 레퍼런스 변수  ttvv을 위한 공간이 마련된다.
		   
		   ttvv = new TV(); // new에 의한 인스턴스 생성이란 필드,메소드 값들을 저장할 수 있는 별도의 공간을 heap영역에 배당받는 것을 의미한다.
		                    // 참조 변수는 생성된 인스턴스 주소를 저장하기 위해 스텐 영역에 메모리를 할당하낟.
		   
		   TV ttvv2 = new TV(); //위에 두 줄 여기 한 줄로 표현 가능
		   
		   ttvv.spower();
		   ttvv2.spower();
		   
		   
		   ttvv.channel=7;
		   ttvv2.channel=11;
		   
		   
		   ttvv.channelUp();
		   ttvv.channelUp();
		   ttvv.channelUp(); //채널 올려
		   
		   ttvv2.channelDown();
		   ttvv2.channelDown();
		   ttvv2.channelDown();
		   ttvv2.channelDown();
		   ttvv2.channelDown();  //채널 내려
		   
		   ttvv.volume=9;
		   ttvv2.volume=17;
		   
		   ttvv.volumeUp();
		   ttvv.volumeUp();
		   ttvv.volumeUp();
		   ttvv.volumeUp();
		   
		   ttvv2.volumeDown();
		   ttvv2.volumeDown();

		   System.out.println("현재 ttvv는 " +ttvv.power + " 상태 입니다. " );
		   System.out.println("현재 TV 채널은 " +ttvv.channel + " 번 입니다. " );

		   System.out.println("현재 ttvv2는 " +ttvv2.power + " 상태 입니다. " );
		   System.out.println("현재 ttvv2는 " +ttvv2.channel + " 번 입니다. " );

		   System.out.println("현재 ttvv는 " +ttvv.power + " 상태 입니다. " );
		   System.out.println("현재 TV 볼륨은 " +ttvv.volume + " 번 입니다. " );

		   System.out.println("현재 ttvv2는 " +ttvv2.power + " 상태 입니다. " );
		   System.out.println("현재 ttvv2는 " +ttvv2.volume + " 번 입니다. " );
		
	}

}






