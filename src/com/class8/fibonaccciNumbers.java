package com.class8;

public class fibonaccciNumbers {
	public static void main(String[] args) {
	//adding numbers with previous number unto 10numbers called fibonacciNumbers
		int a =1;
		int b=0;
		int c=0;
		for(int i=0;i<10;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(a+" ");
					
		}
		
	}

}
