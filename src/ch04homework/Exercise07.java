package ch04homework;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("--------------------");
			System.out.print("����> ");

			String data = scanner.nextLine();
			int select = Integer.parseInt(data);
			// ����
			if (select == 1) {
				System.out.print("���ݾ�> ");
				String money = scanner.nextLine();
				
				balance += Integer.parseInt(money);

			} else if (select == 2) {
				System.out.print("��ݾ�> ");
				String money = scanner.nextLine();

				balance -= Integer.parseInt(money);

			} else if (select == 3) {
				System.out.println("�ܰ�> " + balance);
			} else if (select == 4) {
				break;
			}

		}

		System.out.println("���α׷� ����");

	}

}
