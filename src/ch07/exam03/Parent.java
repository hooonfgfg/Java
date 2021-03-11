package ch07.exam03;

public class Parent {
	//필드
	public String lastName;
	public String firstName;
	
	//생성자
	public Parent(String lastName,String firstName) {
		System.out.println("Parent 객체 생성");
		this.lastName=lastName;
		this.firstName=firstName;
	}
	
	//메소드
	public void sound() {
		System.out.println("공부해라");
	}
}
