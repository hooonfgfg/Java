package ch07.exam01;

public class Child extends Parent{
	//�ʵ�
	public int field2;
	//������
	public Child() {
		super(); //�θ�(�����Ϸ��� �ڵ����� �־���)
		System.out.println("Child ��ü ����");
	}
	//�޼ҵ�
	public void method2() {
		System.out.println("method1() ����");
	}
}