package ja_0722;

public class Integer_1 {
	
	public static void main(String[] args) {
		
		Integer kbs_1 = new Integer(300); //참조변수가 다르니까 주소는 달라
		Integer mbc_1 = new Integer(300); //내용이 같아서 equals true!!!
		

		
		System.out.println("kbs_1 == mbc_1 : " + (kbs_1 == mbc_1));
		
		System.out.println("kbs_1.equals(mbc_1) : " + (kbs_1.equals(mbc_1)));
		
		System.out.println("kbs_1.toString() : "+ kbs_1.toString());
		System.out.println("mbc_1.toString() : "+ mbc_1.toString());
		
		System.out.println("kbs_1.hashcode() : " + kbs_1.hashCode());  //Integer안에 헤쉬코드 갖고 있어
		System.out.println("mbc_1.hashcode() : " + mbc_1.hashCode());
		System.out.println("kbs_1.hashcode() : " + kbs_1.hashCode(789));
		System.out.println("mbc_1.hashcode() : " + mbc_1.hashCode(456));
		
		System.out.println("MAX VALUE : " + Integer.MAX_VALUE);
		System.out.println("MIN VALUE : " + Integer.MIN_VALUE); //Integer안에 max,min값이 있어
		
		System.out.println("SIZE : " +Integer.SIZE+"bits");
		System.out.println("TYPE : " +Integer.TYPE);
		
	} //멤버일 뿐 객체가 아니야

}
