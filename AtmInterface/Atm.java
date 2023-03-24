package com.AtmInterface;

import java.util.*;
	
public class Atm {
	
	/*BankAccount getBankAccount() {
		return ba;
	}
	void setBankAccount(BankAccount ba) {
		this.ba = ba;
	}*/
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		Transactions t = new Transactions();
		BankAccount ba = new BankAccount();
		UserInterface ui=new UserInterface();
		//Atm atm=new Atm();
		//atm.setBankAccount(ba);
		//ba.setBankAccount(ba);
		//ba.getBankAccount();
		ba.setAccountNo("837AT973789");
		ba.setPinNo("4567");
		ba.setName("Tony");
		ba.setAccType("Savings");
		ba.setBalance(50000L);
		ui.getUserInterface(ba,t);
	}
}
