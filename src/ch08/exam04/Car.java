package ch08.exam04;

public class Car {
	//�ʵ�
	public Tire t1; // new Tire() X
	public Tire t2;
	public Tire t3;
	public Tire t4;
	//������
	//�޼ҵ�
	public void run() {
		t1.roll();
		t2.roll();
		t3.roll();
		t4.roll();
	}
}
