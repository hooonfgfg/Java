package ch08.exam02;

public class Example {
	
	public static void method(RemoteControl rc) {
		//�������̽��� �����θ� ����ϴ� �ڵ�
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	}
	
	public static void main(String[] args) {
		
		RemoteControl rc=new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		//RemoteControl rc=new audio(); //�������ü�� �������̽��� ����ϰڴ�.
		method(new Television());
		method(new Audio());
		
	}

}
