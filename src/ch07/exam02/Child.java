package ch07.exam02;

public class Child extends Parent{
	//�ʵ�
	//������
	public Child(String firstName) {
		super("��",firstName); //�θ�(�����Ϸ��� �ڵ����� �־���)
		//super �� �ݵ�� ù�ٿ� �ۼ�
		System.out.println("Child ��ü ����");
	}
	//�޼ҵ�
	public void method2() {
		System.out.println("method2() ����");
	}
}