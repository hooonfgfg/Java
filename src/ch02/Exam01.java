package ch02;

public class Exam01 {

	public static void main(String[] args) {
		
		//정수
		byte 	var1=100; 	//~128~127
		short 	var2=10000;	//-32000~32000
		int		var3=20000000;
		long	var4=20000000000L;	//숫자끝에L 컴파일한테 long타입을 미리 알려줘야함.
		
		//문자 타입 변수 선언과 값 저장
		char var9=65;
		char var10='A';
		System.out.println("var9: "+var9);
		System.out.println("var10: "+var10);
		
		//실수
		float 	var5=0.123456789f;	//소수7짜리까지 유용
		double 	var6=0.123456789123456789;	//정밀도 높음(소수16자리까지)
		System.out.println("var5: " + var5);
		System.out.println("var6: " + var6);
		
		//논리 
		boolean var7=true;	//
		boolean var8=false;	//
		
		
	}

}
