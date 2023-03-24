package com.AtmInterface;

import java.util.*;
	
public class Atm {
	static BankAccount ba = new BankAccount();
	BankAccount getBankAccount() {
		return ba;
	}
	void setBankAccount(BankAccount ba) {
		this.ba = ba;
	}
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		Transactions t = new Transactions();
		Atm atm=new Atm();
		atm.setBankAccount(ba);
		//ba.setBankAccount(ba);
		//ba.getBankAccount();
		System.out.println("Enter Account Number :");
		String ac = sc.next();
		ba.setAccountNo("837AT973789");
		ba.setPinNo("4567");
		ba.setName("Tony");
		ba.setAccType("Savings");
		ba.setBalance(50000L);
		if (ba.getAccountNo().equals(ac)) {
			System.out.println("Enter Pin Number :");
			String pi = sc.next();
			if (ba.getPinNo().equals(pi)) {
				int ch;
				do {
					System.out.println(
							"1. Check the balance in your account. \n2. Deposit the amount \n3. Withdraw the amount \n4. Exit ");
					System.out.println("Enter your choice: ");
					ch = sc.nextInt();
					switch (ch) {
					case 1:
						ba.balanceAmt();
						break;
					case 2:
						long amount;
						amount = sc.nextLong();
						t.deposit(atm,amount);
						System.out.println("The Entered amount is successfully deposited into the account");
						break;
					case 3:
						amount = sc.nextLong();
						t.withDraw(atm,amount);
						System.out.println("The Entered amount is successfully withdrawn from the account");
						break;
					case 4:
						System.out.println("Thank You");
						break;
					}
				} while (ch != 4);
			} else {
				System.out.println("Entered Pin Number is Not Correct \nPlease try again");
			}
		} else {
			System.out.println("Entered Account Number is Invalid \nPlease try again");
		}
	}
}
