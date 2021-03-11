package ch12.exam01;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("���� ������ ����");
		
		//��Ʈ��ũ �۾��� �ϴ� ������ ������ ����
		Thread thread1=new Thread(new NetworkTask());
		thread1.start();
		
		//���� �۾��� �ϴ� ������ ������ ����
 		Thread thread2=new Thread(new MusicTask());
 		thread2.start();
		
 		//ä�� �۾��� �ϴ� ������ ������ ����
 		Thread thread3=new Thread(new Runnable() {
 			//�͸� ���� Ŭ����
			@Override
			public void run() {
				while(true) {
					System.out.println("ä�� �۾��� �մϴ�.");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
 			
 		});
 		thread3.start();
 		
		while(true) {
			System.out.println("���� ������ ����");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

}
