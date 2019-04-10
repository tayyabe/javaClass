package com.tayyabr;

import java.util.Scanner;

public class bullshit {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("please enter first number");
		int firstNum=scan.nextInt();
		
		System.out.println("please enter your second number");
		int secondNum=scan.nextInt();
		
		constructorScanner obj= new constructorScanner(firstNum,secondNum); 
		System.out.println("The largest number is " +obj.largest());
	}

}
