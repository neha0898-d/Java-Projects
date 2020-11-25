package com.capgemini.training.lab4.ui;

import com.capgemini.training.lab4.assignments.CurrentAccount;

public class AccountTester {

	public static void main(String[] args) {
		
//		Account A = new Account("Smith",30,45756987,2000);
//		System.out.println(A);
//		Account B = new Account("Kathy",35,45896988,3000);
//		System.out.println(B);
//		A.deposit(2000);
//		System.out.println(A);
//		B.withdraw(2000);
//		System.out.println(B);
//		
//		SavingAccount savAcc = new SavingAccount("komal", 22, 789845, 5000);
//		System.out.println(savAcc);
//		
//		savAcc.withdraw(4001);
//		System.out.println(savAcc);
//		
		CurrentAccount curAcc = new CurrentAccount("komal", 22, 789845, 5000,2000);
		System.out.println(curAcc);
		
		curAcc.withdraw(7002);
		System.out.println(curAcc);
		
		
	}

}
