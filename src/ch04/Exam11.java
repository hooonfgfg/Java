package ch04;

public class Exam11 {

	public static void main(String[] args) {
		
		int count=0;
		
		while(true) {
			count++;
			System.out.println(count);
			if(count>10) {
				break; //�ݺ����� ����
				//return; //main�޼ҵ带 ����
			}
		}
		
		System.out.println("���α׷� ������ ���� ����");
		
	}

}
