package ch07.exam10;

public class Child extends Parent{
	//�ʵ�
		public int field2;
		//������
		public Child() {
			super(); //�θ�(�����Ϸ��� �ڵ����� �־���)
			System.out.println("Child ��ü ����");
		}
		//�޼ҵ�
		@Override
		public void method2() {
			System.out.println("method2() ����");
		}
		public void method3() {
			System.out.println("method3() ����");
		}

}