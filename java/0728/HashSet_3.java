package ja_0728; // Set은 중복을 허용하지 않아 두번 쓰면 한번만 프린트

import java.util.HashSet;

public class HashSet_3 
{
	public static void main(String[] args) 
	{
		
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");

		set.add(new King("Hong", 20));
		set.add(new King("Hong", 20));

		System.out.println(set);		
		
	}

}

class King 
{
	String name;
	int age;
	
	King(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj)
	{
		if (obj instanceof King)
		{
			King tmp = (King)obj;
			return name.equals(tmp.name) && age == tmp.age;		
		}
		
		return false;
	}
	public int hashCode()
	{
		return name.hashCode() + age;
	}
	public String toString()
	{
		return name + " : " +age;

	}
}
