package com.class5;

import java.util.Scanner;

public class scannerClass {
	public static void main(String[] args) {
		//take a number from a user and print that number
		
		Scanner scanner=new Scanner(System.in);
        System.out.println("In:");
        String name=scanner.nextLine();
        
        if (name=="chen"){
        	System.out.println("teacher");
        }else {
        	System.out.println("student");
        }
	}

}
