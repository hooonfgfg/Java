package ch06homework.problem.bank;

/*
2021.02.21
title : static 변수, getter, setter, 접근제한자를 응용한 은행계좌 서비스
*/

public class Account2 {
	
	// Field
	private String ano;
	private String owner;
	private int balance;
	
	// Constructor
	public Account2(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	// Method
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
