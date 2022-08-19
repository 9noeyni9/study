package ja_0726;//주민번호indexOf(_5,_7,__18)

public class String_7 {
	public static void main(String[] args) {
		
		String[] juju = { "9406251623444", "9906254623444",
				          "9606252623444", "9806251623444",
				          "9406253623444", "9706252623444"};
		
		for (int i = 0; i < juju.length; i++) {
			if (juju[i].indexOf("2", 6)==6 || juju[i].indexOf("4", 6)==6) {//juju[i].indexOf("2", 0)==6 만약에 0부터 찾았다면 여섯번째 2가 나오기 전(생년월일부분)에 2가 있다면 여자로 인식될 것
			     System.out.println(juju[i] + " 는 여자입니다.");
			}else
				System.out.println(juju[i] + " 는 남남자입니다.");
		}		
		
	}

}
