package ch12.exam02;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("메인 스레드 시작");
		
		//네트워크 작업을 하는 스레드 생성과 실행
		Thread thread1=new NetworkTask();
		thread1.start();
		
		//뮤직 작업을 하는 스레드 생성과 실행
 		Thread thread2=new MusicTask();
 		thread2.start();
		
 		//채팅 작업을 하는 스레드 생성과 실행
 		Thread thread3=new Thread() {
 			//스레드를 상속해서 하위클래스를 선언한 다음에 하위클래스 객체를 만듬
 			//익명 자식 객체
			@Override
			public void run() {
				while(true) {
					System.out.println("채팅 작업을 합니다.");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
 		};
 		thread3.start();
 		
		while(true) {
			System.out.println("메인 스레드 종료");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

}
