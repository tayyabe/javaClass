package com.class5;

import java.util.Scanner;

public class practiseHome {
	public static void main(String[] args) {
		String pasword="tayyab";
		String pasword2="bilal";
		System.out.println("Guess the pasword");
		
		Scanner scan=new Scanner(System.in);
		String guess=scan.nextLine();
		
		if(pasword.equals(guess)) {
			System.out.println("your pasword is correct");
	    }else if(pasword2.equals(guess)) {
	    	System.out.println("your second pasword is correct");
	    	
	    }else {
			System.out.println("your pasword is incorrect");
		}
		
	}
	
}
