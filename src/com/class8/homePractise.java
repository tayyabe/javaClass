package com.class8;

import java.util.Scanner;

public class homePractise {
	public static void main(String[] args) {
		
		String userName;
		String password;
		String confirmPassword;
		
		Scanner scan =new Scanner(System.in);
		System.out.println("please enter user name");
	    userName=scan.nextLine();
	    
	    System.out.println("please enter the password");
	    password=scan.nextLine();
	     System.out.println("please enter confirm Password");
	     confirmPassword=scan.nextLine();
	    
	    
	    if(!(userName.isEmpty()&& password.isEmpty())) {
	    if(password.length()>=8) {
	    if(!(password.contains(userName))){
	    if(password.equals(confirmPassword)) {
	    	System.out.println("created");
	    	
	    }else {
	    	System.out.println("password do not match");
	    }
	    	
	    }else {
	    	System.out.println("password can't conatin user name");
	    }
	    }else{
	    	System.out.println("password is short");
	    }
   
	}else {
		System.out.println("can't be empty ");
	}
	    				
	}
}

	


