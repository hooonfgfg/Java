package ch07.exam03;

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
	
	//@Override
	public void sound() {
		System.out.println("싫어요");
	}
	//재정의하면 부모의 메소드보다 더 넓은 접근제한자를 사용해야함
}