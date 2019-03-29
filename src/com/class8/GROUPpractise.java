package com.class8;

import java.util.Scanner;

public class GROUPpractise {
	public static void main(String[] args) {
		int x;
		int y;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter first number");
		x=scan.nextInt();
		System.out.println("Please enter second number");
		y=scan.nextInt();
		
		
		if((x*y)>0) {
			System.out.println("true");
		}else {
			System.out.println("fasle");
		}
	}

}
