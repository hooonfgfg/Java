package ch09.exam03;

public class A {
	public void mehod(int x) {
		int y=2;
		
		//x=10;
		//y=20;
		//로컬변수를 사용하게 되면 값 그대로 써야함. 중간에 못바꿈.
		//로컬변수는 로컬클래스에 사용될시 final 취급
		class B{
			int x2=x;
			int y2=y;
			public void method() {
				int result=x+y;
			}
		}
	}
}
