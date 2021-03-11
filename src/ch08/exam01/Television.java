package ch08.exam01;

public class Television implements RemoteControl{ //RemoteControl인터페이스를 사용가능
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV를 끈니다.");
	}
	
	public void setVolume(int volume) {
		System.out.println("TV볼륨을 "+volume+"로 조정합니다.");
	}
}
