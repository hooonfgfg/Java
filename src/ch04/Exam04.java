package ch04;

public class Exam04 {

	public static void main(String[] args) {
		
		char grade='B';
		
		switch(grade) {
			case 'A':
				System.out.println("Ŀ�Ǹ� �����մϴ�.");
				//break;
			case 'B':
				System.out.println("���� �ϳ��� �ݴϴ�.");
				break;
			case 'C':
				System.out.println("�λ縸 �մϴ�.");
				break;
			default: //else�� ���� ����
				System.out.println("�Ű澲�� �ʽ��ϴ�.");
		}	
		
		//----------------------------------------
		
		if(grade=='A') {
			System.out.println("Ŀ�Ǵ���");
			System.out.println("��������");
		} else if(grade=='B') {
			System.out.println("��������");
		} else if(grade=='C') {
			System.out.println("�λ��մϴ�");
		} else {
			System.out.println("�Ű�Ⱦ�");
		}
		
	}
	
}
