package com.tnsif.multithreading.synchronization;

public class SynchronizationDemo {

	public static void main(String[] args) {
		Account a1=new Account(121,"Gayatri",50000);
		AccountThread t1=new AccountThread(a1,10000);
		AccountThread t2=new AccountThread(a1,20000);
		AccountThread t3=new AccountThread(a1,30000);
	}

}
