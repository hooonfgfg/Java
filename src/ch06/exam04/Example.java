package ch06.exam04;

public class Example {

	public static void main(String[] args) {

		Korean k1=new Korean("123","456");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2=new Korean("°¨ÀÚ¹Ù","654321-1234567");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		
	}

}
