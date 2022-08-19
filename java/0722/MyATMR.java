package ja_0722;

class ATMR
{
    private int total;
    
    public ATMR(int total) {
    	this.total = total;
    }
    synchronized void deposit(int amount, String name) {
    	total += amount;
    	System.out.println(name + " 님 입금 금액 : " + amount +" 원");
    }
    synchronized void withdraw(int amount, String name) {
    	if ((total-amount)>0) {
			total -= amount;
			System.out.println(name + " 님 출금 금액 : " + amount + " 원");
		}else {
			System.out.println(name + " 님 잔액이 부족해 출금할 수 없습니다.");
		}
    }
    public void getTotal() {
    	System.out.println("\n 현재 계좌의 금액 : " + total + "\n");
    }
}

class ATMR_USER implements Runnable 
{
	boolean flag = false;
	String name = "";
	public String getName() {
		return name;
	}



	ATMR obj;
	
	public ATMR_USER(ATMR obj, String kbs) {
		name = kbs;
		this.obj=obj;
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(flag) {
				obj.deposit((int)(Math.random()*10000), getName());
				obj.getTotal();
			}else {
				obj.withdraw((int)(Math.random()*10000), getName());
				obj.getTotal();				
			}
			flag = !flag;
		}
	}
}


public class MyATMR {

	public static void main(String[] args) {
		
		ATMR atm = new ATMR(10000);
		
		ATMR_USER user1 = new ATMR_USER(atm,"김연경");
		Thread thread_1 = new Thread(user1);
		
		ATMR_USER user2 = new ATMR_USER(atm,"김희진");
		Thread thread_2 = new Thread(user2);           //Thread thread_2 = new Thread(new ATMR_USER
		
		ATMR_USER user3 = new ATMR_USER(atm,"박정아");
		Thread thread_3 = new Thread(user3);
		
		thread_1.start();
		thread_2.start();
		thread_3.start();
		
		
		
	}
}
