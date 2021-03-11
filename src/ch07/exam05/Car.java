package ch07.exam05;

public class Car {
	//Field
	//Constructor
	//Method
	public final void stop() { //부모만씀, 자식클래스에서 재정의못함
		System.out.println("멈춥니다");
	}
	
	public void run() {
		System.out.println("달립니다");
	}
}
