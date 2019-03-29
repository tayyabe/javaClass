package com.class5;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		int month;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		month=scan.nextInt();
		if (month==1) {
			System.out.println("Jan");
		}else if(month==2) {
			System.out.println("Feb");
		}else if(month==3) {
			System.out.println("Mar");
		}else if (month==4) {
			System.out.println("Apr");
		}else if(month==5) {
			System.out.println("May");
		}else if(month==6) {
			System.out.println("Jun");
		}else if (month==7) {
			System.out.println("Jul");
		}else if(month==8) {
			System.out.println("Aug");
		}else if(month==9) {
			System.out.println("Sep");
		}else if(month==10) {
			System.out.println("Oct");
		}else if(month==11) {
			System.out.print("Nov");
		}else if(month==12) {
			System.out.print("Dec");
		}else {
			System.out.println("Invalid");
		}
		}
	}
		