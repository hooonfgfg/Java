package ch07.exam01;

public class Child extends Parent{
	//필드
	public int field2;
	//생성자
	public Child() {
		super(); //부모(컴파일러가 자동으로 넣어줌)
		System.out.println("Child 객체 생성");
	}
	//메소드
	public void method2() {
		System.out.println("method1() 실행");
	}
}