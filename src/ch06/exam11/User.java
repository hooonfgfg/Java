package ch06.exam11;

public class User {
	//필드
	//인스턴스필드
	String id;
	String name;
	String password;
	static String nation="한국";
	
	//생성자(인스턴스 멤버가 될수없음)
	User(String name){
		this.name=name;
	}
	
	//메소드
	static void info() { //객체가 없이도 사용할수 있는 메소드
		//name="홍길동"; //객체관련된것들 오면안됨
		nation="대한민국"; //스태틱붙은건 써도됨.
		System.out.println("모든 유저는 한국인입니다.");
	}
	
	void login() { //객체가 있어야만 만들수있는 메소드
		System.out.println(name+"님이 로그인합니다.");
	}
	void logout() {
		System.out.println(name+"님이 로그아웃합니다.");
	}
}
