package com.AtmInterface;

import java.util.Scanner;

public class BankAccount {
	private String accountNo;
	private String pinNo;
	private String name;
	private String accType;
	private long balance;
	

	Scanner sc = new Scanner(System.in);

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setPinNo(String pinNo) {
		this.pinNo = pinNo;
	}

	public String getPinNo() {
		return pinNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public void balanceAmt() {
		System.out.println("Name of account holder: " + name);
		System.out.println("Account no.: " + accountNo);
		System.out.println("Account type: " + accType);
		System.out.println("Balance: " + balance);
	}

}
