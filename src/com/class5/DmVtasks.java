package com.class5;

import java.util.Scanner;

public class DmVtasks {
	public static void main(String[] args) {
		int age;
		
		Scanner myScanner=new Scanner(System.in);
		System.out.println("what is your age");
		age=myScanner.nextInt();
		
		if(age>=18) {
			System.out.println("you can have the license");
		}else {
			System.out.println("you can't have the license");
		}
	}

}
