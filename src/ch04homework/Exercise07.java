package ch04homework;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("--------------------");
			System.out.print("선택> ");

			String data = scanner.nextLine();
			int select = Integer.parseInt(data);
			// 선택
			if (select == 1) {
				System.out.print("예금액> ");
				String money = scanner.nextLine();
				
				balance += Integer.parseInt(money);

			} else if (select == 2) {
				System.out.print("출금액> ");
				String money = scanner.nextLine();

				balance -= Integer.parseInt(money);

			} else if (select == 3) {
				System.out.println("잔고> " + balance);
			} else if (select == 4) {
				break;
			}

		}

		System.out.println("프로그램 종료");

	}

}
