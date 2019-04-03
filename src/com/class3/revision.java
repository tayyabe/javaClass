package com.class3;

import java.util.Scanner;

public class revision {
	public static void main(String[] args) {
		String instructor;
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the instructor name ");
		instructor=scan.nextLine();
		
		switch(instructor) {
		case "Shiva":
			System.out.println("will take care of java assignment");
			break;
		case "weqas":
			System.out.println("will take care of selenium assignment");
			break;
				default:
					System.out.println("Invalid Instructor");
				} 
		
	
		}
	}


