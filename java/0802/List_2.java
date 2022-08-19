package ja_0802;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;

public class List_2 {
	public static void main(String[] args) {
		Frame ff = new Frame("List - select");
		ff.setSize(500,400);
//		ff.setLayout(new FlowLayout()); //얘를 쓰면 우리가 준 Location은 의미가 없어 
		ff.setLayout(null);             //null로 해야 우리가 주는 Location이 의미가 있어(위에랑 비교해서 보기)
		
		List selectOne = new List(4);
		
		selectOne.setLocation(20,40);
		selectOne.setSize(150, 80);
		
		selectOne.add("Student");
		selectOne.add("Teacher");
		selectOne.add("Driver");
		selectOne.add("Computer Programmer");
		selectOne.add("Sales Man");
		selectOne.add("Musician");
		selectOne.add("Director");
		
		List selectMany = new List(5, true);
		selectMany.setLocation(20,170);
		selectMany.setSize(150,100);
		
		selectMany.add("Student");
		selectMany.add("Teacher");
		selectMany.add("Driver");
		selectMany.add("Computer Programmer");
		selectMany.add("Sales Man");
		selectMany.add("Musician");
		selectMany.add("Director");
		
		
		List selectadd = new List(5, true);  
		selectadd.setLocation(200,120);
		selectadd.setSize(150,100);
		
		selectadd.add("Student");
		selectadd.add("Teacher");
		selectadd.add("Driver");
		selectadd.add("Computer Programmer");
		selectadd.add("Sales Man");
		selectadd.add("Musician");
		selectadd.add("Director");		
		
		ff.add(selectOne);
		ff.add(selectMany);
		ff.add(selectadd);
		ff.setVisible(true);
	}

}
