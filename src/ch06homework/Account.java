package ch06homework;

public class Account {
	
	static int balance=0;
	static final int MIN_BALANCE=0;
	static final int MAX_BALANCE=1000000;
	
	void setBalance(int balance) {
		if(balance>=MIN_BALANCE&&balance<=MAX_BALANCE) { //0~1000000
			if(balance>1000000) { //100만원 초과
				return;
			}
			this.balance+=balance;
		}
	}
	int getBalance() {
		return this.balance;
	}
	
}
