package com.tnsif.multithreading.synchronization;

public class AccountThread extends Thread{
    private Account acc;
    private int amt;
    public AccountThread(Account acc,int amt)
	{
		this.acc=acc;
		this.amt=amt;
		start();
	}
	public void run() {
		try {
		acc.withdraw(amt);
	}
		catch(InsufficientBalanceException ie) {
			
		}
}
