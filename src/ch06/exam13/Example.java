package ch06.exam13;

public class Example {

	public static void main(String[] args) {
		
		//int result1=Singleton.method1();
		//String result2=Singleton.method2();
		//int[] result3=Singleton.method3();
		
		//Singleton result4=new Singleton(); //��ҿ� �����
		//Singleton result4=Singleton.method4();
		
		//�����ڸ� �̿��ؼ� ��ü���
		//Singleton result1=new Singleton();
		//�Ұ�
		
		//Factory Method �̿��ؼ� ��ü���
		Singleton result2=Singleton.getIntance();
		Singleton result3=Singleton.getIntance();
		if(result2==result3) {
			System.out.println("������ü����");
		}else {
			System.out.println("�ٸ� ��ü����");
		}
	}	

}
