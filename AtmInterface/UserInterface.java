package com.AtmInterface;

import java.util.*;

public class UserInterface {
	public void getUserInterface(BankAccount ba, Transactions t) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number :");
		String ac = sc.next();
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
						System.out.println("Name of account holder: " + ba.getName());
						System.out.println("Account no.: " + ba.getAccountNo());
						System.out.println("Account type: " + ba.getAccType());
						System.out.println("Balance: " + ba.balanceAmt());
						break;
					case 2:
						long amount;
						amount = sc.nextLong();
						// t.deposit(atm,amount);
						t.deposit(ba, amount);
						System.out.println("The Entered amount is successfully deposited into the account");
						break;
					case 3:
						amount = sc.nextLong();
						t.withDraw(ba, amount);
						System.out.println("The Entered amount is successfully withdrawn from the account");
						break;
					case 4:
						System.out.println("Thank You");
						break;
					default:
						System.out.println("Entered number is not in the list \n ****Please choose from the above list****");
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
