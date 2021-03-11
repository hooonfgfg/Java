package ch08.exam03;

public class Car implements Shipable,Flyable {

	@Override
	public void takeOff() {
		System.out.println("이륙");
		
	}

	@Override
	public void land() {
		System.out.println("착륙");
		
	}

	@Override
	public void fly() {
		System.out.println("비행");
		
	}

	@Override
	public void sailing() {
		System.out.println("항해");
		
	}

	@Override
	public void anchor() {
		System.out.println("정박");
		
	} //Shipable, Flyable도 사용가능
	
	
}
