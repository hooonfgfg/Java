package ch08.exam01;

public class Example {

	public static void main(String[] args) {
		
		RemoteControl rc=new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		//RemoteControl rc=new audio(); //오디오객체를 인터페이스로 사용하겠다.
		
	}

}
