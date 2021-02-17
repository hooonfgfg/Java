package ch02;

public class Exam03 {

	public static void main(String[] args) {
		
		// int 타입 이하의 피연산자의 연산은 결과가 int
		byte var1=10;
		byte var2=10;
		
		int var3=var1+var2; //연산의 결과는 int
		//byte var3=(byte)(var1+var2);
		
		//int 타입보다 큰 타입이 연산되면 큰 타입으로 결과가 바뀜.
		int var4=10;
		long var5=20;
		long var6=var4+var5;
		
		int var7=10;
		double var8=1.5;
		double var9=var7+var8; //큰 실수형으로 타입바뀜
		
		
		
	}
}