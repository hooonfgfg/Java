package ch06.exam11;

public class User {
	//�ʵ�
	//�ν��Ͻ��ʵ�
	String id;
	String name;
	String password;
	static String nation="�ѱ�";
	
	//������(�ν��Ͻ� ����� �ɼ�����)
	User(String name){
		this.name=name;
	}
	
	//�޼ҵ�
	static void info() { //��ü�� ���̵� ����Ҽ� �ִ� �޼ҵ�
		//name="ȫ�浿"; //��ü���õȰ͵� ����ȵ�
		nation="���ѹα�"; //����ƽ������ �ᵵ��.
		System.out.println("��� ������ �ѱ����Դϴ�.");
	}
	
	void login() { //��ü�� �־�߸� ������ִ� �޼ҵ�
		System.out.println(name+"���� �α����մϴ�.");
	}
	void logout() {
		System.out.println(name+"���� �α׾ƿ��մϴ�.");
	}
}
