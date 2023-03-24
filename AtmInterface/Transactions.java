package com.AtmInterface; 

public class Transactions {
	
	
	/*public void setBalance(long balance) {
		ba.setBalance(balance);
	}
	public long getBalance() {
		return ba.getBalance();
	}*/	
	/*public String getAccountNo() {
		return ba.getAccountNo();
	}
	public String getPinNo() {
		return ba.getPinNo();
	}
	public String getName() {
		return ba.getName();
	}
	public long getBalance() {
		return ba.getBalance();
	}
	public String getAccType() {
		return ba.getAccType();
	}
	*/
	/*public void deposit(long amount) {
		ba.deposit(amount);
	}
	public void withDraw(long amount) {
		ba.withDraw(amount);*/
		public void deposit(BankAccount ba,long amount) {
			// System.out.println("Enter the amount you want to deposit: ");
			//BankAccount ba=atm.getBankAccount();
			ba.setBalance(ba.getBalance()+amount);
			
			// System.out.println("Balance after withdraw: " + balance);
		}

		public void withDraw(BankAccount ba,long amount) {
			// System.out.println("Enter the amount you want to withdraw: ");
			//BankAccount ba=atm.getBankAccount();
			if (ba.getBalance() >= amount) {
				ba.setBalance(ba.getBalance()-amount);
				
				// System.out.println("Balance after withdraw: " + balance);
			} else {
				System.out.println("Your balance is less than " + amount);
				System.out.println("Transaction failed");
			}

		}
	}

