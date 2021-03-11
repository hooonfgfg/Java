package ch06homework.problem.bank;

import java.util.Scanner;

public class BankApplication {
	
	private static Account2[] accountArray = new Account2[100];
	private static Scanner scanner = new Scanner(System.in);
	
	private static String ano;
	private static String owner;
	private static int balance;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			
			//int selectNo = scanner.nextInt();
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
	
	// 계좌생성하기
	private static void createAccount() {
		System.out.println("--------\n"
						+ "계좌생성\n"
						+ "--------");
		
		System.out.print("계좌번호 : ");
		ano = scanner.nextLine();
		
		System.out.print("계좌주 : ");
		owner = scanner.nextLine();
		
		System.out.println("초기입금액 : ");
		balance = Integer.parseInt(scanner.nextLine());
		
		for(int i=0; i<accountArray.length; i++) {
			if( accountArray[i] == null) {
				accountArray[i] = new Account2(ano, owner, balance);
				break;
			}
		}	
		
		System.out.println("계좌가 생성되었습니다.");
	}
	
	// 계좌목록보기
	private static void accountList() {
		
		System.out.println("--------\n"
				+ "계좌목록\n"
				+ "--------");
		
		for(int i=0; i<accountArray.length; i++) {
			if( accountArray[i] == null) {
				break;
			}
				
			ano = accountArray[i].getAno();
			owner = accountArray[i].getOwner();
			balance = accountArray[i].getBalance();
			
			System.out.println(ano+"\t"+owner+"\t"+balance);
		}
	}

	// 예금하기
	private static void deposit() {
		
		System.out.println("--------\n"
				+ "예금\n"
				+ "--------");
		
		System.out.print("계좌번호: ");
		ano = scanner.nextLine();
		
		if ( findAccount(ano) == null ) {
			System.out.println("계좌가 존재하지 않습니다.");
		} else {
			System.out.print("예금액: ");
			balance = Integer.parseInt(scanner.nextLine());
			
			int amount = findAccount(ano).getBalance() + balance;
			findAccount(ano).setBalance(amount); 
				
			System.out.println("결과 : 예금이 성공되었습니다.");
		}
	}
		
	// 출금하기
	private static void withdraw() {
		
		System.out.println("--------\n"
				+ "출금\n"
				+ "--------");
		
		System.out.print("계좌번호: ");
		ano = scanner.nextLine();
		
		if ( findAccount(ano) == null ) {
			System.out.println("계좌가 존재하지 않습니다.");
		} else {
			System.out.print("출금액: ");
			balance = Integer.parseInt(scanner.nextLine());
				
			int amount = findAccount(ano).getBalance() - balance;
				
			if( amount < 0 ) {
				System.out.println("잔액이부족합니다.");
			} else {
				findAccount(ano).setBalance(amount); 
				System.out.println("결과 : 출금이 성공되었습니다.");
			}
		}
	}
	
	// Account 배열에서 Ano와 동일한 Account 객체 찾기
	private static Account2 findAccount(String ano) {
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				continue;
			}
			else if(accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}	
		}
		return null;
	}
}
