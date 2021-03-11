package ch07.exam11;

public abstract class Animal {
	public String name;
	public String kind;
	
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
	
	public void eat() {
		System.out.println("먹습니다.");
	}
	
	public abstract void sound(); //sound메소드의 내용이 자식마다 다름.
	
}
