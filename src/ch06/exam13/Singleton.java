package ch06.exam13;

public class Singleton {
	/*static int method1() {
		return 1;
	}
	static String method2() {
		return "�ڹ�";
	}
	
	static int[] method3(){
		int[] arr= {10,20,30};
		return arr;
	}*/
	//�ʵ�
	private static Singleton singleton=new Singleton();
	
	//������
	private Singleton() {
		
	}
	
	//�޼ҵ�
	static Singleton getIntance() { 
		//Singleton s=new Singleton();
		return singleton;
	}
}
