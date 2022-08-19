package ja_0722; // MyATMR파일 러너블로 바꿔보기

class ATMPR
{
	private int total;
	
	public ATMPR(int total) {
		this.total = total;
	}
	
	synchronized void deposit(int amount, String name) {
	    total += amount;
	    System.out.println(name + " 님 입금 금액 : " + amount + " 원");
	}
	synchronized void withdraw(int amount, String name) {
		if ((total - amount)>=0) { //출금 가능하면
			total -= amount;
			System.out.println(name + " 님 출금 금액 : " + amount +" 원");	//출금		
		}else {
			System.out.println(name + " 님 잔액이 부족해 출금할 수 없습니다."); //불가능하면
		}
	}
	 public void getTotal() {
		System.out.println("\n 현재 계좌의 금액 : " + total + "\n");
	}
	
}	



class ATMPR_USER implements Runnable 
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
	
public class MyATMPR_1 {
	public static void main(String[] args) {
		
	}

}
