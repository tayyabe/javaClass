package com.class8;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int number;
		
		boolean prime=true;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number");
	     number=scan.nextInt(); 
	   		
		for(int i=2;i<number;i++) {
			if(number%i!=0) {
		
	}
			else {
				prime=false;
			break;
				}
			}
		System.out.println(prime);
}
	}

