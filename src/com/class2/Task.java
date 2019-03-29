package com.class2;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("please enter a starting number");
		 int startNumber=scan.nextInt();
		 
		 System.out.println("please enter second number");
		 int secondNumber=scan.nextInt();
		 
		 if(startNumber<secondNumber) {
		 for(int i=startNumber; i<=secondNumber; i+=2) {
			 System.out.println(i);
		 }
	}else {
		System.out.println("I wont run your code");
	}
	}
}
