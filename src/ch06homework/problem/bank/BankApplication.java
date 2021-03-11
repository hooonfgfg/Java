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
			System.out.println("1.���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("---------------------------------------------");
			System.out.print("����> ");
			
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
		
		System.out.println("���α׷� ����");
	}
	
	// ���»����ϱ�
	private static void createAccount() {
		System.out.println("--------\n"
						+ "���»���\n"
						+ "--------");
		
		System.out.print("���¹�ȣ : ");
		ano = scanner.nextLine();
		
		System.out.print("������ : ");
		owner = scanner.nextLine();
		
		System.out.println("�ʱ��Աݾ� : ");
		balance = Integer.parseInt(scanner.nextLine());
		
		for(int i=0; i<accountArray.length; i++) {
			if( accountArray[i] == null) {
				accountArray[i] = new Account2(ano, owner, balance);
				break;
			}
		}	
		
		System.out.println("���°� �����Ǿ����ϴ�.");
	}
	
	// ���¸�Ϻ���
	private static void accountList() {
		
		System.out.println("--------\n"
				+ "���¸��\n"
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

	// �����ϱ�
	private static void deposit() {
		
		System.out.println("--------\n"
				+ "����\n"
				+ "--------");
		
		System.out.print("���¹�ȣ: ");
		ano = scanner.nextLine();
		
		if ( findAccount(ano) == null ) {
			System.out.println("���°� �������� �ʽ��ϴ�.");
		} else {
			System.out.print("���ݾ�: ");
			balance = Integer.parseInt(scanner.nextLine());
			
			int amount = findAccount(ano).getBalance() + balance;
			findAccount(ano).setBalance(amount); 
				
			System.out.println("��� : ������ �����Ǿ����ϴ�.");
		}
	}
		
	// ����ϱ�
	private static void withdraw() {
		
		System.out.println("--------\n"
				+ "���\n"
				+ "--------");
		
		System.out.print("���¹�ȣ: ");
		ano = scanner.nextLine();
		
		if ( findAccount(ano) == null ) {
			System.out.println("���°� �������� �ʽ��ϴ�.");
		} else {
			System.out.print("��ݾ�: ");
			balance = Integer.parseInt(scanner.nextLine());
				
			int amount = findAccount(ano).getBalance() - balance;
				
			if( amount < 0 ) {
				System.out.println("�ܾ��̺����մϴ�.");
			} else {
				findAccount(ano).setBalance(amount); 
				System.out.println("��� : ����� �����Ǿ����ϴ�.");
			}
		}
	}
	
	// Account �迭���� Ano�� ������ Account ��ü ã��
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
