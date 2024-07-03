package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
	
    
    //생성자 작성
	public Account() {
	}
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}

	public Account(String accountNo, int balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
    
    
    //필요한 메소드 작성
	
	public int deposit(int money) {  //예금
		balance += money;
		return balance;
	}
	
	public int withdraw(int money) {  //출금
		balance -= money;
		return balance;
	}
	
	public void showBalance() {  //잔금
		System.out.println(balance);
	}
	
}
