package ch05homework;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run=true;
		int studentNum=0;
		int[] scores=null;
		Scanner scanner=new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("----------------------------------");
			System.out.print("����> ");
			
			int selectNo=scanner.nextInt();
			
			if(selectNo==1) { //�л���
				System.out.print("�л���> ");
				studentNum=scanner.nextInt();
			}else if(selectNo==2) { //�����Է�
				scores=new int[studentNum];
				for(int i=0;i<studentNum;i++) {
					System.out.print("scores["+i+"]> ");
					scores[i]=scanner.nextInt();
				}
			}else if(selectNo==3) { //��������Ʈ
				for(int i=0;i<studentNum;i++) {
					System.out.println("scores["+i+"]: "+scores[i]);
				}
			}else if(selectNo==4) { //�м�
				int max=0;
				double avg=0.0;
				
				for(int i=0;i<studentNum;i++) {
					if(max<scores[i]) {
						max=scores[i];
					}
					avg+=(double)scores[i];
				}
				avg/=studentNum;
				System.out.println("�ְ� ����: "+max);
				System.out.println("��� ����: "+avg);
			}else if(selectNo==5) { //����
				run=false;
			}
		}
		
		System.out.println("���α׷� ����");
		
	}

}
