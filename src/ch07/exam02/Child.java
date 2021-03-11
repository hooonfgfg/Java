package ch07.exam02;

public class Child extends Parent{
	//필드
	//생성자
	public Child(String firstName) {
		super("김",firstName); //부모(컴파일러가 자동으로 넣어줌)
		//super 는 반드시 첫줄에 작성
		System.out.println("Child 객체 생성");
	}
	//메소드
	public void method2() {
		System.out.println("method2() 실행");
	}
}