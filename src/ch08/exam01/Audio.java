package ch08.exam01;

public class Audio implements RemoteControl{
	//재정의할땐 항상 public이어야함.
	//인터페이스는 기본 public
	
	@Override
	public void turnOn() {
		System.out.println("Audio 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("Audio볼륨을"+volume+"으로 바꾼다ㅓ.");
		
	}
	
}



