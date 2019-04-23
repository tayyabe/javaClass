package com.class26;

public class BankTest {
	public static void main(String[] args) {
		Bank obj=new BankA();
		System.out.println(obj.getBalance());
		
		
	Bank obj1=new BankB();
	 System.out.println(obj1.getBalance());
	 
	Bank obj3=new BankC();
	System.out.println(obj3.getBalance());
	}

}
