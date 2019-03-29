package com.class8;

import java.util.Scanner;

public class TaskForManu {
	public static void main(String[] args) {
		
		String userName;
		String password;
		String confirmPassword;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the user name");
		userName=scan.nextLine();
		
		System.out.println("Please enter the Password");
		password=scan.nextLine();
		
		System.out.println("Please confirm the password");
		confirmPassword=scan.nextLine();
		
		if(!(password.isEmpty() && userName.isEmpty())) {
		
			if(!(password.length()>8)){
				
				if(!(password.contains(userName))) {
					
					if(!(password.equals(confirmPassword))){
						
						
					}else {
						System.out.println("User name and password is created");
					}
					
				}else {
					System.out.println("can not contain user name ");
				}
				
				
			}else {
				System.out.println("password too short");
			}
		}else {
			System.out.println("can't be empty");
			
		}
	}
}





