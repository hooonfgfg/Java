package ch09.exam03;

public class A {
	public void mehod(int x) {
		int y=2;
		
		//x=10;
		//y=20;
		//���ú����� ����ϰ� �Ǹ� �� �״�� �����. �߰��� ���ٲ�.
		//���ú����� ����Ŭ������ ���ɽ� final ���
		class B{
			int x2=x;
			int y2=y;
			public void method() {
				int result=x+y;
			}
		}
	}
}
