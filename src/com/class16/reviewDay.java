package com.class16;

import java.util.Scanner;

public class reviewDay {
	
	
	
	public static void main(String[] args) {
		
		reviewDay void1=new reviewDay();
		
		void1.noReturn();
		void1.scannerFirstName();
		void1.ScanenrLastName();
		
	}
	void noReturn() {
		System.out.println("i do not have a return type");
	}
	void scannerFirstName() {
		Scanner scan=new Scanner (System.in);
		System.out.println("please enter first name");
		scan.nextLine();
	}
	void ScanenrLastName() {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter last name");
		scan.nextLine();
	}
	

}
