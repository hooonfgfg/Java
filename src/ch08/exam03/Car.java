package ch08.exam03;

public class Car implements Shipable,Flyable {

	@Override
	public void takeOff() {
		System.out.println("�̷�");
		
	}

	@Override
	public void land() {
		System.out.println("����");
		
	}

	@Override
	public void fly() {
		System.out.println("����");
		
	}

	@Override
	public void sailing() {
		System.out.println("����");
		
	}

	@Override
	public void anchor() {
		System.out.println("����");
		
	} //Shipable, Flyable�� ��밡��
	
	
}
