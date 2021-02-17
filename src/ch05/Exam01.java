package ch05;

public class Exam01 {

	public static void main(String[] args) {
		
		int var1=10;
		int var2=10;
		
		//값 비교
		System.out.println(var1==var2);
		System.out.println(var1!=var2);
		
		String var3="자바";
		String var4=new String("자바");
		//리터럴이 같으면 같은 객체 공유, new로생성시 다른 객체생성
		
		//번지 비교
		System.out.println(var3==var4);
		System.out.println(var3!=var4);
		System.out.println(var3.equals(var4));
	}

}
