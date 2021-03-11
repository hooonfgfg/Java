package ch07.exam10;

public class Child extends Parent{
	//필드
		public int field2;
		//생성자
		public Child() {
			super(); //부모(컴파일러가 자동으로 넣어줌)
			System.out.println("Child 객체 생성");
		}
		//메소드
		@Override
		public void method2() {
			System.out.println("method2() 실행");
		}
		public void method3() {
			System.out.println("method3() 실행");
		}

}