package ch03;

public class Exam02 {

	public static void main(String[] args) {
		
		//연산의 결과가 boolean으로 나오는 기호
		int var1=2;
		int var2=3;
		
		boolean var3 = var1==var2; //F
		boolean var4 = var1!=var2; //T
		boolean var5=var1>var2; //F
		boolean var6=var1>=var2; //F
		boolean var7=var1<var2; //T
		boolean var8=var1<=var2; //T
		boolean var9=!(var1==var2); //T
		boolean var10 = (var1==var2)||(var1<var2); //OR, T
		boolean var11 = (var1==var2)&&(var1<var2); //AND, F
		
	}

}
