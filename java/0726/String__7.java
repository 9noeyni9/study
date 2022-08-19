package ja_0726;

public class String__7 {
	public static void main(String[] args) 
	{
		
	
	String[] juju = { "940625 1623444", "990625 4623444",
			          "960625 2623444", "980625 1623444",
			          "960625 82623444", "980625 91623444",
			          "940625 3623444", "970625 2623444"};//indexOf로 성별분류
	
	for (int i = 0; i < juju.length; i++) 
	{
		if (juju[i].indexOf("2", 6)== 7 || juju[i].indexOf("4", 6)== 7) {
			System.out.println(juju[i] + " 는 여자입니다.");
		}else if (juju[i].indexOf("1", 6)== 7 || juju[i].indexOf("3", 6)== 7)
		{
			System.out.println(juju[i] + " 는 남자입니다.");
		}
		else
		{
			System.out.println(juju[i] + " 는 사람이 아닙니다");
		}
		
	}
	
	}
        
}
